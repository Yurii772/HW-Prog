import java.math.BigDecimal;

public class BankAccount {
    BigDecimal balance;
    String accountNumber = "671543822546";

    public static void main(String[] args) {
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void credit(BigDecimal balance) {
        BigDecimal credit = new BigDecimal(200.00);
        balance = balance.subtract(credit);
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            System.out.print("Not enough money");
        }
    }

    public BigDecimal debet(BigDecimal balance) {
        BigDecimal debet = new BigDecimal(150.00);
        balance = balance.add(debet);
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            System.out.print("Not enough money");
        }
        return balance;
    }
}

