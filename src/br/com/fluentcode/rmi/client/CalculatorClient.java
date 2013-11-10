package br.com.fluentcode.rmi.client;

import java.rmi.Naming;

import br.com.fluentcode.rmi.common.Calculator;

public class CalculatorClient {
	
	public static void main(String[] args) throws Exception {
		String url = "rmi://localhost:1099/calculator";
		Calculator remote = (Calculator) Naming.lookup(url);
		int value = remote.add(1, 4);
		System.out.println(value);
	}

}
