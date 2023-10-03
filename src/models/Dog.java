package models;

public class Dog implements Animal {
    @Override
    public void name() {

    }

    @Override
    public void move() {
        System.out.println("Runs frantically");
    }

    @Override
    public void eat() {
        System.out.println("Devours everything");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 50% of the time");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");

    }
}
