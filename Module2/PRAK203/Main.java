package Module2.PRAK203;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        /*
        Untuk menyesuaikan output soal setter age diperlukan
        e.name = "Roi"
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
        */
        e.setName("Roi");
        e.setOrigin("Kingdom Of Orvel");
        e.setRole("Assasin");
        e.setAge(17);

        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        /*
        Kurang nya tanda kurung menyebabkan error
        System.out.println("Jabatan: " + e.role);
        System.out.println("Umur: " + e.age);
         */
        System.out.println("Jabatan: " + e.getRole());
        System.out.println("Umur: " + e.getAge() + " tahun");
    }
}