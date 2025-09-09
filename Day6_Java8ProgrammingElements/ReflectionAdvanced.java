package JavaFeature.Day6_Java8ProgrammingElements;
import java.lang.reflect.*;
import java.util.*;

interface Greeting { void sayHello(); }

class GreetingImpl implements Greeting {
    public void sayHello() { System.out.println("Hello!"); }
}

class DIContainer {
    public static <T> T getInstance(Class<T> clazz) throws Exception {
        return clazz.getDeclaredConstructor().newInstance();
    }
}

public class ReflectionAdvanced {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> props) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Map.Entry<String, Object> e : props.entrySet()) {
            Field f = clazz.getDeclaredField(e.getKey());
            f.setAccessible(true);
            f.set(obj, e.getValue());
        }
        return obj;
    }

    public static String toJSON(Object obj) throws Exception {
        StringBuilder sb = new StringBuilder("{");
        for (Field f : obj.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            sb.append("\"").append(f.getName()).append("\":\"").append(f.get(obj)).append("\",");
        }
        sb.deleteCharAt(sb.length() - 1).append("}");
        return sb.toString();
    }

    public static <T> T createLoggingProxy(T impl, Class<T> iface) {
        return (T) Proxy.newProxyInstance(iface.getClassLoader(), new Class<?>[]{iface},
            (proxy, method, args) -> {
                System.out.println(method.getName());
                return method.invoke(impl, args);
            });
    }

    public static void measureExecutionTime(Object obj, String methodName) throws Exception {
        Method m = obj.getClass().getMethod(methodName);
        long start = System.nanoTime();
        m.invoke(obj);
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Alice");
        data.put("id", 101);
        class Student { public String name; public int id; }
        Student s = toObject(Student.class, data);
        System.out.println(toJSON(s));

        Greeting g = createLoggingProxy(new GreetingImpl(), Greeting.class);
        g.sayHello();

        class Sample { public void task() { for(int i=0;i<1000;i++); } }
        measureExecutionTime(new Sample(), "task");

        Sample sample = DIContainer.getInstance(Sample.class);
        System.out.println(sample);
    }
}
