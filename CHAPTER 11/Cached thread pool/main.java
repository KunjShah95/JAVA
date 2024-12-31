
import java.util.concurrent.*;

public class main {

    public static void main(String[] args) {
        Executors.newScheduledThreadPool(1);
        Executors.newFixedThreadPool(2);
        Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.shutdown();
        System.out.println("Hello World");
    }
}
