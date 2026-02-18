package com.klu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.Calcservice;
@RestController
@RequestMapping("/caluclator")
public class CalcController {
	@Autowired
          private Calcservice service;
	
	       @RequestMapping("/add")
	       //type=request parameter
	       //link=http://localhost:8080/caluclator/add?a=10&b=5

	       public int add(@RequestParam int a,@RequestParam int b) {
	    	   return service.add(a, b);
	       }
	       @RequestMapping("/subtract/{a}/{b}")
	       //type=path variable
	       //link=http://localhost:8080/caluclator/subtract/10/5

	       public  int subtract(@PathVariable int a,@PathVariable int b) {
	    	   return service.subtract(a, b);
	       }
	       @RequestMapping("/multiply/{a}/{b}")
	       //type=path variable
	       //link=http://localhost:8080/caluclator/multiply/10/5

	       public  int multiply(@PathVariable int a,@PathVariable int b) {
	    	   return service.multiply(a, b);
	       }
	       @RequestMapping("/divide")
	       //type=request parameter
	       //link=http://localhost:8080/caluclator/divide?a=10&b=5

	       public double divide(@RequestParam int a,@RequestParam int b) {
	    	   return service.divide(a, b);
	       }
	       @RequestMapping("/modulo/{a}/{b}")
	       //type=path variable
	       //link=http://localhost:8080/caluclator/modulo/10/5

	       public  int modulo(@PathVariable int a,@PathVariable int b) {
	    	   return service.modulo(a, b);
	       }
	       
}
