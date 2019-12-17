import fruits.FruitList;
import fruits.FruitTree;
import fruits.FruitsMatch;
import numbers.DivisibleNumbers;

import java.util.Arrays;

public class PrintAll {
    public void print() {
        DivisibleNumbers divisibleNumbers = new DivisibleNumbers();
        FruitList fruitListNumberOne = new FruitList(Arrays.asList("Banana", "Avocado", "Apple", "Orange"));
        FruitList fruitListNumberTwo = new FruitList(Arrays.asList("Blackberry", "Banana", "Chary", "Orange"));
        FruitsMatch fruitsMatch = new FruitsMatch(fruitListNumberOne, fruitListNumberTwo);
        FruitTree fruitTree = new FruitTree();

        fruitTree.add(fruitListNumberTwo);
        fruitTree.print();

        System.out.println();
        divisibleNumbers.print();

        System.out.println();
        fruitsMatch.searchForMatch();

        System.out.println();
        fruitListNumberOne.print();
    }
}