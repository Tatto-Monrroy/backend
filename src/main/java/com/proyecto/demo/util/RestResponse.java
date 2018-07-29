package com.proyecto.demo.util;

public class RestResponse {
	
	private Integer responseCode;
	private String message;
	
	
	
	public RestResponse(Integer responseCode) {
		super();
		this.responseCode = responseCode;
	}
	
	
	
	public RestResponse(Integer responseCode, String message) {
		super();
		this.responseCode = responseCode;
		this.message = message;
	}



	/**
	 * @return the responseCode
	 */
	public Integer getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
