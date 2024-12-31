import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class  FairLockExample {
    private final Lock lock = new ReentrantLock(true); // Fair lock

    public void accessResource() {
        lock.lock();
        try {
            // Critical section
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            // Simulate some work with the resource
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairLockExample example = new FairLockExample();

        Runnable task = example::accessResource;

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}