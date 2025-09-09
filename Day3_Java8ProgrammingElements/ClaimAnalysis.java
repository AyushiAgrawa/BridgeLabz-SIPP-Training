package JavaFeature.Day3_Java8ProgrammingElements;
import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String type;
    double amount;
    Claim(String type, double amount) { this.type = type; this.amount = amount; }
}

public class ClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 5000),
            new Claim("Vehicle", 2000),
            new Claim("Health", 7000),
            new Claim("Vehicle", 3000)
        );

        Map<String, Double> avgClaim = claims.stream()
            .collect(Collectors.groupingBy(c -> c.type, Collectors.averagingDouble(c -> c.amount)));

        avgClaim.forEach((type, avg) -> System.out.println(type + ": " + avg));
    }
}
