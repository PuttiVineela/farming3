package com.example.farming3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class productcontroller {
@GetMapping(path="/microdetail")
	public boolean Accountdetails(@RequestParam String accId) {
		if(accId!=null) {
			if(accId.substring(0,3).equals("01")) {
				return true;
			}
		}return false;
	}
 
}
