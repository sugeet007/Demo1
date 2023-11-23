package com.example.demo.exception;

/**
 * Created by Sugeet Patel
 */

public class ResourceNotFoundException extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super("Resource Not Found on server !!");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
