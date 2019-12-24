package cats;

import java.util.ArrayList;
import java.util.List;

public class Clowder {
    private List<Cat> cats = new ArrayList<>();

    public void addCats() {
        Cat firstCat = new Cat("Nakamura");
        Cat secondCat = new Cat("Betsi");
        Cat thirdCat = new Cat("Vasulko");

        getCats().add(firstCat);
        getCats().add(secondCat);
        getCats().add(thirdCat);
    }

    public void makeNoise() {
        addCats();
        for (Cat cat : getCats()) {
            cat.sayMeow();
        }
    }

    public List<Cat> getCats() {
        return this.cats;
    }
}