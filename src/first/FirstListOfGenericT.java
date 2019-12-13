package first;

public class FirstListOfGenericT {
    public void print() {
        MyListOne<Integer> integerList = new MyListOne<>();
        integerList.add(5);
        integerList.add(15);
        integerList.add(25);

        System.out.println("largest: " + integerList.getLargestValue());
        System.out.println("smallest: " + integerList.getSmallestValue());
        System.out.println();
    }
}