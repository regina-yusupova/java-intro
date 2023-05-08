package com.yusupova;

public class Dentist extends Doctor implements Operate {

    public final double DENTISTSHOURLYRATE = 8000;

    public Dentist(String name) {
        super(name);
    }

    public Dentist(String name, int experience) {
        super(name, experience);
    }

    @Override
    public void introduce() {
        System.out.println("Врач-стоматолог " + getName() + ", " + "стаж " + getExperience() + " лет.");
    }

    @Override
    public void getDailySalary(int customerCount) {
        if(customerCount > 5){
            System.out.println("Плодотворный день, заработал " + customerCount * DENTISTSHOURLYRATE * 1.5 + " рублей");
        } else {
            System.out.println("Пациентов было немного, заработал " + customerCount * DENTISTSHOURLYRATE + " рублей");
        }
    }

    @Override
    public void doOperation() {
        System.out.println("Как стоматолог, я оперирую ротовую полость");
    }
}
