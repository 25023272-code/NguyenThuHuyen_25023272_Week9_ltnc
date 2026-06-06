package main.java.com.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShippingCalculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShippingCalculator.class);

    public double calculate(double weight, String type) {
        if (weight <= 0) {
            LOGGER.error("Weight must be positive, got: {}", weight);
            throw new IllegalArgumentException("Weight must be positive");
        }
        if (type.equals("EXPRESS")) {
            LOGGER.info("EXPRESS shipping for weight: {}", weight);
            return weight * 5000 + 20000;
        }
        if (type.equals("STANDARD")) {
            LOGGER.info("STANDARD shipping for weight: {}", weight);
            return weight * 3000;
        }
        LOGGER.error("Unknown type: {}", type);
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}