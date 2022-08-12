package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import Entities.Product;

public class Program17 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD", 80.90));
		
		list.forEach(null);
		
		System.out.println("Icaro");
		

		}
	}





		//list.removeIf(p -> p.getPrice() >= 100); --- normal
		//list.removeIf(new ProductPredicate()); --- interface
		//list.removeIf(Product :: staticProductPredicate); --- Reference method com método estático
		//list.removeIf(Product :: nonstaticProductPredicate); --- Reference method sem método estático
		//Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		//list.removeIf(pred);












