package server;

import request.Request;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static final int MAGIC_NUM = 7;
    private static final int BOUND = 9;

    public void processRequest(Request request) {
        int criticalNum = getRandomNum();
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(request);
        request.showMessage();
        if (criticalNum > MAGIC_NUM) throw new IllegalThreadStateException();
        else showMessage();
        service.shutdown();
    }

    public void showMessage() {
        System.out.println("SERVER OK");
    }

    private int getRandomNum() {
        Random random = new Random();
        return random.nextInt(BOUND);
    }
}