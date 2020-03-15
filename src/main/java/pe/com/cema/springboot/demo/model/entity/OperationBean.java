package pe.com.cema.springboot.demo.model.entity;

//import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperationBean {

    private String operator;
    private BigDecimal[] numbers;

}
