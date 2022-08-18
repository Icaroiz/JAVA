package Model.Services;

import java.util.List;

import Entities.Product;

public class ProductService {

	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for (Product p : list) {
			if (p.getName().charAt(0) == 'T') {
			sum += p.getPrice();
			
			}
		}
		return sum;
	}
}
