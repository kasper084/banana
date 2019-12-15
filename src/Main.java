import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveDivisibleByThree removeDivisibleByThree = new RemoveDivisibleByThree();
        FruitList fruitListNumberOne = new FruitList(Arrays.asList("Banana", "Avocado", "Apple", "Orange"));
        FruitList fruitListNumberTwo = new FruitList(Arrays.asList("Blackberry", "Banana", "Chary", "Orange"));
        FruitsMatch fruitsMatch = new FruitsMatch(fruitListNumberOne, fruitListNumberTwo);
        FruitTree fruitTree = new FruitTree(fruitListNumberTwo);

        removeDivisibleByThree.remove();
        removeDivisibleByThree.removeWithRemoveIf();

        fruitsMatch.searchForMatch();
        fruitListNumberOne.checkFruits();
        fruitTree.print();
    }
}