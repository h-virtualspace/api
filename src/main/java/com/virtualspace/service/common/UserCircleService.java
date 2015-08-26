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
import com.virtualspace.database.model.UserCircle;

/**
 * 用户服务
 * @author denghw
 */

@Path("/userCircle")
public interface UserCircleService
{
	@GET
	@Path("/querypk/{userCirclepk}")
	@Produces({ MediaType.APPLICATION_JSON })
	UserCircle getUserCircleByPk(@PathParam("userCirclepk") String userCirclepk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<UserCircle> getUserCirclesByPks(List<String> userCirclepks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(UserCircle userCircle) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(UserCircle userCircle) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(UserCircle userCircle) throws ServiceException;
}