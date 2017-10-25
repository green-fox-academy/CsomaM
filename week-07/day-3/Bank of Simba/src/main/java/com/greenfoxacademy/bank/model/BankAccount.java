package com.greenfoxacademy.bank.model;

import java.text.DecimalFormat;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private String currency;
    private String alignment;

    public BankAccount(String name, double balance, String currency, String animalType, String alignment) {
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        this.animalType = animalType;
        this.alignment = alignment;
    }

    public double doubleDecimal (double number) {
        DecimalFormat df = new DecimalFormat("0.00");
        number = Double.valueOf(df.format(number));
        return number;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        String str = String.format("%1.2f", balance);
        return str;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
