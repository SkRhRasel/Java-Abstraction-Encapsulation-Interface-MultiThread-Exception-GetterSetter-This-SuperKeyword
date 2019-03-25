package Interface.PaymentInterface;

public class CashPayment implements Payment {

    @Override
    public long getAmount(){
        System.out.println("Taking Cash Payment");
        return 500;
    }
}
