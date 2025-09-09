package JavaFeature.Day2_Java8ProgrammingElements;
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHigh = temp -> temp > 38.0;
        double temp = 39.5;
        System.out.println("Temperature " + temp + " is high? " + isHigh.test(temp));
    }
}
