package server;

import request.Request;

import java.util.Random;

public class Server {
    private Random random = new Random();

    public void processRequest(Request request) {
        int criticalNum = random.nextInt(9);
        request.start();
        request.showMessage();
        if (criticalNum > 7) throw new IllegalThreadStateException();
        else showMessage();
    }

    public void showMessage() {
        System.out.println("OK");
    }
}