
class Pen {

    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to write on paper " + paper);
        paper.writeWithPenAndPaper(this);
    }

    public synchronized void finsishedWriting() {
        System.out.println(Thread.currentThread().getName() + " has finished using  pen " + this);
    }
}

class Paper {

    public synchronized void writeWithPenAndPaper(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to write with pen " + pen);
        pen.finsishedWriting();
    }

    public synchronized void finsishedWriting() {
        System.out.println(Thread.currentThread().getName() + " has finished using paper " + this);
    }
}

class Task1 implements Runnable {

    private final Pen pen;
    private final Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); //thread1 locks pen and tries to lock paper
    }
}

class Task2 implements Runnable {

    private final Pen pen;
    private final Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen) {
            paper.writeWithPenAndPaper(pen); //thread2 locks paper and tries to lock pen
        }
    }
}

public class DeadLock {

    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
