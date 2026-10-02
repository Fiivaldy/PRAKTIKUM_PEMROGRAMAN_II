package Module2.PRAK202;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setCoffeeName("Espresso");
        coffee.setSize("Medium");
        coffee.setPrice(25000);

        coffee.printInfo();
        coffee.setCostumer("Alice");
        System.out.println("Pembeli Kopi: " + coffee.getCustomer());
        System.out.println("Pajak Kopi: Rp. " + coffee.getTax());
    }
}