public class CarRental {
    private String customerName;
    private char carModel;
    private int rentalDays;

    CarRental(String customerName, char carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    void totalCost() {
        if (carModel == 'A') {
            System.out.println(3000 * rentalDays);
        } else if (carModel == 'B') {
            System.out.println(2000 * rentalDays);
        } else {
            System.out.println(1000 * rentalDays);
        }
    }

    public static void main(String[] args) {
        CarRental ob = new CarRental("arpit", 'B', 2);
        ob.totalCost();
    }
}
