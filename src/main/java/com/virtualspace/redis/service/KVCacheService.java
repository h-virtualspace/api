package com.virtualspace.redis.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/cache")
public interface KVCacheService
{
	/**
	 * 设置字符串缓存
	 * @param key
	 * @param value
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/keyset/{key}/{value}")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean setKeyValue(@PathParam("key") String key,@PathParam("value") String value) throws KVCacheException;
	
	/**
	 * 获取字符串值
	 * @param key
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/keyget/{key}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getKey(@PathParam("key") String key) throws KVCacheException;
	
	/**
	 * 设置key超时时间
	 * @param key
	 * @param seconds
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/keyexpire/{key}/{seconds}")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean	expire(@PathParam("key") String key,@PathParam("seconds") int seconds) throws KVCacheException;
	/**
	 * 检测key是否存在
	 * @param key
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/keyexists/{key}")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean exists(@PathParam("key") String key) throws KVCacheException;
	/**
	 * 删除keys
	 * @param keys
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/keydelete")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean deleteKeys(List<String> keys) throws KVCacheException;
}
