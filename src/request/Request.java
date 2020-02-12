package request;

public class Request implements Runnable {

    @Override
    public void run() {

        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("\n%s Done collecting data%n", Thread.currentThread().getName());
    }

    public void showMessage() {
        System.out.printf("\nRequesting Data...%n");
    }
}