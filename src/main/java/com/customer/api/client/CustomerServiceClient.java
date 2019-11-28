package com.customer.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customer.api.domain.CustomerOrders;


@FeignClient(name="customer-orders-service")
public interface CustomerServiceClient {
	@GetMapping("/customerOrders/getCustomersOrders/{customerId}")
	public List<CustomerOrders> getCustomerProducts(@PathVariable String customerId);
}
