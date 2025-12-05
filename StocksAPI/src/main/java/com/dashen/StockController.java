package com.dashen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

	@RequestMapping(value="/stocks", method=RequestMethod.GET)
	public String m1() {
		return "A list of stocks - attempt2";
	}
}
