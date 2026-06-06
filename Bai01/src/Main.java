import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Ứng dụng MathUtils khởi động");

        MathUtils math = new MathUtils();

        logger.info("Tính tổng 5 + 3 = {}", math.add(5, 3));
        logger.info("Tính hiệu 10 - 4 = {}", math.subtract(10, 4));
        logger.info("Tính tích 6 x 7 = {}", math.multiply(6, 7));
        logger.info("Tính thương 20 / 4 = {}", math.divide(20, 4));

        logger.info("Ứng dụng kết thúc");
    }
}