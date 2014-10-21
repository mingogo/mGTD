package com.mteng.app;

import com.mteng.util.PrettyPrints;
import com.mteng.vo.updatedJSON.builder.*;

public class RunJSONMasterBuilder_UpdatedJSON {
	public static void main(String[] args) {
		PrettyPrints prettyPrints = new PrettyPrints();
		JSONMasterBuilder JSONMaster = new JSONMasterBuilder();
		String Indentedoutput = prettyPrints.resultingJson(JSONMaster.resultingJSONinString());
		System.out.println(Indentedoutput);
	}
}
