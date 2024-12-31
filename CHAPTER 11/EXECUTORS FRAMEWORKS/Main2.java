
import java.util.concurrent.*;

public class Main2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(9);
        Future<?> future = executor.submit(() -> "World");
        future.get();
        System.out.println(future.get());
        executor.shutdown();
    }
}
