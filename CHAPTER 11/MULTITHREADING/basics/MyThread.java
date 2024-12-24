
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t1.getState());
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t1.getState());

    }
}
