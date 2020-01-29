package server;

import request.Request;

import java.util.Random;

public class Server {
    private static final int MAGIC_NUM = 7;
    private static final int BOUND = 9;

    public void processRequest(Request request) {
        int criticalNum = getRandomNum();
        request.start();
        request.showMessage();
        try {
            if (criticalNum > MAGIC_NUM) throw new IllegalThreadStateException();
            else showMessage();
        } catch (IllegalThreadStateException i) {
            System.out.println("\nSERVER: ERROR"
                    + "\n"
                    + "\nTrying again...");
            new Request().start();
        }
    }

    public void showMessage() {
        System.out.println("SERVER: OK");
    }

    private int getRandomNum() {
        Random random = new Random();
        return random.nextInt(BOUND);
    }
}