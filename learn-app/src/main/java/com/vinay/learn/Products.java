package com.vinay.learn;

public class Products {

	private int productId;
	private String productName;
	private String productCompany;
	private long productCost;
	private String productDesc;
	private String productCategrory;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCompany() {
		return productCompany;
	}

	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}

	public long getProductCost() {
		return productCost;
	}

	public void setProductCost(long productCost) {
		this.productCost = productCost;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductCategrory() {
		return productCategrory;
	}

	public void setProductCategrory(String productCategrory) {
		this.productCategrory = productCategrory;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productCompany="
				+ productCompany + ", productCost=" + productCost + ", productDesc=" + productDesc
				+ ", productCategrory=" + productCategrory + "]";
	}

}
