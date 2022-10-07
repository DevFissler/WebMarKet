package com.survival.domain.model;

import java.util.Objects;


public class Product {
	public static void main(String[] args) {
		Product product = new Product("33", "33", 11);
		System.out.println(product);

		Product product2 = new Product("33", "33", 11);
		System.out.println(product2);


	}

	private String id;
	private String name;
	private int unitprice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private String condition;


	public Product(String id, String name, int unitprice) {
		this.id = id;
		this.name = name;
		this.unitprice = unitprice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitPrice() {
		return unitprice;
	}

	public void setUnitPrice(int unitprice) {
		this.unitprice = unitprice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(long unitInStock) {
		this.unitsInStock = unitInStock;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", unitprice=" + unitprice + ", description=" + description
				+ ", manufacturer=" + manufacturer + ", category=" + category + ", unitsInStock=" + unitsInStock
				+ ", condition=" + condition + "]";
	}

}