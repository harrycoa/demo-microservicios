package pe.com.cema.springboot.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.com.cema.springboot.demo.model.entity.OperationBean;
import pe.com.cema.springboot.demo.rest.controller.OperationRestController;

import java.math.BigDecimal;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private OperationRestController operationRestController;
	@Test
	void testWhenSumTwoNumbersThenResultIsFive() {
		final OperationBean operationBean = OperationBean.builder().operator("suma")
				.numbers(new BigDecimal[]{
						new BigDecimal("1"),
						new BigDecimal("4")
				}).build();
		BigDecimal resultado = operationRestController.makeOperation(operationBean);
		Assertions.assertEquals(new BigDecimal("5"), resultado);
		//Assertions.assertEquals(expected: null, resultado);
	}


}
