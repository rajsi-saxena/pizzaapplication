package in.ac.sharda.pizzaapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizzaapplication.domain.Product;

@RestController
public class ProductListController {
	@GetMapping("/product/list")
	public List<Product> products(){
		List<Product> products=new ArrayList<Product>();
		for(int i=1; i<20; i++) {
			products.add(new Product("Name"+i,"desc"+i,i,i*10));
		}
		return products;
	}

}
