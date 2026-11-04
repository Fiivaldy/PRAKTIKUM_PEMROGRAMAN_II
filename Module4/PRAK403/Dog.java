package Module4.PRAK403;

public class Dog extends Pet {
    private String furColor;
    private String[] abilities;

    public Dog(String petName, String petBreed,String furColor, String[] abilities) {
        super(petName, petBreed);
        this.furColor = furColor;
        this.abilities = abilities;
    }

    public void displayDogDetails() {
        super.display();
        System.out.println("Memiliki warna bulu : " + furColor);
        System.out.print("Memiliki kemampuan : ");

        for (String ability : abilities) {
            System.out.print(ability + " ");
        }
    }
}