package Module2.PRAK203;
/*
Untuk atribut diperlukan acces modifier private, tipe data pada origin diubah menjadi string
public class Pegawai {
    public String name;
    public char origin;
    public String role;
    public int age;
*/
public class Employee {
    private String name;
    private String origin;
    private String role;
    private int age;

    /*
    Pada baris ini diperlukan getter tambahan untuk attribut role dan age
    public String getName() {
        return name;
    }
    public String getOrigin(){
        return origin;
    }
     */
    public String getName() {
        return name;
    }
    public String getOrigin() {
        return origin;
    }
    public String getRole() {
        return role;
    }
    public int getAge() {
        return age;
    }

    /*
    Penambahan setter untuk attribut selain role dan penulisasn variabel yang dituju
        this.role = r;
    }
    */

    public void setRole(String role) {
        this.role = role;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public void setAge(int age) {
        this.age = age;
    }
}