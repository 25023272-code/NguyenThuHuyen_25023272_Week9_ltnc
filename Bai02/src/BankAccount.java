import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
        LOGGER.info("Tạo tài khoản cho {} với số dư {}", owner, initialBalance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            LOGGER.warn("Số tiền nạp không hợp lệ: {}", amount);
            return;
        }
        balance += amount;
        LOGGER.info("Nạp {} vào tài khoản {}. Số dư mới: {}", amount, owner, balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            LOGGER.warn("Số tiền rút không hợp lệ: {}", amount);
            return;
        }
        if (amount > balance) {
            LOGGER.warn("Số dư không đủ. Số dư hiện tại: {}", balance);
            return;
        }
        balance -= amount;
        LOGGER.info("Rút {} từ tài khoản {}. Số dư mới: {}", amount, owner, balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}