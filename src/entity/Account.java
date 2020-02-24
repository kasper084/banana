package entity;

public class Account {
    private String id;
    private String userId;
    private Double dollars;

    public Account(String id, String userId, Double dollars) {
        this.id = id;
        this.userId = userId;
        this.dollars = dollars;
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

    public void setDollars(Double dollars) {
        this.dollars = dollars;
    }

    public Double getDollars() {
        return dollars;
    }
}