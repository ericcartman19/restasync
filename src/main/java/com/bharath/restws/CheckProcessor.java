package com.bharath.restws;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.bharath.restws.model.CheckList;

@Path("/checkprocessingservice")
public interface CheckProcessor {

	// cuando usamos JAXB siempre es buena practica, meter una lista de objetos
	// en una wrapper class
	@POST
	@Path("/checks")
	public Boolean processChecks(CheckList checkList); 
}
