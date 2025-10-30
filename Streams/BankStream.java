import java.util.*;
import java.util.stream.*;

class Transaction{
    String type;
    double amount;

    public Transaction(String type,double amount){
        this.type=type;
        this.amount=amount;
    }
    @Override
    public String toString() {
        return "type=" + type + ", amount=" + amount;
    }
}

public class BankStream {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("Credit",8000),
                new Transaction("Debit",9000),
                new Transaction("credit",5000)
        );

        System.out.println("All transactions:");
        transactions.forEach(System.out::println);

        double totalcredits=transactions.stream()
                .filter(t->t.type.equalsIgnoreCase("credit"))
                .map(t->t.amount)
                .reduce(0.0,Double::sum);
        System.out.println("Total credit amount: "+totalcredits);

    }
}
