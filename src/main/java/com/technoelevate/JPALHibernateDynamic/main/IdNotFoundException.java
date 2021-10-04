package com.technoelevate.JPALHibernateDynamic.main;

public class IdNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String msg;

	public IdNotFoundException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {

		return this.msg;
	}

}
