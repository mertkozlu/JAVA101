package Kodlamaio.OverridingDemo;

import Kodlamaio.OverridingDemo.BaseCrediManager;

public class StudentCreditManager extends BaseCrediManager {
    public double calculate(double amount) {
        return amount * 1.1;
    }
}
