package pe.com.cema.springboot.demo.service;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public class SumStrategy implements OperationStrategy {
    @Override
    public BigDecimal makeOperation(BigDecimal[] numbers) {
        AtomicReference<BigDecimal> result = new AtomicReference<>(BigDecimal.ZERO);
        Stream.of(numbers).forEach(i -> result.set(result.get().add(i)));
        return result.get();
    }
}

