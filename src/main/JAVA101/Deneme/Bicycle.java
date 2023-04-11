package Deneme;

public class Bicycle {
    String name;
    int wheelNumber;
    String color;
    int gearNumber;
    int speed;

    Bicycle(String name, int wheelNumber, String color, int gearNumber, int speed) {
        this.name = name;
        this.wheelNumber = wheelNumber;
        this.color = color;
        this.gearNumber = 3;
        this.speed = 20;
    }

    Bicycle () {

    }

    void increaseSpeed(int increment){
        if (speed < 20) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            this.speed -= decrease;
        }
    }

    void gearShift(int gearNumber) {
        if(speed >= 5) {
            this.gearNumber = 1;
        } else if (speed <= 10 && speed > 5 ) {
            this.gearNumber = 2;
        } else if (speed <= 15 && speed > 10) {
            this.gearNumber = 3;
        }else {
            this.gearNumber = 4;
        }
    }
    void printSpeedGear() {
        System.out.println("\n" + this.name + "\nHızınız :" + speed + "\nVites : " + gearNumber);
    }

    void addBicycle() {
        System.out.println("\nMarka\t:" + name);
        System.out.println("Teker\t:" + wheelNumber);
        System.out.println("Renk\t:" + color);
        System.out.println("Vites\t:" + gearNumber);
        System.out.println("Hız \t:" + speed);

    }





}
