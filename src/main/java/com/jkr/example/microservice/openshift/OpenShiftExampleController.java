package com.jkr.example.microservice.openshift;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class OpenShiftExampleController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	Map<String,String> getPrice() {
		
		Map<String,String> priceMap = new HashMap<String,String>();
		priceMap.put("BTC", "10000");
		priceMap.put("ETH", "843");
	
		return priceMap;
	}


}
