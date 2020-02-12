package runner;

import service.Service;

public class Pool implements Runnable {
    private static final Double AMOUNT = 100.0;
    private static final String USER_ID = "13";
    private static final String ERROR = "Transaction Failed";

    private Service service = new Service();

    @Override
    public void run() {

        System.out.println("Connecting...");

        try {
            Thread.sleep(1000);
            System.out.println("Checking account balance...");
            Thread.sleep(800);
            System.out.println(service.showBalance(USER_ID));
            System.out.println("Sending request...");
            service.takeMoneyFromAccount(AMOUNT, USER_ID);
            Thread.sleep(600);

        } catch (InterruptedException | IllegalArgumentException i) {
            System.out.println(i.getMessage());
            System.out.println(ERROR);
        }
    }
}