package second;

public class SecondListOfGenericT {

    public void print() {
        MyListTwo<Integer> integerList = new MyListTwo<>();
        MyListTwo<String> stringList = new MyListTwo<>();
        integerList.add(5);
        integerList.add(15);
        integerList.add(25);
        stringList.add("some");
        stringList.add("random");
        stringList.add("text");

        System.out.println("use method - smallest() on Strings: " + stringList.getSmallestValue(stringList));
        System.out.println("largest: " + integerList.getLargestValue(integerList));
    }
}