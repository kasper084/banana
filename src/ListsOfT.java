public class ListsOfT {

    public void print() {
        MyList<Integer> integerList = new MyList<>();
        MyList<String> stringList = new MyList<>();
        integerList.add(5);
        integerList.add(15);
        integerList.add(25);
        stringList.add("some");
        stringList.add("random");
        stringList.add("text");

        System.out.println("use method - smallest on Strings :" + stringList.smallest(stringList));
        System.out.println("largest: " + integerList.largest(integerList));
    }
}