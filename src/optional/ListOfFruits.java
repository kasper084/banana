package optional;

import java.util.ArrayList;
import java.util.List;

public class ListOfFruits {
    private List<Fruit> fruitList = new ArrayList<>();

    public List<Fruit> getFruitList() {
        return this.fruitList;
    }

    public void add(Fruit fruit){
        getFruitList().add(fruit);
    }


    public void checkFruits(String name, Fruit fruit) {
    }

    public void print() {
        for (Fruit fruit: getFruitList()) {
            System.out.println(fruit);
        }
    }
}
