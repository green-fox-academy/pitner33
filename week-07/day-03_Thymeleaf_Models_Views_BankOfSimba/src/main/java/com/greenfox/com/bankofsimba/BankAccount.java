package com.greenfox.com.bankofsimba;

public class BankAccount {
    private String name;
    private Float balance;
    private String animalType;
    private boolean isKing;
    private String badOrGood;

    public BankAccount(String name, Float balance, String animalType, String badOrGood) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = getIsKing();
        this.badOrGood = badOrGood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean getIsKing() {
        return animalType.contains("King");
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public String getBadOrGood() {
        return badOrGood;
    }

    public void setBadOrGood(String badOrGood) {
        this.badOrGood = badOrGood;
    }
}
