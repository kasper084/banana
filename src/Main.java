import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveDivisibleByThree removeDivisibleByThree = new RemoveDivisibleByThree();
        FruitList fruitListNumberOne = new FruitList(Arrays.asList("Banana", "Avocado", "Apple", "Orange"));
        FruitList fruitListNumberTwo = new FruitList(Arrays.asList("Banana", "Blackberry", "Yuzu", "Orange"));
        FruitsMatch fruitsMatch = new FruitsMatch(fruitListNumberOne, fruitListNumberTwo);
        FruitTree fruitTree = new FruitTree(fruitListNumberTwo);

        removeDivisibleByThree.remove();
        removeDivisibleByThree.removeWithRemoveIf();
        fruitListNumberOne.checkFruits();
        fruitsMatch.searchForMatch();
        fruitTree.print();
    }
}