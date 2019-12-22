package cinema;

public class Movie {
    private double prise;
    private String genre;

    public Movie(double prise, String genre) {
        this.prise = prise;
        this.genre = genre;
    }

    public double getPrise() {
        return prise;
    }

    public String getGenre() {
        return genre;
    }
}