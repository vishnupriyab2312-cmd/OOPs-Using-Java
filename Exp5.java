package exp5;
class Payment {

    void makePayment() {
        System.out.println("Payment Mode");
    }

    void makePayment(double amount) {
        System.out.println("Payment of Rs: " + amount);
    }

    void makePayment(double amount, String mode) {
        System.out.println("Payment of Rs: " + amount + " using " + mode);
    }
}

class UPIPayment extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("UPI Payment of Rs: " + amount);
    }
}

public class Exp5 {

    public static void main(String[] args) {

        UPIPayment upi = new UPIPayment();

        upi.makePayment();
        upi.makePayment(500);
        upi.makePayment(500, "UPI");

        Payment p = new UPIPayment();
        p.makePayment(1500);

        System.out.println("Payment Completed Successfully");
    }
}