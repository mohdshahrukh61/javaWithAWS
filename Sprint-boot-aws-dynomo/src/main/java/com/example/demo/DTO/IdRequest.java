package com.example.demo.DTO;

public class IdRequest {

	private String method;
	private String path;
	private BodyRequest body;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public BodyRequest getBody() {
		return body;
	}

	public void setBody(BodyRequest body) {
		this.body = body;
	}

}
