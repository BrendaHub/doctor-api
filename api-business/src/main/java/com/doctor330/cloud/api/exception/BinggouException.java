package com.doctor330.cloud.api.exception;

public class BinggouException{
	
	public static void  accessException(String message)throws BinggouAccessException{
		throw new BinggouAccessException(message);
	}
}
