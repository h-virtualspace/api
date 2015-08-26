package com.virtualspace.redis.service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import redis.clients.jedis.Jedis;

@Path("/redis")
public interface RedisKVCacheService extends KVCacheService
{
	/**
	 * hash表设置单个值
	 * @param key
	 * @param field
	 * @param value
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/hset")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean	hashOneSet(String key, String field, String value) throws KVCacheException;
	
	/**
	 * hash表设置多个值
	 * @param key
	 * @param field
	 * @param value
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/hmset")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean	hashMultiSet(String key, Map<String,String> map) throws KVCacheException;
	/**
	 * hash表获取字段的值
	 * @param key
	 * @param field
	 * @param value
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/hget")
	@Produces(MediaType.APPLICATION_JSON)
	public String hashOneGet(String key, String field) throws KVCacheException;
	
	/**
	 * 根据key值获取Map
	 * @param key
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/hmget")
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, String> hashGetMap(String key) throws KVCacheException;
	/**
	 * List中栈顶（左侧）弹出值
	 * @param key
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/llpop")
	@Produces(MediaType.APPLICATION_JSON)
	public String listLeftPop(String key) throws KVCacheException;
	
	/**
	 * List中栈顶（左侧）推送值
	 * @param key
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/llpush")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean listLeftPush(String key, List<String> values) throws KVCacheException;
	
	/**
	 * List中栈顶（右侧）添加值
	 * @param key
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/lrpop")
	@Produces(MediaType.APPLICATION_JSON)
	public String listRightPop(String key) throws KVCacheException;
	
	/**
	 * List中栈顶（右侧）添加值
	 * @param key
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/lrpush")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean listRightPush(String key, List<String> values) throws KVCacheException;
	
	/**
	 * 获取List中特定位置的值，从链表左侧为0开始
	 * @param key
	 * @param index
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/lindex")
	@Produces(MediaType.APPLICATION_JSON)
	public String listIndex(String key, long index) throws KVCacheException;
	
	/**
	 * 集合中添加值
	 * @param key
	 * @param values
	 * @return long 代表添加成功的个数
	 * @throws KVCacheException
	 */
	@GET
	@Path("/sadd")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean setAdd(String key,List<String> values) throws KVCacheException;
	
	/**
	 * 集合中删除值
	 * @param key
	 * @param values
	 * @return long 代表添加成功的个数
	 * @throws KVCacheException
	 */
	@GET
	@Path("/sremove")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean setRemove(String key,List<String> values) throws KVCacheException;
	/**
	 * 获取某个Set多有的值
	 * @param key
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/sget")
	@Produces(MediaType.APPLICATION_JSON)
	public Set<String> getSet(String key) throws KVCacheException;
	/**
	 * 判断set中是否包含某个值
	 * @param key
	 * @param member
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/sexists")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean setIsExist(String key,String member) throws KVCacheException;
	
	/**
	 * 获取Set中元素个数
	 * @param key
	 * @param member
	 * @return
	 * @throws KVCacheException
	 */
	@GET
	@Path("/ssize")
	@Produces(MediaType.APPLICATION_JSON)
	public long setSize(String key) throws KVCacheException;
	
	/**
	 * 获取Jedis，供高级功能使用
	 * @return
	 * @throws RedisKVCacheException
	 */
	@GET
	@Path("/jedis")
	@Produces(MediaType.APPLICATION_JSON)
	public Jedis getJedis() throws RedisKVCacheException;
	
	/**
	 * 获取Jedis，供高级功能使用
	 * @return
	 * @throws RedisKVCacheException
	 */
	@GET
	@Path("/jedis/name")
	@Produces(MediaType.APPLICATION_JSON)
	public Jedis getJedis(String name) throws RedisKVCacheException;
	
	@GET
	@Path("/returnjedis")
	@Produces(MediaType.APPLICATION_JSON)
	public void returnJedis(Jedis jedis) throws RedisKVCacheException;
	
	@GET
	@Path("/returnjedis/name")
	@Produces(MediaType.APPLICATION_JSON)
	public void returnJedis(String name,Jedis jedis) throws RedisKVCacheException;
}
