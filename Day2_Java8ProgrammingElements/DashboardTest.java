package JavaFeature.Day2_Java8ProgrammingElements;
interface VehicleDashboard {
    void displaySpeed();
    default void displayBattery() { System.out.println("Battery: 100%"); }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Speed: 80 km/h"); }
}

public class DashboardTest {
    public static void main(String[] args) {
        VehicleDashboard car = new ElectricCar();
        car.displaySpeed();
        car.displayBattery();
    }
}
