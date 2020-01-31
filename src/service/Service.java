package service;

import db.DataBase;
import entity.Account;
import entity.User;

import java.util.Optional;

public class Service {
    private static final String ACCOUNT_NOT_FOUND = "Account no found";
    private static final String NO_ENOUGH_MONEY = "No enough money";

    private DataBase dataBase = new DataBase();

    private Optional<Account> getAccount(User user) {
        return Optional.ofNullable(dataBase.readFromDb(user));
    }

    public void takeMoneyFromAccount(Double amount, User user) {
        Account account = getAccount(user)
                .orElseThrow(() -> new IllegalArgumentException(ACCOUNT_NOT_FOUND));
        Double balance = account.getBalance();
        if (balance <= amount)
            account.setBalance(balance - amount);
        else System.out.println(NO_ENOUGH_MONEY);
        saveToDb(user, account);
    }

    public Optional<Double> showBalance(User user) {
        return Optional.ofNullable(dataBase.readFromDb(user).getBalance());
    }

    private void saveToDb(User user, Account account) {
        dataBase.writeToDb(user, account);
    }
}