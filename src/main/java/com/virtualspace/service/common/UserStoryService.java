package com.virtualspace.service.common;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.here.framework.service.ServiceException;
import com.virtualspace.database.model.UserStory;

/**
 * 用户服务
 * @author denghw
 */

@Path("/userStory")
public interface UserStoryService
{
	@GET
	@Path("/querypk/{userStorypk}")
	@Produces({ MediaType.APPLICATION_JSON })
	UserStory getUserStoryByPk(@PathParam("userStorypk") String userStorypk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<UserStory> getUserStorysByPks(List<String> userStorypks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(UserStory userStory) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(UserStory userStory) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(UserStory userStory) throws ServiceException;
}