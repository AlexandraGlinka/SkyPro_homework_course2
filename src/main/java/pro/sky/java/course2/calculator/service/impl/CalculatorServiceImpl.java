package pro.sky.java.course2.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.service.CalculatorService;
@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
