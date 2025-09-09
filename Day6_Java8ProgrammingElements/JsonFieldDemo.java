package JavaFeature.Day6_Java8ProgrammingElements;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField { String name(); }

class User {
    @JsonField(name="user_name")
    String username;
    @JsonField(name="user_age")
    int age;
    User(String u,int a){ username=u; age=a; }
}

public class JsonFieldDemo {
    public static void main(String[] args) throws Exception {
        User u = new User("Alice",25);
        StringBuilder sb = new StringBuilder("{");
        for(Field f: User.class.getDeclaredFields()){
            JsonField jf = f.getAnnotation(JsonField.class);
            if(jf!=null){
                f.setAccessible(true);
                sb.append("\"").append(jf.name()).append("\":\"").append(f.get(u)).append("\",");
            }
        }
        sb.deleteCharAt(sb.length()-1).append("}");
        System.out.println(sb);
    }
}
