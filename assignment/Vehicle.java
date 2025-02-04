class Vehicle {
    private static double registrationFee = 6000.0;  

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }


    public static void main(String[] args) {
        Vehicle car = new Vehicle("Arpit", "Car", "CAR1234");
        Vehicle bike = new Vehicle("Bavesh", "Car", "CAR5678");

        System.out.println("Before Fee Update:");
        car.displayRegistrationDetails();
        bike.displayRegistrationDetails();

        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("\nAfter Fee Update:");
        car.displayRegistrationDetails();
        bike.displayRegistrationDetails();
    }
}