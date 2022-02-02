package com.mouritech.springframework.helloworld;

import org.springframework.stereotype.Service;

@Service("CustomerService")
public class CustomerDetails {

	
	private int customerId;
	private String customerName;
	private String customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}
}
