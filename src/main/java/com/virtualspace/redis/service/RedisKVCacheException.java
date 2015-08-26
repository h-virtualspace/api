package com.virtualspace.redis.service;

public class RedisKVCacheException extends KVCacheException
{
	private static final long serialVersionUID = 1L;

	public RedisKVCacheException(String message) {
		super(message);
	}

	public RedisKVCacheException(Throwable cause) {
		super(cause);
	}

	public RedisKVCacheException(String message, Throwable cause) 
	{
		super(message, cause);
	}

}
