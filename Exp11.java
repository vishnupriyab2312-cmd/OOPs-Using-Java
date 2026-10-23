class Printer {
    public synchronized void printDocument(String threadName) {
        System.out.println(threadName + " is printing the document...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(threadName + " has finished printing.");
    }
}
class UserThread extends Thread {
    Printer printer;

    UserThread(Printer printer, String name) {
        super(name);
        this.printer = printer;
    }
    @Override
    public void run() {
        System.out.println(getName() + " started.");
        printer.printDocument(getName());

        System.out.println(getName() + " terminated.");
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        UserThread t1 = new UserThread(printer, "Thread-1");
        UserThread t2 = new UserThread(printer, "Thread-2");
        System.out.println("Thread-1 State : " + t1.getState());
        t1.start();
        t2.start();
        Thread.sleep(200);
        System.out.println("Thread-1 Current State : " + t1.getState());
        t1.join();
        t2.join();
        System.out.println("Thread-1 Final State : " + t1.getState());
        System.out.println("\nDeadlock Prevention:");
        System.out.println("Both threads access the shared printer");
        System.out.println("using a single synchronized method.");
        System.out.println("Since there is only one shared lock,");
        System.out.println("deadlock is prevented.");
    }
}