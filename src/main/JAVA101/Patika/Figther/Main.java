package Patika.Figther;

public class Main {
    public static void main(String[] args) {
        Figther mert = new Figther("Mert", 10, 120,72,10);
        Figther hakan = new Figther("Emre", 10,120,85,10);

        Ring round = new Ring(mert,hakan,70,100);
        round.fight();

    }



}
