package division;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivision {
    private Scanner scanner = new Scanner(System.in);
    private int a;
    private int b;
    private int num;

    public void getResult() {

        System.out.println("Enter two numbers for division operation");

        try {
            getA();
            getB();
            divide();

        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero"
                    + " enter second number again");
            getB();
            divide();
        }
    }

    public void divide() {
        int result = a / b;
        System.out.println("Result:  "
                + result);
    }

    public int enterNum() {
        try {
            System.out.println("Enter int");
            num = scanner.nextInt();
            System.out.println("Okay");
        } catch (InputMismatchException e) {
            System.out.println("Nope");
            scanner.next();
            enterNum();
        }
        return num;

    }

    public void getA() {
        this.a = enterNum();
    }

    public void getB() {
        this.b = enterNum();
    }
}