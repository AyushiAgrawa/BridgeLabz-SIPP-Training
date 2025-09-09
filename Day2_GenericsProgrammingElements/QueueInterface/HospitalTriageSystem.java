package Generics.Day2_GenericsProgrammingElements.QueueInterface;
import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public int compareTo(Patient other) {
        return other.severity - this.severity; // higher severity first
    }

    public String toString() {
        return name;
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
