package server;

import request.Request;

public class ServerRunner {
    private static final int NUM_OF_REQUESTS = 10;

    public void answerRequest() {
        Server server = new Server();
        for (int start = 0; start < NUM_OF_REQUESTS; start++) {
            try {
                server.processRequest(new Request());
            } catch (IllegalThreadStateException i) {
                System.out.printf("\nError.Trying again%n");
                server.processRequest(new Request());
            }
        }
    }
}