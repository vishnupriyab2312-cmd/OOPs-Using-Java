package exp6;
interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {

    String brand;
    int screenSize;
    boolean status;

    SmartTV(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.status = false;
    }

    public void turnOn() {
        status = true;
        System.out.println("Smart TV is turned on");
    }

    public void turnOff() {
        status = false;
        System.out.println("Smart TV is turned off");
    }

    void displayAppliance() {
        System.out.println("Appliance Type: Smart TV");
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}

public class Exp6 {
    public static void main(String[] args) {

        System.out.println("SMART HOME APPLIANCE SYSTEM:");

        SmartTV tv = new SmartTV("Samsung", 55);

        RemoteControl remote = tv;
        Appliance appliance = tv;

        System.out.println("Using Appliance parent reference:");
        appliance.displayAppliance();

        System.out.println("Using Remote Control interface:");
        remote.turnOn();

        System.out.println("After turning ON:");
        appliance.displayAppliance();

        remote.turnOff();

        System.out.println("After turning OFF:");
        appliance.displayAppliance();

        System.out.println("Program Completed");
    }
}