package Kodlamaio.OverridingDemo;

import Kodlamaio.OverridingDemo.BaseCrediManager;

public class Main {
    public static void main(String[] args) {
        BaseCrediManager[] creditManagers = new BaseCrediManager[] {new TeacherCreditManager(), new AgricultureCreditManager(), new StudentCreditManager()};

        for (BaseCrediManager creditManager : creditManagers) {
            System.out.println(creditManager.calculate(10000));
        }

    }
}
