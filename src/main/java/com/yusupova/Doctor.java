package com.yusupova;

public class Doctor extends Human {

    private int experience;

    public int getExperience() {
        return experience;
    }

    public Doctor(String name) {
        super(name);
    }

    public Doctor(String name, int experience) {
        super(name);
        this.experience = experience;
    }

    public void introduce() {}

    public void getDailySalary(int customerCount) {}

    public void changeName (String newName) {
        setName(newName);
    }
}
