package Animal;

public class Container<T> { //TODO - Good ;) if you work only on some specific hierarchy like here Animal-Mammal-Cat you can even write Container<T extends Animal> here, but that was not necessary in this task ;)
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
