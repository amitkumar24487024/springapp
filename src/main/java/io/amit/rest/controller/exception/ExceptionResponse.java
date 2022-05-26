package io.amit.rest.controller.exception;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timestamp;
	private Object message;
	private String details;
	public ExceptionResponse(Date timestamp, Object object, String details) {
		super();
		this.timestamp = timestamp;
		this.message = object;
		this.details = details;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public Object getMessage() {
		return message;
	}
	public void setMessage(Object message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ExceptionResponse [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
	}
	
	

}
