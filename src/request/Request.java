package request;

public class Request extends Thread {

    @Override
    public void run() {
        try {
            sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("\n%s Done collecting data%n", currentThread().getName());
    }

    public void showMessage() {
        System.out.printf("\nRequesting Data...%n");
    }
}