package server;

import request.Request;

import java.util.Random;

public class Server {
    private static final int MAGIC_NUM = 7;
    private static final int BOUND = 9;

    private static Random random = new Random();

    public void processRequest(Request request) {
        int criticalNum = getRandomNum();
        request.start();
        request.showMessage();
        try {
            if (criticalNum > MAGIC_NUM) throw new IllegalThreadStateException();
            else showMessage();
        } catch (IllegalThreadStateException i) {
            System.out.printf("\nSERVER: ERROR\n\nTrying again...%n");
            new Request().start();
        }
    }

    public void showMessage() {
        System.out.println("SERVER: OK");
    }

    private int getRandomNum() {
        return random.nextInt(BOUND);
    }
}