package fruits;

import fruits.FruitList;

public class FruitsMatch {
    private FruitList fruitListNumberOne;
    private FruitList fruitListNumberTwo;

    public FruitsMatch(FruitList fruitListNumberOne, FruitList fruitListNumberTwo) {
        this.fruitListNumberOne = fruitListNumberOne;
        this.fruitListNumberTwo = fruitListNumberTwo;
    }

    public void searchForMatch() {
        for (String element : getFruitListNumberOne().getFruitsList()) {
            int index = getFruitListNumberOne().getFruitsList().indexOf(element);
            if (getFruitListNumberTwo().getFruitsList().contains(element)) {
                int some = getFruitListNumberTwo().getFruitsList().indexOf(element);
                System.out.println("Prefect match for "
                        + element
                        + " and "
                        + getFruitListNumberTwo().getFruitsList().get(some));
            } else {
                System.out.println("Sadly no match for "
                        + element
                        + " and "
                        + getFruitListNumberTwo().getFruitsList().get(index));
            }
        }
    }

    public FruitList getFruitListNumberOne() {
        return fruitListNumberOne;
    }

    public FruitList getFruitListNumberTwo() {
        return fruitListNumberTwo;
    }
}