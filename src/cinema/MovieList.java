package cinema;

public class MovieList {
    public void sortByGenre() {
        MovieGroups movieGroups = new MovieGroups();
        Movie bladeRunner = new Movie(80, "Si-fi");
        Movie bladeRunner2049 = new Movie(120, "Si-fi");
        Movie godzilla = new Movie(115, "Si-fi");
        Movie spiritedAway = new Movie(80, "Anime");
        Movie princessMononoke = new Movie(85, "Anime");
        Movie pulpFiction = new Movie(95, "Criminal Drama");
        Movie reservoirDogs = new Movie(75, "Criminal Drama");
        Movie carlitosWay = new Movie(85, "Criminal Drama");
        Movie wick = new Movie(120, "Action");
        Movie terminator = new Movie(90, "Action");


        movieGroups.getRandomMovies().add(bladeRunner);
        movieGroups.getRandomMovies().add(spiritedAway);
        movieGroups.getRandomMovies().add(pulpFiction);
        movieGroups.getRandomMovies().add(wick);
        movieGroups.getRandomMovies().add(godzilla);

        movieGroups.getRandomMoviesTwo().add(bladeRunner2049);
        movieGroups.getRandomMoviesTwo().add(princessMononoke);
        movieGroups.getRandomMoviesTwo().add(reservoirDogs);
        movieGroups.getRandomMoviesTwo().add(carlitosWay);
        movieGroups.getRandomMoviesTwo().add(terminator);

        movieGroups.sortMovies();
    }
}