package Module4.PRAK403;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan : ");
        int choose = Integer.parseInt(input.nextLine());

        if (choose == 1){
            System.out.print("Masukkan hewan peliharaan : ");
            String petName = input.nextLine();

            System.out.print("Ras : ");
            String petBreed = input.nextLine();

            System.out.print("Warna Bulu : ");
            String furColor = input.nextLine();

            Cat cat = new Cat(petName, petBreed, furColor);
            cat.displayCatDetails();

        } else if (choose == 2) {
            System.out.print("Masukkan hewan peliharaan : ");
            String petName = input.nextLine();

            System.out.print("Ras : ");
            String petBreed = input.nextLine();

            System.out.print("Warna Bulu : ");
            String furColor = input.nextLine();

            System.out.print("Kemampuan : ");
            String[] abilities = input.nextLine().split(", ");

            Dog dog = new Dog(petName, petBreed,furColor, abilities);
            dog.displayDogDetails();
        }
    }
}