package Patika.Figther;

public class Ring {
    Figther figtherOne;
    Figther figtherTwo;
    int minWeight;
    int maxWeight;

    Ring(Figther figtherOne, Figther figtherTwo, int minWeight, int maxWeight) {
        this.figtherOne = figtherOne;
        this.figtherTwo = figtherTwo;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }
    public void fight() {

        if(isCheck()){
            while (figtherOne.health > 0 && figtherTwo.health > 0) {
                System.out.println("\n============= YENİ ROUND =============");
                figtherTwo.health = figtherOne.hit(figtherTwo);
                if (isWin()) {
                    break;
                }
                figtherOne.health = figtherTwo.hit(figtherOne);
                if (isWin()) {
                    break;
                }
                printScore();
            }
        }else
            System.out.println("Aynı siklette değiller !");
    }

   public boolean isCheck() {
        return (this.figtherOne.weight >= minWeight && this.figtherOne.weight <= maxWeight) && (this.figtherTwo.weight >= minWeight && this.figtherTwo.weight <= maxWeight);
    }

    public boolean isWin() {
        if (figtherOne.health == 0) {
            System.out.println("Maçı Kazanan : " + figtherTwo.name);
            return true;
        } else if (figtherTwo.health == 0) {
            System.out.println("Maçı Kazanan : " + figtherOne.name);
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println();
        System.out.println(" ");
        System.out.println(figtherOne.name + " Kalan Can\t:" + figtherOne.health);
        System.out.println(figtherTwo.name + " Kalan Can\t:" + figtherTwo.health);


    }

}

