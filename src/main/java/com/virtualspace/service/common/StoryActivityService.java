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
import com.virtualspace.database.model.StoryActivity;

/**
 * 用户服务
 * @author denghw
 */

@Path("/storyActivity")
public interface StoryActivityService
{
	@GET
	@Path("/querypk/{storyActivitypk}")
	@Produces({ MediaType.APPLICATION_JSON })
	StoryActivity getStoryActivityByPk(@PathParam("storyActivitypk") String storyActivitypk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<StoryActivity> getStoryActivitysByPks(List<String> storyActivitypks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(StoryActivity storyActivity) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(StoryActivity storyActivity) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(StoryActivity storyActivity) throws ServiceException;
}