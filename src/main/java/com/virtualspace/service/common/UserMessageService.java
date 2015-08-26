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
import com.virtualspace.database.model.UserMessage;

/**
 * 用户服务
 * @author denghw
 */

@Path("/userMessage")
public interface UserMessageService
{
	@GET
	@Path("/querypk/{userMessagepk}")
	@Produces({ MediaType.APPLICATION_JSON })
	UserMessage getUserMessageByPk(@PathParam("userMessagepk") String userMessagepk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<UserMessage> getUserMessagesByPks(List<String> userMessagepks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(UserMessage userMessage) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(UserMessage userMessage) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(UserMessage userMessage) throws ServiceException;
}