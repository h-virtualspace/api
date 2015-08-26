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
import com.virtualspace.database.model.StoryStory;

/**
 * 用户服务
 * @author denghw
 */

@Path("/storyStory")
public interface StoryStoryService
{
	@GET
	@Path("/querypk/{storyStorypk}")
	@Produces({ MediaType.APPLICATION_JSON })
	StoryStory getStoryStoryByPk(@PathParam("storyStorypk") String storyStorypk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<StoryStory> getStoryStorysByPks(List<String> storyStorypks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(StoryStory storyStory) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(StoryStory storyStory) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(StoryStory storyStory) throws ServiceException;
}