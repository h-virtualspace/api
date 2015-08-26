package com.virtualspace.service.common;

import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.here.framework.service.ServiceException;
import com.virtualspace.database.model.User;

/**
 * 用户服务
 * @author denghw
 */

@Path("/user")
public interface UserService
{
	@GET
	@Path("/querypk/{userpk}")
	@Produces({ MediaType.APPLICATION_JSON })
	User getUserByPk(@PathParam("userpk") String userpk) throws ServiceException;
	
	@GET
	@Path("/querytelephone/{telephone}")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean isUserExistsByTelephone(@PathParam("telephone") String telephone) throws ServiceException;
	
	@GET
	@Path("/queryemail/{email}")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean isUserExistsByEmail(@PathParam("email") String email) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<User> getUsersByPks(List<String> userpks) throws ServiceException;
	
	@POST
	@Path("/queryNamesBypks")
	@Produces({ MediaType.APPLICATION_JSON })
	Map<String, String> getUserNamesByPks(List<String> userpks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(User user) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(User user) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(User user) throws ServiceException;
}