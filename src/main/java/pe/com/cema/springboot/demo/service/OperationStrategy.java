package pe.com.cema.springboot.demo.service;

import java.math.BigDecimal;

public interface OperationStrategy {
    BigDecimal makeOperation(BigDecimal[] numbers);
}

