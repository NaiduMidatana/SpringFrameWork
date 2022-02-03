package com.mouritech.customermanagementsystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mouritech.customermanagementsystem.model.Customer;
import com.mouritech.customermanagementsystem.model.CustomerList;

@Controller
@RequestMapping("/customer")
public class CustomerController {


	public List<Customer> custList() {
		List<Customer> cust = new ArrayList<Customer>();
		cust.add(new Customer(222,"mahesh","hyderabad"));
		cust.add(new Customer(333,"prabhas","america"));
		cust.add(new Customer(444,"charan","vizag"));
		return cust;
		
	}

	@RequestMapping(value = "/listcustomers", method = RequestMethod.GET)
	  public String getUsers(Model model) throws Exception{
	    List<Customer> custs = custList();
	    CustomerList newcustList = new CustomerList();
	    newcustList.setCustomers(custs);
	    model.addAttribute("Customers", newcustList);
	    return "customerlist";
	  }
}
