package Kodlamaio.InheritanceDemo;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.creditCalc(new TransportCreditManager());
    }

}
