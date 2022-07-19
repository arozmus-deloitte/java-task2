package Animal;

public class Mammal extends Animal{
    private String color;

    public Mammal(int numberOfLegs, String color) {
        super(numberOfLegs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
