package library;

import java.util.HashMap;
import java.util.Map;

public class BookShell {
    private Map<Date, Book> borrowedBooks = new HashMap<>();
    private int numOfTakenBooks;

    public void writeToReport(Date date, Book book) {
        getBorrowedBooks().put(date, book);
        numOfTakenBooks++;
    }

    public void checkByDate(Date date) {
        if (getBorrowedBooks().get(date) != null) {
            System.out.println(date
                    + " "
                    + getBorrowedBooks().get(date).getBookName());
        } else {
            System.out.println("No books were taken on that day");
        }
    }

    public void checkAllBooks(Map<Date, Book> map) {
        System.out.println("Those "
                + getNumOfTakenBooks()
                + " books were take");
        map.forEach((date, book) -> System.out.println((date
                + ":"
                + book.getBookName())));
    }

    public Map<Date, Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public int getNumOfTakenBooks() {
        return this.numOfTakenBooks;
    }
}