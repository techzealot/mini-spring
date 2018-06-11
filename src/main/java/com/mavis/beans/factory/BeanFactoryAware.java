package com.mavis.beans.factory;

import com.mavis.beans.BeansException;

public interface BeanFactoryAware extends Aware {
	void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
