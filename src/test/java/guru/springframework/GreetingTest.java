package guru.springframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetingTest {

	@Test
	void helloWorld() {
		Greeting greeting = new Greeting();
		
		System.out.println(greeting.helloWorld());
	}

	@Test
	void helloWorld1() {
		Greeting greeting = new Greeting();
		
		System.out.println(greeting.helloWorld("Paolo"));
	}

}
