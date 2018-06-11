package com.mavis.beans.factory.config;

import com.mavis.beans.BeansException;

public interface AutowireCapableBeanFactory {

	<T> T createBean(Class<T> beanClass) throws BeansException;

	void applyBeanPropertyValues(Object existingBean, String beanName) throws BeansException;

	Object initializeBean(Object existingBean, String beanName) throws BeansException;

	Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

	Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}
