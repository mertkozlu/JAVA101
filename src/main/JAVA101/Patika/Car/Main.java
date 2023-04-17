package Patika.Car;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 100,"Blue");
        audi.printInfo();

        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.decreaseSpeed(10);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        mercedes.increaseSpeed(100);
        mercedes.decreaseSpeed(20);
        mercedes.printSpeed();

    }
}
