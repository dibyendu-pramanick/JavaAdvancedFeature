package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String args[]) {
		
		List<Product> productList = new ArrayList<>();
		Product p1 = new Product();
		p1.setBrand("Del");
		p1.setPrice(35000);
		Product p2 = new Product();
		p2.setBrand("Apple");
		p2.setPrice(100000);
		
		productList.add(p1);
		productList.add(p2);
		
		List<Double> priceList = new ArrayList<>();
		
		priceList = productList.stream()
				.filter(p-> p.getPrice() > 50000)
				.map(p -> p.getPrice())
				.collect(Collectors.toList());
		
		System.out.println(priceList);
		
		//filter - intermediate operation
		//foreach - terminal operation
		productList.stream()
		.filter(p-> p.getPrice() > 50000)
		.forEach(p->System.out.println(p.getBrand() + " - " + p.getPrice()));
		
	}
}


class Product {
	
	String brand;
	double price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
