package com.yunpan.exception;

/**
 * 
 * @author JarCode
 * @function 自定义数据库操作异常
 *
 */
public class DBException extends RuntimeException {
	private static final long serialVersionUID = 9021919521644805731L;

	public DBException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DBException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DBException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
