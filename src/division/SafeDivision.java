package division;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivision {
    Scanner scanner = new Scanner(System.in);
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
        }finally {
            scanner.close();
        }
    }

    public int getValidNumber() {
        try {
            System.out.println("Enter number");
            num = scanner.nextInt();
            System.out.println("Okay");
        } catch (InputMismatchException i) {
            System.out.println("Nope");
            scanner.next();
            getValidNumber();
        }
        return num;
    }

    public void divide() {
        num = a / b;
        System.out.printf("Result:  %d%n", num);
    }

    public void getA() {
        this.a = getValidNumber();
    }

    public void getB() {
        this.b = getValidNumber();
    }
}