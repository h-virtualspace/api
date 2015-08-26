package com.virtualspace.service.social;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.here.framework.service.ServiceException;

@Path("/social")
public interface SocialService 
{
	@GET
	@Path(value = "/all/{lon}/{lat}/{distance}/{limit}/{sortType}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<SocialAllItem> socialAllNoUser(@PathParam("lon") double lon,@PathParam("lat") double lat,@PathParam("distance") int distance,@PathParam("limit") int limit,@PathParam("sortType") String sortType) throws ServiceException;
}