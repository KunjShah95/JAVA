
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class main {

    public static void main(String[] args) {
        final int numberOfThreads = 3;
        CyclicBarrier barrier = new CyclicBarrier(numberOfThreads, () -> {
            System.out.println("All parties have arrived at the barrier, let's proceed");
        });

        for (int i = 0; i < numberOfThreads; i++) {
            Thread worker = new Thread(new Worker(barrier));
            worker.start();
        }
    }
}

class Worker implements Runnable {

    private final CyclicBarrier barrier;

    public Worker(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
        } catch (InterruptedException | BrokenBarrierException e) {

        }
    }
}
