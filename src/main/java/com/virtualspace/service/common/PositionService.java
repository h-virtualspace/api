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
import com.virtualspace.database.model.Position;

/**
 * 用户服务
 * @author denghw
 */

@Path("/position")
public interface PositionService
{
	@GET
	@Path("/querypk/{positionpk}")
	@Produces({ MediaType.APPLICATION_JSON })
	Position getPositionByPk(@PathParam("positionpk") String positionpk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<Position> getPositionsByPks(List<String> positionpks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(Position position) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(Position position) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(Position position) throws ServiceException;
}