package com.mteng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mteng.mongodb.dao.MongodbDAO;
import com.mteng.vo.gtd.builder.JSONMasterBuilder;

@Controller
@RequestMapping("/gtd")
public class CountEntriesController {

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {

		MongodbDAO mongodbDAO = new MongodbDAO();
		Integer counter = mongodbDAO.documentsCounter();

		model.addAttribute("result", "Count the entries.");
		model.addAttribute("counter", counter);
		return "gtdCount";
	}
}