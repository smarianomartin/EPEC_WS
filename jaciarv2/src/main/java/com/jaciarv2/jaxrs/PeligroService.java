package com.jaciarv2.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jaciarv2.data.PeligroDao;
import com.jaciarv2.entities.PeligroWS_VM;

@Path("/peligro") 
public class PeligroService {
	PeligroDao dao = new PeligroDao();
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response setPeligro(PeligroWS_VM peligro){
		try{
			
			int id = dao.savePeligro(peligro);
			return Response.ok(id).build();
		}
		catch(Exception e){
			return Response.serverError().build();
		}
	}
}
