package Module1.PRAK103;
import java.util.Scanner;

public class Prob03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int startNumber = input.nextInt();

        int count = 0;
        while (count < n) {
            if (startNumber % 2 != 0) {
                System.out.print(startNumber);
                count++;

                if (count < n) {
                    System.out.print(", ");
                }
            }
            startNumber++;
        }
    }
}