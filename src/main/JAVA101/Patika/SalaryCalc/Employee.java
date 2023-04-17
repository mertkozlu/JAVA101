package Patika.SalaryCalc;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee (String name, double salary, int workHours,int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary >= 1000) {
            return salary * 0.03;
        }else {
            return 0;
        }
    }

    public double bonus() {
        if(workHours > 40) {
           return (this.workHours - 40) * 30;
        }else {
            return 0;
        }

    }


    public double raiseSalary() {
        int yearsWorked = 2023 - this.hireYear;
        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (hireYear >= 10 && hireYear < 20) {
            return this.salary * 0.1;
        }else {
            return this.salary * 0.15;
        }
    }

    public void printEmploye (){
        System.out.println("Adı\t: " + this.name);
        System.out.println("Başlangıç yılı \t: " + this.hireYear);
        System.out.println("Haftalık Çalışma Saati\t: " + this.workHours);
        System.out.println("Maaşı\t: " + this.salary);
        System.out.println("Vergi\t: " + tax());
        System.out.println("Bonus\t:" + bonus());
        System.out.println("Maaş atışı\t:" + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş\t:" + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş\t:" + (this.salary + bonus() + raiseSalary() - tax()));
    }

}
