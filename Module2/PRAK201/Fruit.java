package Module2.PRAK201;

public class Fruit {

    private String fruitName;
    private float fruitWeight;
    private float fruitPrice;
    private float amountPurchase;


    public Fruit(String fruitName, float fruitWeight, float fruitPrice, float amountPurchase) {
        this.fruitName = fruitName;
        this.fruitWeight = fruitWeight;
        this.amountPurchase = amountPurchase;
        this.fruitPrice = fruitPrice;
    }

    public void printInfo() {
        System.out.println("Nama Buah : " + fruitName);
        System.out.println("Berat : " + fruitWeight);
        System.out.println("Jumlah Beli : " + amountPurchase + " Kg");
        System.out.printf("Harga Sebelum Diskon : Rp%.2f", getPreDiscountPrice());
        System.out.printf("\nTotal Diskon : %.2f", getDiscountTotal());
        System.out.printf("\nHarga Setelah Diskon : %.2f", getPostDiscountPrice());
        System.out.println("\n");
    }


    public double getPreDiscountPrice() {
        return fruitPrice * amountPurchase / fruitWeight;
    }


    public double getDiscountTotal() {
        int multiple = (int) (amountPurchase / 4);
        return multiple * 4 * 0.02 * fruitPrice;
    }
    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}

