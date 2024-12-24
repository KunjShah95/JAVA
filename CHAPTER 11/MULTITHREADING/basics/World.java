
// public class World extends Thread {
//     @Override
//     public void run() {
//         for (;;) {
//             System.out.println((Thread.currentThread().getName()));
//        // 2nd method
public class World implements Runnable {

    @Override
    public void run() {
        for (;;) {
            System.out.println("World");
        }
    }

  
}
