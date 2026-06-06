import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Khởi động hệ thống BankSystem");

        BankAccount account = new BankAccount("Nguyen Thu Huyen", 1000000);

        account.deposit(500000);
        account.withdraw(200000);
        account.withdraw(2000000);
        account.deposit(-100);

        LOGGER.info("Số dư cuối của {}: {}", account.getOwner(), account.getBalance());
        LOGGER.info("Kết thúc hệ thống BankSystem");
    }
}