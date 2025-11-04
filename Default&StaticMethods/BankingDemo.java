import java.util.*;

interface bank{
    void accountType();
    default void intrestrate(){
        System.out.println("General Bank Interest: 4%");
    }
    static void kycdocuments(){
        System.out.println("Provide ID proofs, Adress proof, Photo");
    }
}

class SBI implements bank{
    @Override
    public void accountType() {
        System.out.println("Savings Account");
    }
    @Override
    public void intrestrate() {
        System.out.println("SBI intrest: 5%");
    }
}
class ICICI implements bank{
    @Override
    public void accountType() {
        System.out.println("Current Account");
    }
}

public class BankingDemo {
    public static void main(String[] args) {
        bank sbi=new SBI();
        sbi.accountType();
        sbi.intrestrate();

        bank icici=new ICICI();
        icici.accountType();
        icici.intrestrate();

        bank.kycdocuments();



    }
}
