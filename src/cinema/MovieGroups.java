package cinema;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieGroups {
    private List<Movie> randomMovies = new ArrayList<>();
    private List<Movie> randomMoviesTwo = new ArrayList<>();

    public void sortMovies() {
        Map<String, Map<Double, List<Movie>>> moviesFilter = Stream.of(getRandomMovies(),
                getRandomMoviesTwo())
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Movie::getGenre,
                        Collectors.groupingBy(Movie::getTicketPrice)));

        System.out.println();
        moviesFilter.forEach((genre, price) -> {

            int num = 0;
            double sum = 0;
            for (double d : price.keySet()) {
                sum += d;
                num++;
            }
            double average = Math.floor(sum / price.size());

            System.out.println("We have "
                    + num
                    + " movies in "
                    + genre
                    + " genre and average ticket price is "
                    + average);
        });
    }

    public List<Movie> getRandomMovies() {
        return this.randomMovies;
    }

    public List<Movie> getRandomMoviesTwo() {
        return this.randomMoviesTwo;
    }
}