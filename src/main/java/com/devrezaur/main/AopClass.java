package com.devrezaur.main;

import org.springframework.stereotype.Component;

@Component
public class AopClass {
	
	public void hello() {
		System.out.println("Welcome to AOP!");
	}
	
	public void printSomething(String something) {
		System.out.println(something);
	}

	public Double calculate(double x, double y, double z){
		return x/(y+z);
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
}
