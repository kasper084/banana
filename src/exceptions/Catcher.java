package exceptions;

import java.io.IOException;

public class Catcher {
    public void hunt() {

        try {
            throw new ExistentialException();
        } catch (ExistentialException a) {
            System.out.println(a.getMessage());
        }

        try {
            throw new ChildOfExistentialException();
        } catch (ChildOfExistentialException b) {
            System.out.println(b.getMessage());
        }

        try {
            throw new IOException();
        } catch (IOException i) {
            System.out.println("that is");
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException n) {
            System.out.println("the question");
        }
    }
}