package library;

public class Report {
    public void printReport() {
        BookShell bookShell = new BookShell();
        Book macbeth = new Book("Macbeth");
        Book fromTheDust = new Book("From the Dust Returned");
        Book androidsDream = new Book("Do Androids Dream of Electric Sheep?");
        Date firstDay = new Date(2019, 2, 15);
        Date secondDay = new Date(2019, 2, 16);
        Date thirdDay = new Date(2019, 2, 17);
        Date fourthDay = new Date(2019, 2, 18);

        bookShell.writeToReport(firstDay, macbeth);
        bookShell.writeToReport(secondDay, fromTheDust);
        bookShell.writeToReport(fourthDay, androidsDream);

        bookShell.checkAllBooks(bookShell.getBorrowedBooks());

        System.out.println();
        bookShell.checkByDate(thirdDay);
    }
}