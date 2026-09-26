package Module1.PRAK101;

import java.util.Scanner;

public class Prob01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap : ");
        String name = input.nextLine();

        System.out.print("Masukkan Tempat Lahir : ");
        String birthPlace = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir : ");
        int birthDate  = input.nextInt();

        System.out.print("Masukkan Bulan Lahir : ");
        int birthMonth = input.nextInt();

        System.out.print("Masukkan Tahun Lahir : ");
        int birthYear = input.nextInt();

        System.out.print("Masukkan Berat Badan : ");
        int height  = input.nextInt();

        System.out.print("Masukkan Berat Badan : ");
        float weight  = input.nextFloat();

        String monthCase = switch (birthMonth) {
            case 1 -> "Januari";
            case 2 -> "Febuari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "Bulan Invalid";
        };

        System.out.println("Nama Lengkap " + name + " Lahir di " + birthPlace + " pada Tanggal " + birthDate + " " + monthCase + " " + birthYear + " Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram" );
    }
}