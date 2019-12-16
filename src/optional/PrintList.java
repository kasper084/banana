package optional;

public class PrintList {
    public void print () {
        ListOfFruits listOfFruits = new ListOfFruits();
        Fruit banana = new Fruit(47, "Banana", "Yellow");
        Fruit apple = new Fruit(46, "Apple", "Green");
        Fruit orange = new Fruit(45, "Orange","Orange");
        Fruit grapefruit = new Fruit(44, "Grapefruit", "Paradise Pink");
        listOfFruits.add(banana);
        listOfFruits.add(apple);
        listOfFruits.add(orange);
        listOfFruits.checkFruits("Orange", grapefruit);
        listOfFruits.print();
    }
}