package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
	
	private Greeting greeting;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before - Im am only called once!");
	}

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
	
	@AfterEach
	void afterEach() {
		System.out.println("In after each...");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After - Im am only called once!");
	}
}
