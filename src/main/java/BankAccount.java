import java.math.BigDecimal;

public class BankAccount {
    BigDecimal balance;
    String accountNumber = "671543822546";

    public static void main(String[] args) {
        BankAccount tmp = new BankAccount();
        tmp.setBalance(new BigDecimal(2000.00));
        tmp.credit(new BigDecimal(150.00));
        tmp.debet(new BigDecimal(200.00));
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal credit(BigDecimal credit) {
        //BigDecimal credit = new BigDecimal(200.00);
        balance = balance.add(credit);
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            System.out.print("Not enough money");
        }
        return balance;
    }

    public BigDecimal debet(BigDecimal debet) {
        //BigDecimal debet = new BigDecimal(150.00);
        balance = balance.subtract(debet);
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            System.out.print("Not enough money");
        }
        return balance;
    }
}

