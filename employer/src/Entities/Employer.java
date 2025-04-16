package Entities;

public class Employer {
    public String name;
    public Double grossSalary;
    public Double tax;

    public double NetSalary() {
        return grossSalary - tax;
    }
    public int percent;
    public void IncreseSalary(int percent) {
        this.percent = percent;
        grossSalary += grossSalary * percent / 100;
    }

    public String toString() {
        return "Employer " + name + ", " + "$ " + NetSalary();
    }
}

