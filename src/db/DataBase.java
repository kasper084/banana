package db;

import entity.Account;
import entity.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DataBase {
    private static User dave = new User("13", "Dave");
    private static Account daveAccount = new Account("03", "13", 1000.25);
    private static Map<User, Account> bankDataBase = Collections.singletonMap(dave, daveAccount);

    public synchronized void writeToDb(User user, Account account) {
        bankDataBase.put(user, account);
    }

    public Account readFromDb(User user) {
        return bankDataBase.get(user);
    }

    public static Map<User, Account> getBankDataBase() {
        return bankDataBase;
    }

    public static void setBankDataBase(Map<User, Account> bankDataBase) {
        DataBase.bankDataBase = bankDataBase;
    }

    public Optional<User> findUser(String userId) {
        return getBankDataBase().keySet().stream()
                .filter(user -> user.getId().equals(userId))
                .findFirst();
    }

    public Optional<Account> findAccount(String userId) {
        return getBankDataBase().values().stream()
                .filter(account -> account.getUserId().equals(userId))
                .findFirst();
    }
}