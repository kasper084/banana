package optional;

public class PrintList {
    public static void main(String[] args) {
        ListOfFruits listOfFruits = new ListOfFruits();
        Fruit banana = new Fruit(47, "Banana", "yellow");
        Fruit apple = new Fruit(46, "Apple", "green");
        Fruit orange = new Fruit(45, "Orange","orange");
        Fruit grapefruit = new Fruit(44, "Grapefruit", "orange");
        listOfFruits.add(banana);
        listOfFruits.add(apple);
        listOfFruits.add(orange);
        listOfFruits.checkFruits("Orange", grapefruit);
        listOfFruits.print();
    }
}
