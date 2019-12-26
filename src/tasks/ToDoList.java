package tasks;

import division.SafeDivision;
import exceptions.ExceptionA;
import exceptions.ExceptionB;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ToDoList {
    public void printResults() {
        SafeDivision safeDivision = new SafeDivision();
        safeDivision.getResult();


        String someText = null;
        String someDoc = "doc.txt";


        try {
            someText = Files.readString(Paths.get(someDoc));
            char[] arr = someText.toCharArray();


        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        } /*catch (ExceptionB b) {
            b.printStackTrace();
        } catch (ExceptionA a) {
            a.printStackTrace();
        }*/
    }
}
