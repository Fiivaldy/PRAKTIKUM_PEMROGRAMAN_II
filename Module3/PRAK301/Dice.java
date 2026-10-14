package Module3.PRAK301;

import java.util.Random;

public class Dice {
    private int number;

    public Dice() {
        this.number = rollNumber();
    }

    private int rollNumber() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public int getNumber() {
        return number;
    }
}