package com.mavis.core;

public abstract class NestedRuntimeException extends RuntimeException {
	private static final long serialVersionUID = -4016175087420251813L;

	public NestedRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public NestedRuntimeException(String message) {
		super(message);
	}

	/**
	 * 构建自定义样式的异常信息
	 */
	@Override
	public String getMessage() {
		return NestedExceptionUtils.buildMessage(super.getMessage(), getCause());
	}

	/**
	 * 获得最根源的异常(异常的起源)
	 * @return
	 */
	public Throwable getRootCause() {
		Throwable rootCause = null;
		Throwable cause = getCause();
		while (cause != null && cause != rootCause) {
			rootCause = cause;
			cause = cause.getCause();
		}
		return rootCause;
	}
	/**
	 * 获得最详尽的异常
	 * @return
	 */
	public Throwable getMostSpecificCause() {
		Throwable rootCause = getRootCause();
		return (rootCause != null ? rootCause : this);
	}
	
	/**
	 * 判断是否包含给定的异常类型
	 * @param exType
	 * @return
	 */
	public boolean contains(Class<?> exType) {
		if (exType == null) {
			return false;
		}
		if (exType.isInstance(this)) {
			return true;
		}
		Throwable cause = getCause();
		if (cause == this) {
			return false;
		}
		if (cause instanceof NestedRuntimeException) {
			return ((NestedRuntimeException) cause).contains(exType);
		}
		else {
			while (cause != null) {
				if (exType.isInstance(cause)) {
					return true;
				}
				if (cause.getCause() == cause) {
					break;
				}
				cause = cause.getCause();
			}
			return false;
		}
	}
	
}
