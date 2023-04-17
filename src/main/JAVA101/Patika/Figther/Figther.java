package Patika.Figther;

public class Figther {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;


    Figther (String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Figther foe){
        System.out.println(" ");
        System.out.println(this.name + " --> " + foe.name +"'a "+ this.damage  + " hasar vurdu !" );

        if (foe.dodge()){
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomWalue = Math.random() * 100;
        return randomWalue <= this.dodge;
    }


}
