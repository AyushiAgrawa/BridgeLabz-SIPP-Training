package JavaFeature.Day2_Java8ProgrammingElements;

import java.util.function.Function;

public class StringLengthCheck {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = s -> s.length();
        String message = "Hello World!";
        System.out.println("Length: " + lengthChecker.apply(message));
    }
}
