import java.util.List;

public class FruitList {
    private List<String> fruitsList;

    public FruitList(List<String> fruits) {
        this.fruitsList = fruits;
    }

    public void checkFruits() {
        String grapefruit = "Grapefruit";
        String orange = "Orange";
        if (!getFruitsList().contains(grapefruit)) {
            if (getFruitsList().contains(orange)) getFruitsList().set(getFruitsList().indexOf(orange), grapefruit);
        }
    }

    public void print() {
        checkFruits();
        System.out.println(getFruitsList());
    }

    public List<String> getFruitsList() {
        return fruitsList;
    }
}