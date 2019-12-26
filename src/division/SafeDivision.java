package division;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivision {
    private Scanner scanner = new Scanner(System.in);
    private int a;
    private int b;

    public void getResult() {

        System.out.println("Enter two numbers for division operation");

        try {
            enterA();
            enterB();
            divide();

        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero"
                    + "enter second number again");
            enterB();
            divide();
        }
    }

    public void divide() {
        int result = a / b;
        System.out.println("Result:  "
                + result);
    }

    public void enterA() {
        try {
            System.out.println("Enter int");
            a = scanner.nextInt();
            System.out.println("Okay");
        } catch (InputMismatchException e) {
            System.out.println("Nope");
            scanner.next();
            enterA();
        }
    }

    public void enterB() {
        try {
            System.out.println("Enter int");
            b = scanner.nextInt();
            System.out.println("Okay");
        } catch (InputMismatchException e) {
            System.out.println("Nope");
            scanner.next();
            enterB();
        }
    }
}