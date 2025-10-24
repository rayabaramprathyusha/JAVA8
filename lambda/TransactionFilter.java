import java.util.*;
import java.util.function.Predicate;

class Transaction {
    String id;
    double amount;
    String type;

    Transaction(String id, double amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }
}

public class TransactionFilter {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("T001", 1500, "Credit"),
                new Transaction("T002", 500, "Debit"),
                new Transaction("T003", 2500, "Credit"),
                new Transaction("T004", 300, "Debit")
        );

        Predicate<Transaction> highValueCredit =
                t -> t.amount > 1000 && t.type.equals("Credit");

        transactions.stream()
                .filter(highValueCredit)
                .forEach(t -> System.out.println("High Value Credit: " + t.id + " → " + t.amount));
    }
}
