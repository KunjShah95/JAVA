
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {

    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();

    private final Lock writeLock = lock.writeLock();

    public void increment() throws InterruptedException {
        writeLock.lock();
        try {
            count++;
            Thread.sleep(50);
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();

        Runnable readTask = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    counter.increment();
                } catch (InterruptedException ex) {
                }
                System.out.println(Thread.currentThread().getName() + " read: " + counter.getCount());
            }
        };

        Runnable writeTask = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    counter.increment();
                } catch (InterruptedException ex) {
                }
                System.out.println(Thread.currentThread().getName() + " incremented");
            }
        };
        Thread writerThread = new Thread(writeTask);
        Thread readerThread1 = new Thread(readTask);
        Thread readerThread2 = new Thread(readTask);

        writerThread.start();
        readerThread1.start();
        readerThread2.start();

        writerThread.join();
        readerThread1.join();
        readerThread2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
