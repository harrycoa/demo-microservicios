package pe.com.cema.springboot.demo.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.cema.springboot.demo.factory.OperationFactory;
import pe.com.cema.springboot.demo.model.entity.OperationBean;
import pe.com.cema.springboot.demo.service.OperationStrategy;

import java.math.BigDecimal;

@RestController
@RequestMapping("/operations")
@AllArgsConstructor
public class OperationRestController {

    private OperationFactory operationFactory;
    @PostMapping
    public BigDecimal makeOperation(@RequestBody OperationBean operationBean) {
        final OperationStrategy operationStrategy;
        BigDecimal result;
        operationStrategy = operationFactory.getStrategy(operationBean.getOperator());
        result = operationStrategy.makeOperation(operationBean.getNumbers());
        return result;
    }
}
