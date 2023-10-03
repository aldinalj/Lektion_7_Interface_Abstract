import models.Cat;
import models.Dog;
import models.Squirrel;

public class Main {
    public static void main(String[] args) {

        // Instantiate object
        Cat kasper = new Cat();
        Dog fido = new Dog();
        Squirrel benny = new Squirrel();

        benny.eat(); // Abstract method - implementation
        benny.makeSound(); // Ordinary method

        kasper.move();
        kasper.makeSound();
        kasper.sleep();
        kasper.typeOfAnimal("Cat");

        fido.eat();
        fido.move();
        fido.makeSound();
        fido.sleep();
        fido.typeOfAnimal("Dog");

    }
}