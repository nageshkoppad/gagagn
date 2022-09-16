package com.net.travel.exception;

public class InvalidPlaceException extends Exception{
	public InvalidPlaceException(String msg) {
		super(msg);
		System.out.println("default consr of InvalidPlaceExcetion");
	}

}
