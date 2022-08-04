package Aplication;

import Entities.Client;

public class Program11 {

	public static void main(String[] args) {

		
	/*  String a = "Maria";
		String b = "Icaro";
		
		equals = igual a
		System.out.println(a.equals(b));
		
		hashCode = geração de codigo hash
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());  */
		
		String s1 = "test";
		String s2 = "test";
		
		
		Client c1 = new Client("Maria", "icaroizext@gmail.com");
		Client c2 = new Client("Maria", "icaroizext@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);	
		
		System.out.println(s1 == s2);	
		
	}

}
