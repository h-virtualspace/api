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
import com.virtualspace.database.model.StorySchedule;

/**
 * 用户服务
 * @author denghw
 */

@Path("/storySchedule")
public interface StoryScheduleService
{
	@GET
	@Path("/querypk/{storySchedulepk}")
	@Produces({ MediaType.APPLICATION_JSON })
	StorySchedule getStoryScheduleByPk(@PathParam("storySchedulepk") String storySchedulepk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<StorySchedule> getStorySchedulesByPks(List<String> storySchedulepks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(StorySchedule storySchedule) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(StorySchedule storySchedule) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(StorySchedule storySchedule) throws ServiceException;
}