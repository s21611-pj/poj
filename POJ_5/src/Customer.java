/**
 * Exercise 5 - Customer
 * Author: Wojtek Turek
 */

public class Customer {
    private int ID;
    private String name;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        if(discount >= 0 && discount <= 100) {
            this.discount = discount;
        }
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        if(discount >= 0 && discount <= 100) {
            this.discount = discount;
        }
    }

    @Override
    public String toString() {
        return name + "(" + ID + ")";
    }

    public static void main(String[] args) {
        var x = new Customer(3456, "Wojtek", 90);
        System.out.println(x);
        x.setDiscount(101);
        System.out.println(x);
    }
}
