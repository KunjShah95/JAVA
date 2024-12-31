
import java.util.concurrent.*;

public class main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices, new CustomThreadFactory());
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        for (int i = 0; i < numberOfServices; i++) {
            executorService.submit(new DependentService(latch));
        }
        latch.await(5, TimeUnit.SECONDS);

        System.out.println("Main");
        executorService.shutdown();
    }

    public static class DependentService implements Runnable {

        private final CountDownLatch latch;

        public DependentService(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(6000);
                System.out.println(Thread.currentThread().getName() + " service started");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            latch.countDown();
            // Service completed
        }
    }

    public static class CustomThreadFactory implements ThreadFactory {

        private int counter = 0;

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "Service-" + counter++);
        }
    }
}
