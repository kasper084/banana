package server;

import request.Request;

public class ServerRunner {

    public void answerRequest() {
        Server server = new Server();
        for (int start = 0; start < 10; start++) {
            try {
                server.processRequest(new Request());
            } catch (IllegalThreadStateException i) {
                System.out.println("\nError.Trying again\n");
                server.processRequest(new Request());
            }
        }
    }
}