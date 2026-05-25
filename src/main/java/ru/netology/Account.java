package ru.netology;

public class Account {

    private int id;
    private String name;
    private String number;
    private int balance;
    private String currency;

    public Account(int id, String name, String number, int balance, String currency) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }
}