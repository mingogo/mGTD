package com.mteng.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mteng.mongodb.dao.MongodbDAO;
import com.mteng.util.ObjectToJSON;
import com.mteng.vo.gtd.MasterJSON;
import com.mteng.vo.gtd.builder.JSONMasterBuilder;

@Controller
@RequestMapping("/gtd")
public class AddEtryWithParmController {

	@RequestMapping(value = "/{name}/{body}", method = RequestMethod.GET)

	public String getMovie(@PathVariable String name,@PathVariable String body,
	ModelMap model) throws JsonGenerationException, JsonMappingException,
	IOException {

		ObjectToJSON objectToJSON = new ObjectToJSON();
		model.addAttribute("name", name);
		model.addAttribute("body", body);

		MongodbDAO mongodbDAO = new MongodbDAO();
		MasterJSON json = new MasterJSON();

		json.setEntryName(name);
		json.setEntryBody(body);

		mongodbDAO.addData(objectToJSON.convertedJSON_inString(json));
		Integer counter = mongodbDAO.documentsCounter();

		model.addAttribute("result", "Entries added successfully.");
		model.addAttribute("counter", counter);

		return "gtdParaFetched";
	}

	/**
	 * 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {
		model.addAttribute("movie", "this is default movie");
		return "list";
	}
	 */
}