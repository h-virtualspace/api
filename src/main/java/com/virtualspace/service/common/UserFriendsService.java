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
import com.virtualspace.database.model.UserFriends;

/**
 * 用户服务
 * @author denghw
 */

@Path("/userFriends")
public interface UserFriendsService
{
	@GET
	@Path("/querypk/{userFriendspk}")
	@Produces({ MediaType.APPLICATION_JSON })
	UserFriends getUserFriendsByPk(@PathParam("userFriendspk") String userFriendspk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<UserFriends> getUserFriendssByPks(List<String> userFriendspks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(UserFriends userFriends) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(UserFriends userFriends) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(UserFriends userFriends) throws ServiceException;
}