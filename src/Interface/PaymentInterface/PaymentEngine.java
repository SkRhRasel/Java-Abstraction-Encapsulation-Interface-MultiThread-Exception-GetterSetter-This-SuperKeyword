package Interface.PaymentInterface;

public class PaymentEngine {

    public void accept(Payment payment){
        System.out.println("Accepting Payment: " + payment.getAmount());
    }
}
