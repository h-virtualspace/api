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
import com.virtualspace.database.model.UserSysSetting;

/**
 * 用户服务
 * @author denghw
 */

@Path("/userSysSetting")
public interface UserSysSettingService
{
	@GET
	@Path("/querypk/{userSysSettingpk}")
	@Produces({ MediaType.APPLICATION_JSON })
	UserSysSetting getUserSysSettingByPk(@PathParam("userSysSettingpk") String userSysSettingpk) throws ServiceException;
	
	@POST
	@Path("/querypks")
	@Produces({ MediaType.APPLICATION_JSON })
	List<UserSysSetting> getUserSysSettingsByPks(List<String> userSysSettingpks) throws ServiceException;
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean insert(UserSysSetting userSysSetting) throws ServiceException;
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean update(UserSysSetting userSysSetting) throws ServiceException;
	
	@DELETE
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	Boolean delete(UserSysSetting userSysSetting) throws ServiceException;
}