
package pe.com.cema.springboot.demo.factory;

import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.stereotype.Component;
import pe.com.cema.springboot.demo.service.OperationStrategy;
import pe.com.cema.springboot.demo.service.SumStrategy;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


@Component
public class OperationFactory {
    private ConcurrentMap<String, OperationStrategy> strategies = new ConcurrentHashMap<>();
    public OperationFactory() {
        initStrategies();
    }
    public OperationStrategy getStrategy(String operando) {
        if (StringUtils.isNotBlank(operando) && strategies.containsKey(operando)) {
            return strategies.get(operando);
        }
        throw new IllegalArgumentException("Operador no encontrado");
    }
    private void initStrategies() {
        strategies.put("suma", new SumStrategy());
        //strategies.put("resta", new SubtractStrategy());
    }
}