
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {

    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private int sharedResource = 0;

    public void read() {
        rwLock.readLock().lock();
        try {
            System.out.println("Read: " + sharedResource);
        } finally {
            rwLock.readLock().unlock();
        }
    }

    public void write(int value) {
        rwLock.writeLock().lock();
        try {
            sharedResource = value;
            System.out.println("Written: " + sharedResource);
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteLock example = new ReadWriteLock();

        // Create threads for reading
        Thread readThread1 = new Thread(example::read);
        Thread readThread2 = new Thread(example::read);

        // Create a thread for writing
        Thread writeThread = new Thread(() -> example.write(42));

        // Start the threads
        readThread1.start();
        readThread2.start();
        writeThread.start();
    }
}
