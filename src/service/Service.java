package service;

import db.DataBase;
import entity.Account;
import entity.User;

public class Service {
    private static final String ERROR_MESSAGE = "Transaction Failed\n";
    private static final String SUCCESS_MESSAGE = "Transaction Successful\n";
    private static final String ACCOUNT_NOT_FOUND_MESSAGE = "Account no found";

    private DataBase dataBase = new DataBase();

    private Account getAccount(String userId) {
        return dataBase.findAccount(userId)
                .orElseThrow(() -> new IllegalArgumentException(ACCOUNT_NOT_FOUND_MESSAGE));
    }

    public User getUser(String userId) {
        return dataBase.findUser(userId)
                .orElseThrow(() -> new IllegalArgumentException(ACCOUNT_NOT_FOUND_MESSAGE));
    }

    public void takeMoneyFromAccount(Double amount, String userId) {

        User user = getUser(userId);
        Account account = getAccount(userId);
        Double balance = account.getDollars();

        if (balance >= amount) {
            account.setDollars(balance - amount);
            System.out.println(SUCCESS_MESSAGE);
        } else {
            System.out.println(ERROR_MESSAGE);
        }

        saveToDb(user, account);
    }

    public Double showBalance(String userId) {
        return dataBase.readFromDb(getUser(userId)).getDollars();
    }

    private void saveToDb(User user, Account account) {
        dataBase.writeToDb(user, account);
    }
}