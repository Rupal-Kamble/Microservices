package com.rupal.hotel.service.exceptions;

public class ResorceNotFoundException extends RuntimeException {
	
	public ResorceNotFoundException(){
		System.out.println("Resource Not Found");
	}

	
	public ResorceNotFoundException(Exception ex){
		System.out.println("Resource Not Found   "+ex.getMessage());
	}
	
	public ResorceNotFoundException(String ex){
		System.out.println("Resource Not Found   "+ ex);
	}
}
