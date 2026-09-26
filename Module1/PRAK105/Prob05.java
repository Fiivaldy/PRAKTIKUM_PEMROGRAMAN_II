package Module1.PRAK105;
import java.util.Scanner;

public class Prob05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Masukkan jari-jari : ");
        double radius = input.nextDouble();

        System.out.print("Masukkan tinggi : ");
        double height = input.nextDouble();

        double cylinderVolume = PI * radius * radius * height;
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", radius, height, cylinderVolume);
    }
}