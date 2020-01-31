package db;

import entity.Account;
import entity.User;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static Map<User, Account> db = dataBuilder();

    private static Map<User, Account> dataBuilder() {
        Map<User, Account> map = new HashMap<>();
        User dave = new User("13", "Dave");
        Account daveAccount = new Account("03", "13", 1000.25);
        map.put(dave, daveAccount);
        return map;
    }

    public synchronized void writeToDb(User user, Account account) {
        db.put(user, account);
    }

    public Account readFromDb(User user) {
        return db.get(user);
    }

    public static Map<User, Account> getDb() {
        return db;
    }

    public static void setDb(Map<User, Account> db) {
        DataBase.db = db;
    }
}