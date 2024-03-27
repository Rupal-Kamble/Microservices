package com.rupal.hotel.service.exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler  {
	
	@Autowired
	private ApiResponse response;
	
	 @ExceptionHandler(ResorceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResorceNotFoundException ex) {
        String message = ex.getMessage();
        response.setMessage(message);
        response.setSuccess(true);
        response.setStatus(HttpStatus.NOT_FOUND);
        return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);

    }

}
