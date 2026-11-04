package Module4.PRAK402;

public class Pet {
    private String petName;
    private String petBreed;

    public Pet(String petName, String petBreed){
        this.petName = petName;
        this.petBreed = petBreed;
    }

    public void display(){
        System.out.println("Detail Hewan Peliharaan : ");
        System.out.println("Nama Hewan Peliharaan : " + petName);
        System.out.println("Dengan ras : " + petBreed);
    }
}