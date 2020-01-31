package runner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppRunner {
    private static final int MAGIC_NUM = 11;

    public void processingTransaction() {
        ExecutorService singleTread = Executors.newSingleThreadExecutor();
        for (int start = 0; start < MAGIC_NUM; start++) {
            singleTread.submit(new Pool());
        }
        singleTread.shutdown();
    }
}