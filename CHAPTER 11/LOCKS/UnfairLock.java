import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLock {
        private final Lock lock = new ReentrantLock(false); // Unfair lock

        public void accessResource() {
                lock.lock();
                try{
                        System.out.println(Thread.currentThread().getName() + " aquired the lock.");
                        Thread.sleep(1000);
                } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                } finally {
                        System.out.println(Thread.currentThread().getName() + " released the lock.");
                        lock.unlock();
                }
        }
        public static void main(String[] args) {
                UnfairLock lock = new UnfairLock();
                
                Runnable task = new Runnable() {
                        @Override
                        public void run() {
                                lock.accessResource();
                        }
                };

                Thread t1 = new Thread(task, "Thread 1");
                Thread t2 = new Thread(task, "Thread 2");
                t1.start();
                t2.start();
        }
}