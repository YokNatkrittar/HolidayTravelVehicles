import java.util.ArrayList;

public class Vehicle {
    private int vehicleSerialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private int baseCost;

    private Customer Customer;
    private ArrayList<Salesperson> Salesperson;
    private ArrayList<Vehicle> Vehicle;

    public Vehicle(int vehicleSerialNumber, String name, String model, int year, String manufacturer, int baseCost) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public String toString() {
        return "Vehicle Information:\n" +
        "Serial Number: " + vehicleSerialNumber + "\n" +
        "Name: " + name + "\n" +
        "Model: " + model + "\n" +
        "Year: " + year + "\n" + 
        "Manufacturer: " + manufacturer + "\n" +
        "Base Cost: $" + baseCost;
    }
}
