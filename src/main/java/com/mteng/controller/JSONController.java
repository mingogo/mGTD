package com.mteng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mteng.vo.gtd.Shop;

/**
 * The json integrated with SpringMVC sample from Mkyong. 
 * To test: http://localhost:8081/mGTD/kfc/brands/kfc-kampar
 * @author mteng
 *
 */
@Controller
@RequestMapping("/kfc/brands")
public class JSONController {
	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody
	Shop getShopInJSON(@PathVariable String name) {
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[] { "mkyong1", "mkyong2" });
		return shop;
	}
}