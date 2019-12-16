import java.util.Arrays;

public class PrintAll {
    public void print() {
        RemoveDivisibleByThree removeDivisibleByThree = new RemoveDivisibleByThree();
        FruitList fruitListNumberOne = new FruitList(Arrays.asList("Banana", "Avocado", "Apple", "Orange"));
        FruitList fruitListNumberTwo = new FruitList(Arrays.asList("Blackberry", "Banana", "Chary", "Orange"));
        FruitsMatch fruitsMatch = new FruitsMatch(fruitListNumberOne, fruitListNumberTwo);
        FruitTree fruitTree = new FruitTree();

        fruitTree.add(fruitListNumberTwo);
        fruitTree.print();

        System.out.println();
        removeDivisibleByThree.print();

        System.out.println();
        fruitsMatch.searchForMatch();

        System.out.println();
        fruitListNumberOne.print();
    }
}