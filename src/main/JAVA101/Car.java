public class Car {
    // nitelikler
    String type;
    String model;
    String color;
    // davranışlar
    int speed;
    int speedLimit = 180;

    void increaseSpeed(int increment) {
        if((speed + increment) < 180) {
            speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if(speed > 0) {
            speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println(model + " Hızınız : " + speed);
    }

}
