public class AbstractClass {
    public static void main(String[] args) {
        Car car1 = new AdvancedBMW();

        car1.playMusic();
        car1.drive();
        car1.fly();
    }
}

// abstract class can't create objects
abstract class Car {
    abstract public void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class BMW extends Car{
    public void drive() {
        System.out.println("drive BMW");
    }
}

// concreet class
class AdvancedBMW extends BMW{
    public void fly() {
        System.out.println("fly BMW");
    }
}