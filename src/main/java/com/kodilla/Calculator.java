package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}
	public static void main(String[] args) {
	SpringApplication.run(Calculator.class, args);

	Calculator calculator = new Calculator();
	System.out.println(calculator.add(5,6));
	System.out.println(calculator.subtract(5,6));
	}

}
