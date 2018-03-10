package com.bharath.restws;

import javax.ws.rs.container.AsyncResponse;

import com.bharath.restws.model.CheckList;

public class CheckProcessorImpl implements CheckProcessor {

	@Override
	public Boolean processChecks(AsyncResponse response, CheckList checkList) {
		return true;
	}
	
	

}
