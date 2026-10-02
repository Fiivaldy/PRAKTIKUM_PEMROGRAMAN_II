package Module2.PRAK202;

import java.util.Locale;

public class Coffee {

    private String name;
    private String size;
    private int price;
    private String customer;


    public void printInfo() {
        Locale.setDefault(Locale.US); // Ini terserah mau ada atau tidak
        System.out.println("Nama Kopi : " + name);
        System.out.println("Ukuran : " + size);

    }


    public void setCoffeeName(String coffeeName){
        this.name = coffeeName;
    }
    public void setSize(String coffeeSize){
        this.size = coffeeSize;
    }
    public void setCostumer(String Customer){
        this.customer = Customer;
    }
    public void setPrice(int Price){
        this.price = Price;
    }


    public double getTax(){
        return 0.11 * this.price;
    }
    public String getCustomer(){
        return customer;
    }
}