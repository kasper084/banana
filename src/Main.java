import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveDivisibleByThree removeDivisibleByThree = new RemoveDivisibleByThree();
        FruitList fruitListNumberOne = new FruitList(Arrays.asList("Banana", "Avocado", "Apple", "Orange"));
        FruitList fruitListNumberTwo = new FruitList(Arrays.asList("Banana", "Avocado", "Apple", "Orange"));
        FruitsMatch fruitsMatch = new FruitsMatch(fruitListNumberOne, fruitListNumberTwo);

        removeDivisibleByThree.remove();
        removeDivisibleByThree.removeWithRemoveIf();
        fruitListNumberOne.checkFruits();
        fruitsMatch.searchForMatch();
    }
}