package mypackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyServiceTest {
	@Test
	public void test_returnsHelloWorld() {
		assertEquals("<h1>Hello World!</h1>", new MyService().test());
	}
}
