package Workshop;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.*;

interface TransportService {
    String getServiceName();
    LocalTime getDepartureTime();
    double getFare();
    default void printServiceDetails() {
        System.out.println(getServiceName() + " departs at " + getDepartureTime() + " | Fare: $" + getFare());
    }
}

interface GeoUtils {
    static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        return Math.sqrt(Math.pow(lat2 - lat1, 2) + Math.pow(lon2 - lon1, 2));
    }
}

@FunctionalInterface
interface FareCalculator {
    double calculateFare(double baseFare, double distanceKm);
}

interface EmergencyService {}

class BusService implements TransportService {
    private String name;
    private LocalTime departureTime;
    private double fare;
    public BusService(String name, LocalTime departureTime, double fare) {
        this.name = name; this.departureTime = departureTime; this.fare = fare;
    }
    public String getServiceName() { return name; }
    public LocalTime getDepartureTime() { return departureTime; }
    public double getFare() { return fare; }
}

class MetroService implements TransportService {
    private String name;
    private LocalTime departureTime;
    private double fare;
    public MetroService(String name, LocalTime departureTime, double fare) {
        this.name = name; this.departureTime = departureTime; this.fare = fare;
    }
    public String getServiceName() { return name; }
    public LocalTime getDepartureTime() { return departureTime; }
    public double getFare() { return fare; }
}

class AmbulanceService implements TransportService, EmergencyService {
    private String name;
    private LocalTime departureTime;
    private double fare;
    public AmbulanceService(String name, LocalTime departureTime, double fare) {
        this.name = name; this.departureTime = departureTime; this.fare = fare;
    }
    public String getServiceName() { return name; }
    public LocalTime getDepartureTime() { return departureTime; }
    public double getFare() { return fare; }
}

public class SmartCityTransportSystem {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
            new BusService("Bus-101", LocalTime.of(9, 0), 2.5),
            new MetroService("Metro-A", LocalTime.of(9, 15), 3.0),
            new BusService("Bus-102", LocalTime.of(10, 0), 2.0),
            new AmbulanceService("Ambulance-1", LocalTime.of(9, 5), 0.0)
        );

        List<TransportService> filtered = services.stream()
            .filter(s -> s.getFare() < 3)
            .sorted(Comparator.comparing(TransportService::getDepartureTime))
            .collect(Collectors.toList());

        filtered.forEach(TransportService::printServiceDetails);

        DoubleSummaryStatistics stats = services.stream()
            .collect(Collectors.summarizingDouble(TransportService::getFare));
        System.out.println("Total Fare: $" + stats.getSum() + " | Average Fare: $" + stats.getAverage());

        Map<String, List<String>> passengersByRoute = new HashMap<>();
        passengersByRoute.put("Route-1", Arrays.asList("Alice", "Bob"));
        passengersByRoute.put("Route-2", Arrays.asList("Charlie", "David"));

        Map<String, Long> passengerCount = passengersByRoute.entrySet().stream()
            .collect(Collectors.toMap(Map.Entry::getKey, e -> (long)e.getValue().size()));

        passengerCount.forEach((route, count) -> System.out.println(route + ": " + count));

        FareCalculator calculator = (base, distance) -> base + distance * 0.5;
        System.out.println("Fare for 10km: $" + calculator.calculateFare(2.0, 10));

        services.stream()
            .filter(s -> s instanceof EmergencyService)
            .forEach(s -> System.out.println(s.getServiceName() + " (Emergency Priority)"));
    }
}
