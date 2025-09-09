package JavaFeature.Day2_Java8ProgrammingElements;
interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON"); }
    public void turnOff() { System.out.println("Light turned OFF"); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC turned ON"); }
    public void turnOff() { System.out.println("AC turned OFF"); }
}

class TV implements SmartDevice {
    public void turnOn() { System.out.println("TV turned ON"); }
    public void turnOff() { System.out.println("TV turned OFF"); }
}

public class DeviceTest {
    public static void main(String[] args) {
        SmartDevice[] devices = {new Light(), new AC(), new TV()};
        for(SmartDevice device : devices) {
            device.turnOn();
            device.turnOff();
        }
    }
}
