package Abstraction.Exercise111;

public class BankInformation {
    public static void main(String[] args){

        BangladeshBank amniObject;

        double charge_value;


        MutualTrustBank obj1 = new MutualTrustBank();
        charge_value = obj1.yearly_charge();
        System.out.println("Mutual Trust Bank Yearly Charge: "+ charge_value);

        PrimeBank obj2 = new PrimeBank();
        charge_value = obj2.yearly_charge();
        System.out.println("Prime Bank Yearly Charge: "+ charge_value);

    }
}
