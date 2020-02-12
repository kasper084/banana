package service;

import db.DataBase;
import entity.Account;
import entity.User;

public class Service {
    private static final String ERROR = "Transaction Failed\n";
    private static final String SUCCESS = "Transaction Successful\n";
    private static final String ACCOUNT_NOT_FOUND = "Account no found";

    private DataBase dataBase = new DataBase();

    private Account getAccount(String userId) {
        return dataBase.getAccount(userId)
                .orElseThrow(() -> new IllegalArgumentException(ACCOUNT_NOT_FOUND));
    }

    public User getUser(String userId) {
        return dataBase.getUser(userId)
                .orElseThrow(() -> new IllegalArgumentException(ACCOUNT_NOT_FOUND));
    }

    public void takeMoneyFromAccount(Double amount, String userId) {

        User user = getUser(userId);
        Account account = getAccount(userId);
        Double balance = account.getBalance();

        if (balance >= amount) {
            account.setBalance(balance - amount);
            System.out.println(SUCCESS);
        } else {
            System.out.println(ERROR);
        }

        saveToDb(user, account);
    }

    public Double showBalance(String userId) {
        return dataBase.readFromDb(getUser(userId)).getBalance();
    }

    private void saveToDb(User user, Account account) {
        dataBase.writeToDb(user, account);
    }
}