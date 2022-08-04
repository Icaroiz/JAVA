package Aplication;

import java.util.ArrayList;
import java.util.List;

import Entities.Product;

public class Program15 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Controle", 400.00));
		
		list.sort((p1,p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}	
	}
}




/*new Comparator<Product>() {
@Override
public int compare(Product p1, Product p2) {
return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
}	};*/







