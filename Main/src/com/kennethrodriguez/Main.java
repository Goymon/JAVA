package com.kennethrodriguez;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber(123456789);
        bankAccount.setBalance(10_000);
        bankAccount.setName("Kenneth Rodriguez");
        bankAccount.setEmail("mail@rodriguezkenneth.com");
        bankAccount.setMobile("+63 999 369 5405");

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getMobile());

        bankAccount.depositFunds(5_000);


        bankAccount.withdrawFunds(16_000);


        bankAccount.withdrawFunds(5_000);


    }
}
