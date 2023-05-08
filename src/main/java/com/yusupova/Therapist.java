package com.yusupova;

public class Therapist extends Doctor {

    public final int THERAPISTSHOURLYRATE = 3000;

    public Therapist(String name, int experience) {
        super(name, experience);
    }

    @Override
    public void introduce() {
        System.out.println("Врач-терапевт " + getName() + ", " + "стаж " + getExperience()  + " лет.");
    }

    @Override
    public void getDailySalary(int customerCount) {
        if(customerCount < 5){
            System.out.println("Сегодня было меньше 5ти пациентов, заработал " + customerCount * THERAPISTSHOURLYRATE * 0.8 + " рублей");
        } else {
            System.out.println("Тяжелый день, заработал " + customerCount * THERAPISTSHOURLYRATE + " рублей");
        }
    }
}
