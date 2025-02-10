import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    private double additionalCharge;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity();
    }
}

interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

class DiscountedVegItem extends VegItem implements Discountable {
    private double discountPercentage;

    public DiscountedVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on " + getItemDetails() + ": " + discountPercentage + "%";
    }
}

class DiscountedNonVegItem extends NonVegItem implements Discountable {
    private double discountPercentage;

    public DiscountedNonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity, additionalCharge);
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on " + getItemDetails() + ": " + discountPercentage + "%";
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        DiscountedVegItem vegItem = new DiscountedVegItem("Veg Pizza", 10.0, 2);
        vegItem.applyDiscount(10);
        order.add(vegItem);
        
        DiscountedNonVegItem nonVegItem = new DiscountedNonVegItem("Chicken Burger", 15.0, 1, 2.0);
        nonVegItem.applyDiscount(5);
        order.add(nonVegItem);

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            System.out.println();
        }
    }
}