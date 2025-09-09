package JavaFeature.Day6_Java8ProgrammingElements;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed { String value(); }

class AdminActions {
    @RoleAllowed("ADMIN")
    void deleteUser() { System.out.println("User deleted"); }
}

public class RoleAllowedDemo {
    public static void main(String[] args) throws Exception {
        AdminActions aa = new AdminActions();
        String userRole = "USER";
        Method m = AdminActions.class.getMethod("deleteUser");
        RoleAllowed ra = m.getAnnotation(RoleAllowed.class);
        if(ra.value().equals(userRole)) m.invoke(aa);
        else System.out.println("Access Denied!");
    }
}
