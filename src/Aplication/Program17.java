package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Entities.Product;
import Model.Services.ProductService;

public class Program17 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD", 80.90));
		list.add(new Product("Notepad", 50.00));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
		}
	}
		
		//PREDICATE
		//list.removeIf(p -> p.getPrice() >= 100); --- normal
		//list.removeIf(new ProductPredicate()); --- interface
		//list.removeIf(Product :: staticProductPredicate); --- Reference method com método estático
		//list.removeIf(Product :: nonstaticProductPredicate); --- Reference method sem método estático
		//Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		//list.removeIf(pred);

		//CONSUMER
		//list.forEach(new PriceUpdate()); --- criando uma classe
		//list.forEach(Product :: staticPriceUpdate);	--- com metodo statico
		//list.forEach(Product :: nonstaticPriceUpdate); --- sem metodo statico
		/*double value = 1.1;
		Consumer<Product> cons = p -> {
		p.setPrice(p.getPrice() * value); };
		list.forEach(cons);
		list.forEach(System.out::println);*/

		/*PREDICATE
		List<String> names = list.stream().map(Product :: staticUpperCaseName).collect(Collectors.toList());
		List<String> names = list.stream().map(Product :: nonstaticUpperCaseName).collect(Collectors.toList());
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); 
		Function<Product, String> func = p -> p.getName().toUpperCase();
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out :: println);*/




