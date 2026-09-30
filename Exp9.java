class ReservationThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket Reserved: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Reservation interrupted");
            }
        }
    }
}
class StatusThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket Confirmed: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Status interrupted");
            }
        }
    }
}
public class Exp9 {
    public static void main(String[] args) {
        ReservationThread r = new ReservationThread();
        StatusThread s = new StatusThread();
        Thread t = new Thread(s);
        r.start();
        t.start();
    }
}