public class FruitsMatch {
    private FruitList fruitListNumberOne;
    private FruitList fruitListNumberTwo;

    public FruitsMatch(FruitList fruitListNumberOne, FruitList fruitListNumberTwo) {
        this.fruitListNumberOne = fruitListNumberOne;
        this.fruitListNumberTwo = fruitListNumberTwo;
    }

    public void searchForMatch() {
        if (getFruitListNumberOne().getFruitsList().size() == getFruitListNumberTwo().getFruitsList().size()) {
            for (int some = 0; some < getFruitListNumberOne().getFruitsList().size(); some++) {
                if (getFruitListNumberTwo().getFruitsList().contains(getFruitListNumberOne().getFruitsList().get(some))) {
                    System.out.printf("Perfect match for %s and %s%n",
                            getFruitListNumberOne().getFruitsList().get(some),
                            getFruitListNumberTwo().getFruitsList().get(some));
                } else {
                    System.out.printf("Sadly match for %s and %s%n",
                            getFruitListNumberOne().getFruitsList().get(some),
                            getFruitListNumberTwo().getFruitsList().get(some));
                }
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