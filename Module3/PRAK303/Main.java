package Module3.PRAK303;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String nameStudent = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String idStudent = input.nextLine();

                    boolean doesIdAlreadyExist = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getIdStudent().equals(idStudent)) {
                            doesIdAlreadyExist = true;
                            System.out.println("NIM " + idStudent + " sudah ada.");
                            break;
                        }
                    }

                    if (doesIdAlreadyExist) {
                        System.out.println("NIM " + idStudent + " sudah ada.");
                    } else {
                        students.add(new Student(idStudent, nameStudent));
                        System.out.println("Mahasiswa " + nameStudent + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    idStudent = input.nextLine();

                    boolean isIdFound = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getIdStudent().equals(idStudent)) {
                            students.remove(i);
                            isIdFound = true;
                            break;
                        }
                    }

                    if (isIdFound) {
                        System.out.println("Mahasiswa dengan NIM " + idStudent + " dihapus.");
                    } else {
                        System.out.println("NIM " + idStudent + " tidak ditemukan.");
                    }
                    break;


                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    idStudent = input.nextLine();

                    isIdFound = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getIdStudent().equals(idStudent)) {
                            System.out.println("NIM: " + students.get(i).getIdStudent() + ", Nama: " + students.get(i).getName());
                            isIdFound = true;
                            break;
                        }
                    }

                    if (!isIdFound) {
                        System.out.println("NIM " + idStudent + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    if (students.isEmpty()) {
                        System.out.println("Belum ada mahasiswa.");
                    } else {
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println("NIM: " + students.get(i).getIdStudent() + ", Nama: " + students.get(i).getName()
                            );
                        }
                    }
                    break;

                case 0:
                    students.clear();
                    System.out.println("Terima kasih!");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
