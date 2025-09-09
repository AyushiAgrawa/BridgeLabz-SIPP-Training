package JavaFeature.Day4_ProgrammingElements;

import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double total;
    Order(String customer, double total) { this.customer = customer; this.total = total; }
}

public class OrderRevenue {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 250.5),
            new Order("Bob", 100.0),
            new Order("Alice", 150.0)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
            .collect(Collectors.groupingBy(o -> o.customer, Collectors.summingDouble(o -> o.total)));

        System.out.println(revenueByCustomer);
    }
}
