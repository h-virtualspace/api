package com.virtualspace.redis.service;

import com.here.framework.service.ServiceException;

public class KVCacheException extends ServiceException
{
	private static final long serialVersionUID = 1L;

	public KVCacheException(String message) {
		super(message);
	}

	public KVCacheException(Throwable cause) {
		super(cause);
	}

	public KVCacheException(String message, Throwable cause) 
	{
		super(message, cause);
	}
}
