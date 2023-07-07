package com.webosmotic.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.webosmotic.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResoucrNotFoundException(ResourceNotFoundException ex) {

		String message = ex.getMessage();
		 ApiResponse.builder().message(message).success(true);

		return new ResponseEntity<ApiResponse>(HttpStatus.NOT_FOUND);

	}

}
