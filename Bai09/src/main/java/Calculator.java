package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        LOGGER.info("Tính tổng: {} + {}", a, b);
        return a + b;
    }

    public int subtract(int a, int b) {
        LOGGER.info("Tính hiệu: {} - {}", a, b);
        return a - b;
    }

    public int multiply(int a, int b) {
        LOGGER.info("Tính tích: {} x {}", a, b);
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            LOGGER.error("Lỗi: Chia cho 0!");
            throw new ArithmeticException("Không thể chia cho 0");
        }
        LOGGER.info("Tính thương: {} / {}", a, b);
        return (double) a / b;
    }
}