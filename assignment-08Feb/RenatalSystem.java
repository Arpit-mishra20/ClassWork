import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver Name: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }
}

class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class VehicleGPS implements GPS {
    private String currentLocation;

    public VehicleGPS(String initialLocation) {
        this.currentLocation = initialLocation;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

public class RenatalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C001", "Alice", 10.0));
        vehicles.add(new Bike("B002", "Bob", 5.0));
        vehicles.add(new Auto("A003", "Charlie", 7.0));

        double distance = 15.0;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            System.out.println();
        }

        VehicleGPS vehicleGPS = new VehicleGPS("Location A");
        System.out.println("Current Location: " + vehicleGPS.getCurrentLocation());
        vehicleGPS.updateLocation("Location B");
        System.out.println("Updated Location: " + vehicleGPS.getCurrentLocation());
    }
}