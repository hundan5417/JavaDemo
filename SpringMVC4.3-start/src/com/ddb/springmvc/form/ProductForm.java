package com.ddb.springmvc.form;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class ProductForm {

	private Long id;
	private String name;
	private String description;
	private String price;
	private Integer age;
	private Integer time;
}
