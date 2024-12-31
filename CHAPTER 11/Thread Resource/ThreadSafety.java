
public class ThreadSafety {

    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public synchronized int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        ThreadSafety threadSafety = new ThreadSafety();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                threadSafety.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Final counter value: " + threadSafety.getCounter());
    }
}
