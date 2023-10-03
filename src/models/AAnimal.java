package models;

// Abstract class - marked by keyword: abstract
// Can inherit from both: Interface & Abstract classes
public abstract class AAnimal {

    // Includes abstract, excludes body: {}
    public abstract void eat();

    //Ordinary method - excludes abstract
    public void makeSound() {
        System.out.println("Some random animal noise");

    }

}
