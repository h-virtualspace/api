package com.virtualspace.service.checkcode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.here.framework.service.ServiceException;

@Path("/checkcode")
public interface CheckCodeService 
{
	@GET
	@Path("/telephone/{telephone}/{number}")
	@Produces(MediaType.APPLICATION_JSON)
	public int sendCheckCodeByTelephone(@PathParam("telephone") String telephone,@PathParam("number") int number) throws ServiceException;
	
	@GET
	@Path("/email/{email}/{number}")
	@Produces(MediaType.APPLICATION_JSON)
	public int sendCheckCodeByEmail(@PathParam("email") String email,@PathParam("number") int number) throws ServiceException;
}