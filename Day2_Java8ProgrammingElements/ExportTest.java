package JavaFeature.Day2_Java8ProgrammingElements;

interface Exportable {
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() { System.out.println("Exported data to JSON"); }
}

class Report implements Exportable {
    public void exportToCSV() { System.out.println("CSV exported"); }
    public void exportToPDF() { System.out.println("PDF exported"); }
}

public class ExportTest {
    public static void main(String[] args) {
        Report r = new Report();
        r.exportToCSV();
        r.exportToPDF();
        r.exportToJSON();
    }
}
