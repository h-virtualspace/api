package com.virtualspace.service.register;

import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.here.framework.service.ServiceException;
import com.virtualspace.database.model.User;

@Path("/register")
public interface RegisterService 
{
	@POST
	@Path("/telephone")
	@Produces(MediaType.APPLICATION_JSON)
	public User registerUserByTelephone(@MatrixParam("telephone") String telephone,@MatrixParam("password") String password,@MatrixParam("checkCode") String checkCode) throws ServiceException;
	
	@POST
	@Path("/email")
	@Produces(MediaType.APPLICATION_JSON)
	public User registerUserByEmail(@MatrixParam("email") String email,@MatrixParam("password") String password) throws ServiceException;
}
