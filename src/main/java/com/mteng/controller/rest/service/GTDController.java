package com.mteng.controller.rest.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mteng.vo.gtd.MasterJSON;
import com.mteng.vo.gtd.Shop;
import com.mteng.vo.gtd.builder.JSONMasterBuilder;

@Controller
@RequestMapping("/gtd")
public class GTDController {
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Object getGTDInJSON() {
		JSONMasterBuilder jSONMasterBuilder = new JSONMasterBuilder();
		Object output = jSONMasterBuilder.resultingJSON_inObject();
		return output;
	}
}