package com.ddb.springmvc.service;

import java.util.Map;

import com.ddb.springmvc.domain.Product;

public interface ProductService {
	Product add(Product product);

	Product get(long id);

	Product updeta(long id,Product product);

	Map<Long, Product>delete(long id);

	Map<Long, Product> getAll();
	


}
