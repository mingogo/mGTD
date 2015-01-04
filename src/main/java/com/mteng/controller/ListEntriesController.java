package com.mteng.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mteng.mongodb.dao.MongodbDAO;
import com.mteng.vo.gtd.builder.JSONMasterBuilder;

@Controller
@RequestMapping("/gtd")
public class ListEntriesController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {

		MongodbDAO mongodbDAO = new MongodbDAO();

		ArrayList<String> resultArrayList = mongodbDAO.fetchEntries();

		/**
		 * 
		for(String item : output){
			System.out.println(item.toString());
		}
		 */

		Integer counter = mongodbDAO.documentsCounter();

		model.addAttribute("result", "List the entries.");
		model.addAttribute("resultArrayList", resultArrayList);
		model.addAttribute("counter", counter);
		return "gtdList";
	}
}