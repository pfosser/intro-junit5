package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
	
	private Greeting greeting;

	@BeforeEach
	void beforeEach() {
		System.out.println("In before each...");
		greeting = new Greeting();
	}

	@Test
	void helloWorld() {
		System.out.println(greeting.helloWorld());
	}

	@Test
	void helloWorld1() {
		System.out.println(greeting.helloWorld("Paolo"));
	}

}
