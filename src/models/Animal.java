package models;
// Abstract -
// As a standard methods are public
// Uses keyword: implements
// Alt + Enter implements method
public interface Animal {

    /* TODO
        Give relevant names
        Implement inheritance
     */
    // Abstract method

    void name();
    void move();
    void eat();
    void sleep();
    void makeSound();
    default void typeOfAnimal(String typeOfAnimal) {
        System.out.println(typeOfAnimal);
    }

}
