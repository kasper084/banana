package runner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppRunner {
    private static final int NUM_OF_TRANSACTION = 11;

    public void processTransaction() {
        ExecutorService singleTread = Executors.newSingleThreadExecutor();
        for (int start = 0; start < NUM_OF_TRANSACTION; start++) {
            singleTread.submit(new Pool());
        }
        singleTread.shutdown();
    }
}