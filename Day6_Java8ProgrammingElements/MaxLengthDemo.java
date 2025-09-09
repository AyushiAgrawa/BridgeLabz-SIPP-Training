package JavaFeature.Day6_Java8ProgrammingElements;

import java.lang.annotation.Retention;
import java.text.DateFormat.Field;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength { int value(); }

class User {
    @MaxLength(10)
    String username;
    User(String username) {
        try {
            java.lang.reflect.Field f = this.getClass().getDeclaredField("username");
            MaxLength ml = f.getAnnotation(MaxLength.class);
            if(username.length() > ml.value()) throw new IllegalArgumentException();
            this.username = username;
        } catch(Exception e) {}
    }
}

public class MaxLengthDemo {
    public static void main(String[] args) {
        new User("ShortName");
    }
}
