
class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 100000000; j++) {
        //         // Simulate some work
        //     }
        //     System.out.println(Thread.currentThread().getName() + " -Priority: " + Thread.currentThread().getPriority() + " - Index: " + i);
        // }
        // try {
        //     Thread.sleep(10);
        // } catch (InterruptedException e) {
        // }

      // try {
        //     Thread.sleep(1000);
        //     System.out.println("Thread is Running....");
        // } catch (InterruptedException e) {
        //     System.out.println("Thread interrupted: " + e);

        // }
        // for(int i = 0;i<5;i++){
        //     System.out.println(Thread.currentThread().getName() +  " is running");
        //     Thread.yield();
        // }
        while(true){
        System.out.println("Hello World!");
    }
}

    public static void main(String[] args) throws InterruptedException {
        // MyThread t1 = new MyThread("Low Priority");
        // MyThread t2 = new MyThread("Medium Priority");
        // MyThread t3 = new MyThread("High Priority");
        // t1.setPriority(Thread.MIN_PRIORITY);
        // t2.setPriority(Thread.NORM_PRIORITY);
        // t3.setPriority(Thread.MAX_PRIORITY);
        // t1.start();
        // t2.start();
        // t3.start();
        // MyThread t1 = new MyThread("Thread 0");
        // MyThread t2 = new MyThread("Thread 1");
        // t1.start();
        // t2.start();


         MyThread myThread = new MyThread("Daemon Thread");
            myThread.setDaemon(true);
          MyThread t1 = new MyThread("Non-Daemon Thread");  
            t1.start();  
          myThread.start();   
            System.out.println("Main done");
            

        }
}
// start run sleep join setPriority interrupt yeild setDaemon

// daemon thread is a low priority thread that runs in the background and does not prevent the JVM from exiting when all the user threads finish their execution.
// The JVM terminates itself when all user threads finish their execution, including the main thread.
