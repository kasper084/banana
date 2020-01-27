package request;

public class Request extends Thread {

    @Override
    public void run() {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(currentThread().getName()
                + " Done collecting data");
    }

    public void showMessage() {
        System.out.println("requesting data");
    }
}