package Module4.PRAK403;

public class Cat extends Pet {
    private String furColour;

    public Cat(String petName, String petBreed, String furColour) {
        super(petName, petBreed);
        this.furColour = furColour;
    }

    public void displayCatDetails() {
        super.display();
        System.out.println("Memiliki warna Bulu : " + furColour);
    }
}
