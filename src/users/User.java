package users;

import java.time.LocalDate;

public class User {
    private String team;
    private String mail;
    private LocalDate date;

    public User(String team, String mail, LocalDate date) {
        this.team = team;
        this.mail = mail;
        this.date = date;
    }

    public String getTeam() {
        return team;
    }

    public String getMail() {
        return mail;
    }

    public LocalDate getDate() {
        return date;
    }
}