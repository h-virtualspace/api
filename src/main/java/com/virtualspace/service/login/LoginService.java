package com.virtualspace.service.login;

import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.here.framework.service.ServiceException;
import com.virtualspace.database.model.User;

/**
 * 用户服务
 * @author denghw
 *
 */
@Path("/login")
public interface LoginService
{
	@POST
	@Path("/email")
	@Produces({ MediaType.APPLICATION_JSON })
	User loginByEmail(@MatrixParam("username") String username, @MatrixParam("password") String password) throws ServiceException;
	
	@POST
	@Path("/telephone")
	@Produces({ MediaType.APPLICATION_JSON })
	User loginByTelephone(@MatrixParam("telephone") String telephone, @MatrixParam("password") String password) throws ServiceException;

}