package com.journaldev.spring.controller.error;

//public class FileUploadException {
//
//}
public class FileUploadException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorMessage;
 
	public String getErrorMessage() {
		return errorMessage;
	}
	public FileUploadException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	public FileUploadException() {
		super();
	}
}