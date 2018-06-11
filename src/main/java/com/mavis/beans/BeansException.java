package com.mavis.beans;

import com.mavis.core.NestedRuntimeException;
/**
 * spring的异常处理方式:将异常转换为运行时异常
 * @author mavis
 *
 */
@SuppressWarnings("serial")
public class BeansException extends NestedRuntimeException{

	public BeansException(String message) {
		super(message);
	}

	public BeansException(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public int hashCode() {
		return getMessage().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
