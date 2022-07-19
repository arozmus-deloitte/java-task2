package Animal;

public class Cat extends Mammal {
    public String name;

    public Cat(int numberOfLegs, String color, String name) {
        super(numberOfLegs, color);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
