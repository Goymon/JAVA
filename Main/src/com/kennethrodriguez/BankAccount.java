package com.kennethrodriguez;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String mobile;

    // ========= SETTERS ===========

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // ========= GETTERS ===========

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getMobile() {
        return this.mobile;
    }


    public void withdrawFunds(double fundsToWithdraw) {
        if(this.balance >= fundsToWithdraw) {
            this.balance -= fundsToWithdraw;
            System.out.println("Withdrawal of " + fundsToWithdraw + " processed. Remaining balance = " + this.balance);
        } else {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }

    }

    public void depositFunds(double fundsToDeposit) {
        this.balance += fundsToDeposit;
        System.out.println("Deposited of " + fundsToDeposit + " made. New balance = " + this.balance);
    }
}
