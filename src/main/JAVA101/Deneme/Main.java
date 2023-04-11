package Deneme;

public class Main {
    public static void main(String[] args) {

        Bicycle salcano = new Bicycle("Salcano",2,"Black",4, 20);
        salcano.addBicycle();

        Bicycle bianchi = new Bicycle();
        bianchi.name =  "Bian X17";
        bianchi.speed = 5;
        bianchi.increaseSpeed(5);
        bianchi.printSpeedGear();

        Bicycle carraro = new Bicycle();
        carraro.name =  "Carr A5";
        carraro.speed = 5;
        carraro.increaseSpeed(15);
        carraro.decreaseSpeed(5);
        carraro.printSpeedGear();








    }
}
