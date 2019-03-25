package Abstraction.BankExampleAbstraction;
/**
 * Created by skrockybulhasanrasel 04/08/18.
 */
public class GetBankInfo {

    public static void main(String[] args) {

        Bank obj;
        int charge;

        obj = new BRAC();
        obj.yearly_charge();
        charge = obj.yearly_charge();
        System.out.println("BRAC Bank yearly charge is: "+charge+" BDT");

        obj = new DBBL();
        charge = obj.yearly_charge();
        System.out.println("DBBL Bank yearly charge is: "+charge+" BDT");

        // calling method abobe is done by user/programmer

    }
}
