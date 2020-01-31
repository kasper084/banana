package entity;

public class Account {
    private String id;
    private String userId;
    private Double balance;

    public Account(String id, String userId, Double balance) {
        this.id = id;
        this.userId = userId;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }
}