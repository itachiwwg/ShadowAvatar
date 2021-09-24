package slf.wwg.shadow;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TaskControl {

    private final ThreadPoolExecutor boss;

    private final ThreadPoolExecutor worker;

    public TaskControl(int bossSize, int bossQueueSize, int workerSize, int workerQueueSize) {
        boss = new ThreadPoolExecutor(bossSize, bossSize,
                30, TimeUnit.SECONDS, new LinkedBlockingQueue<>(bossQueueSize));

        worker = new ThreadPoolExecutor(workerSize, workerSize,
                30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(workerQueueSize));

    }

    public void submitTask() {

    }

}
