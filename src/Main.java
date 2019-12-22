import cats.Clowder;
import users.UsersList;

public class Main {
    public static void main(String[] args) {
        Clowder clowder = new Clowder();
        UsersList usersList = new UsersList();
        clowder.makeNoise();
        usersList.sortByGroups();
    }
}
