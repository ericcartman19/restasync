package com.bharath.restws;

import javax.ws.rs.container.AsyncResponse;

import com.bharath.restws.model.CheckList;

public class CheckProcessorImpl implements CheckProcessor {

	@Override
	public void processChecks(AsyncResponse response, CheckList checkList) {
		
		new Thread() {
			public void run() {
				response.resume(true);
			}
		}.start();
	}

}
