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
import com.virtualspace.database.model.HotPosition;

/**
 * 用户服务
 * @author denghw
 */

@Path("/hotPosition")
public interface HotPositionService
{
	@GET
	@Path("/querypk/{hotPositionpk}")
	@Produces({ MediaType.APPLICATION_JSON })
	HotPosition getHotPositionByPk(@PathParam("hotPositionpk") String hotPositionpk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<HotPosition> getHotPositionsByPks(List<String> hotPositionpks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(HotPosition hotPosition) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(HotPosition hotPosition) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(HotPosition hotPosition) throws ServiceException;
}