package tasks;

import cats.Clowder;
import cinema.MovieList;
import users.UsersList;

public class ListOfTasks {
    public void printResult() {
        Clowder clowder = new Clowder();
        UsersList usersList = new UsersList();
        clowder.makeNoise();
        usersList.sortByGroups();
        MovieList movieList = new MovieList();
        movieList.sortByGenre();
    }
}
