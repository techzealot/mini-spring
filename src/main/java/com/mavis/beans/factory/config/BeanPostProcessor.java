package com.mavis.beans.factory.config;

import com.mavis.beans.BeansException;

public interface BeanPostProcessor {
	Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;
	Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
