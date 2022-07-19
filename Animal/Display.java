package Animal;

public class Display
{
    public static void displayAnimal(Container<? extends Animal> container)
    {
        System.out.println("---Display animal---");
        System.out.println("Number of legs: " + container.getValue().getNumberOfLegs());
    }

    public static void displayMammal(Container<? extends Mammal> container)
    {
        System.out.println("---Display mammal---");
        System.out.println("Number of legs: " + container.getValue().getNumberOfLegs());
        System.out.println("Color: " + container.getValue().getColor());
    }

    public static void displayCat(Container<? extends Cat> container)
    {
        System.out.println("---Display cat---");
        System.out.println("Number of legs: " + container.getValue().getNumberOfLegs());
        System.out.println("Color: " + container.getValue().getColor());
        System.out.println("Name: " + container.getValue().getName());
    }

    public static void main(String[] args) {
        Animal animal = new Animal(4);
        Mammal mammal = new Mammal(4,"Black");
        Cat cat = new Cat(4,"Black","Kizia");

        Container<Animal> containerAnimal = new Container<>(animal);
        Container<Mammal> containerMammal = new Container<>(mammal);
        Container<Cat> containerCat = new Container<>(cat);

        displayAnimal(containerAnimal);
        displayAnimal(containerMammal);
        displayAnimal(containerCat);

        //displayMammal(containerAnimal); <- This doesn't work
        displayMammal(containerMammal);
        displayMammal(containerCat);


        //displayCat(containerAnimal); <- This doesn't work
        //displayCat(containerMammal); <- This doesn't work
        displayCat(containerCat);
    }
}