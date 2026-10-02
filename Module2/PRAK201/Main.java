package Module2.PRAK201;
import  java.util.Locale;

public class Main{
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);

        Fruit manggo = new Fruit("Mangga", 0.2f, 3500f, 15.0f);
        Fruit apple = new Fruit("Apel", 0.4f, 7000f, 40.0f );
        Fruit avocado = new Fruit("Alpukat", 0.25f, 10000f, 12.0f);
        apple.printInfo();
        manggo.printInfo();
        avocado.printInfo();
    }
}
