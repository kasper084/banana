package figures;

public abstract class Figure {

    private static int kids;

    public Figure() {
        kids++;
    }

    public static int getNumOfKids() {
        return kids;
    }

}
