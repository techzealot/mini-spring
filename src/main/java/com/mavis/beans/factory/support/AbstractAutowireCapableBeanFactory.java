package com.mavis.beans.factory.support;

import com.mavis.beans.BeansException;
import com.mavis.beans.factory.config.AutowireCapableBeanFactory;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory implements AutowireCapableBeanFactory{

	@Override
	public <T> T createBean(Class<T> beanClass) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void applyBeanPropertyValues(Object existingBean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object initializeBean(Object existingBean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

}
