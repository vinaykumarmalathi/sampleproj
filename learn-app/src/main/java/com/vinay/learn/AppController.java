package com.vinay.learn;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class AppController {

	@Autowired
	ProductDAO dao; // single ton object

	@RequestMapping("/product-details")
	public List<Products> getProductDetails() {
		System.out.println("updated 123" );
		ArrayList<Products> productDetails = (ArrayList<Products>) dao.getProductDetails();
		return productDetails;
	}
}
