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
import com.virtualspace.database.model.UserFavorite;

/**
 * 用户服务
 * @author denghw
 */

@Path("/userFavorite")
public interface UserFavoriteService
{
	@GET
	@Path("/querypk/{userFavoritepk}")
	@Produces({ MediaType.APPLICATION_JSON })
	UserFavorite getUserFavoriteByPk(@PathParam("userFavoritepk") String userFavoritepk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<UserFavorite> getUserFavoritesByPks(List<String> userFavoritepks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(UserFavorite userFavorite) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(UserFavorite userFavorite) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(UserFavorite userFavorite) throws ServiceException;
}