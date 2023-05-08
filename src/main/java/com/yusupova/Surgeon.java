package com.yusupova;

public class Surgeon extends Doctor implements Operate {

    public final int SURGEONSHOURLYRATE = 12000;

    public Surgeon(String name) {
        super(name);
    }

    public Surgeon(String name, int experience) {
        super(name, experience);
    }

    @Override
    public void introduce() {
        System.out.println("Хирург " + getName() + ", " + "стаж " + getExperience()  + " лет.");
    }

    @Override
    public void getDailySalary(int customerCount) {
        if(customerCount > 3){
            System.out.println("Было много операций, заработал " + customerCount * SURGEONSHOURLYRATE * 2 + " рублей");
        } else {
            System.out.println("Мало пациентов, заработал " + customerCount * SURGEONSHOURLYRATE + " рублей");
        }
    }

    @Override
    public void doOperation() {
        System.out.println("Как хирург, я оперирую внутренние органы");
    }
}
