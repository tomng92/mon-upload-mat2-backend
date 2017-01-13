package com.journaldev.spring.controller.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * From the artcile:
 * 	   But what if a NullPointerException gets thrown from nowhere. To be on the safer side, we must have a generic
 *     exception handler in our application, which handles all other exception types, such as IOException, NullPointerException and so on.
 *      
 *     To do that, Spring introduced @ControllerAdvice in version 3.2, where can create a Controller Advice class
 *     in our application, which would be capable of handling all the global exception scenarios.
 * @author tnguyen
 *
 */
@ControllerAdvice
public class ExceptionControllerAdvice {
 
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setMessage(ex.getMessage());  // "Please contact your administrator");
		
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}
}