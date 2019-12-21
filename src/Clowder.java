import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clowder {
    private Cat firstCat= new Cat("Nakamura");
    private Cat secondCat = new Cat("Betsi");
    private Cat thirdCat = new Cat("Vasulko");
    private List<Cat> cats = new ArrayList<>(Arrays.asList(firstCat, secondCat, thirdCat));

    public void makeNoise() {
        for (Cat cat:
                getCats()) {
            cat.sayMeow();
        }
    }

    public List<Cat> getCats() {
        return this.cats;
    }
}