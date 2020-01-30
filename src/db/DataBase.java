package db;

import entity.Account;
import entity.User;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static Map<User, Account> db = new HashMap<>();

    public synchronized void writeToDb(User user, Account account) {
        db.put(user, account);
    }

    public void readFromDb(User user) {
        db.get(user);
    }

    public static void setDb(Map<User, Account> db) {
        DataBase.db = db;
    }
}