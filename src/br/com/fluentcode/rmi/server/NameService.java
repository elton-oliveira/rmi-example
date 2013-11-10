package br.com.fluentcode.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import br.com.fluentcode.rmi.common.Calculator;

/**
 * 
 * Object catalog. Available objects on port 1099
 *
 */
public class NameService {
	
	public static void main(String[] args) throws Exception {
		
		Calculator calculator = new CalculatorImpl();
		
		//up the name server rmiregitry on the default port 1099
		LocateRegistry.createRegistry(1099);
		
		Naming.rebind("calculator", calculator);
		
		System.out.println("server up");
	}

}
