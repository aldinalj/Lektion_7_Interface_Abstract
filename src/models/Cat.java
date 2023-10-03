package models;

public class Cat implements Animal {
    @Override
    public void name() {

    }

    @Override
    public void move() {
        System.out.println("Moves graciously");
    }

    @Override
    public void eat() {
        System.out.println("Nom nom nom");

    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 90% of the time");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
