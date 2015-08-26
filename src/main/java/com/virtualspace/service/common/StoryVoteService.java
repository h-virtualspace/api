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
import com.virtualspace.database.model.StoryVote;

/**
 * 用户服务
 * @author denghw
 */

@Path("/storyVote")
public interface StoryVoteService
{
	@GET
	@Path("/querypk/{storyVotepk}")
	@Produces({ MediaType.APPLICATION_JSON })
	StoryVote getStoryVoteByPk(@PathParam("storyVotepk") String storyVotepk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<StoryVote> getStoryVotesByPks(List<String> storyVotepks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(StoryVote storyVote) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(StoryVote storyVote) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(StoryVote storyVote) throws ServiceException;
}