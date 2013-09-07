package com.egor.persistence.exception;

public class DataAccessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7123818376544951375L;

	public DataAccessException() {
		super();
	}

	public DataAccessException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DataAccessException(String arg0) {
		super(arg0);
	}

	public DataAccessException(Throwable arg0) {
		super(arg0);
	}

}
