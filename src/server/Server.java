package server;

import request.Request;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static final int NUM = 7;
    private static final int RANDOM_INT_BOUND = 9;

    private static Random random = new Random();

    public void processRequest(Request request) {

        int criticalNum = getRandomNum();

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(request);
        request.showMessage();

        try {
            if (criticalNum > NUM) {
                throw new IllegalThreadStateException();
            } else checkServer();

        } catch (IllegalThreadStateException i) {
            System.out.println("\nSERVER: ERROR\n\nTrying again...");
            service.submit(request);
        }
        service.shutdown();
    }

    public void checkServer() {
        System.out.println("SERVER: OK");
    }

    private int getRandomNum() {
        return random.nextInt(RANDOM_INT_BOUND);
    }
}