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
public class AddEntriesController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {

		MongodbDAO mongodbDAO = new MongodbDAO();
		JSONMasterBuilder builder = new JSONMasterBuilder();

		mongodbDAO.addData((String) builder.resultingJSON_inString());
		Integer counter = mongodbDAO.documentsCounter();

		model.addAttribute("result", "Entries added successfully.");
		model.addAttribute("counter", counter);
		return "gtdAdd";
	}
}