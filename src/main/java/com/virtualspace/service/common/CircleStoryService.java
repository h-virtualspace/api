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
import com.virtualspace.database.model.CircleStory;

/**
 * 用户服务
 * @author denghw
 */

@Path("/circleStory")
public interface CircleStoryService
{
	@GET
	@Path("/querypk/{circleStorypk}")
	@Produces({ MediaType.APPLICATION_JSON })
	CircleStory getCircleStoryByPk(@PathParam("circleStorypk") String circleStorypk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<CircleStory> getCircleStorysByPks(List<String> circleStorypks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(CircleStory circleStory) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(CircleStory circleStory) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(CircleStory circleStory) throws ServiceException;
}