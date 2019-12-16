package optional;

import java.util.ArrayList;
import java.util.List;

public class ListOfFruits {
    private List<Fruit> fruitList = new ArrayList<>();
    private List<String> nameList = new ArrayList<>();

    public void add(Fruit fruit) {
        getFruitList().add(fruit);
        getNameList().add(fruit.getName());
    }

    public int getIndexByName(String name) {
        int index = getNameList().indexOf(name);
        return index;
    }

    public void checkFruits(String name, Fruit fruit) {
        if (name.equals("Orange")) {
            Fruit some = getFruitList().get(getIndexByName(name));
            int index = getFruitList().indexOf(some);
            if (getFruitList().contains(some)) {
                getFruitList().set(index, fruit);
            }
        }
    }

    public void print() {
        for (Fruit fruit : getFruitList()) {
            System.out.println(fruit);
        }
    }

    public List<Fruit> getFruitList() {
        return this.fruitList;
    }

    public List<String> getNameList() {
        return nameList;
    }
}