import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;

    Alert(String message, String type) { this.message = message; this.type = type; }

    public String toString() { return type + ": " + message; }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Low blood pressure", "Health"),
            new Alert("Medication reminder", "Reminder"),
            new Alert("Appointment scheduled", "Reminder")
        );

        Predicate<Alert> onlyReminders = a -> a.type.equals("Reminder");

        alerts.stream().filter(onlyReminders).forEach(System.out::println);
    }
}
