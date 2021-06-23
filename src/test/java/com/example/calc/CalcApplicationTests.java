package com.example.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalcApplicationTests {


	private Calculator calculator;
	@BeforeEach
	public void setup () {
		calculator = new Calculator();
	}


	@Test
	@DisplayName("test sum")
	void test1() {
		Integer first = 3;
		Integer second = 7;
		Integer expected = 10;

		assert calculator.sum(first,second).equals(expected);
	}


	@Test
	@DisplayName("test substraction")
	void test2() {
		Integer first = 12;
		Integer second = 4;
		Integer expected = 8;

		assert calculator.substract(first,second).equals(expected);
	}


	@Test
	@DisplayName("test multiply")
	void test3() {
		Integer first = 3;
		Integer second = 5;
		Integer expected = 15;

		assert calculator.multiply(first,second).equals(expected);
	}


	@Test
	@DisplayName("test divide")
	void test4() {
		Integer first = 30;
		Integer second = 6;
		Integer expected = 5;

		assert calculator.divide(first,second).equals(expected);
	}


	@Test
	@DisplayName("test exponentiation")
	void test5() {
		Integer first = 3;
		Integer second = 3;
		Integer expected = 27;
		assert calculator.exp(first,second).equals(expected);
	}

	@Test
	@DisplayName("test find sqrt")
	void test6() {
		double first = 9;
		double expected = 3;
		assert calculator.sqrt(first)==(expected);
	}

	@Test
	@DisplayName("test round")
	void test7() {
		double first = 9.67;
		double expected = 10;
		assert calculator.round(first)==(expected);
	}


}
