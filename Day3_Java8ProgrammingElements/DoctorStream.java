package JavaFeature.Day3_Java8ProgrammingElements;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;
    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name; this.specialty = specialty; this.availableOnWeekend = availableOnWeekend;
    }
    public String toString() { return name + " - " + specialty; }
}

public class DoctorStream {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Sameer", "Cardiology", true),
            new Doctor("Dr. Luv", "Orthopedics", false),
            new Doctor("Dr. Aman", "Neurology", true)
        );

        doctors.stream()
               .filter(d -> d.availableOnWeekend)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(System.out::println);
    }
}
