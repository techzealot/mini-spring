package com.mavis.beans.factory.support;

import javax.annotation.Resource;

import com.mavis.beans.BeansException;
import com.mavis.core.io.ResourceLoader;

public interface BeanDefinitionReader {
	BeanDefinitionRegistry getRegistry();
	ResourceLoader getResourceLoader();
	BeanNameGenerator getBeanNameGenerator();
	int loadBeanDefinitions(Resource resource) throws BeansException;
	int loadBeanDefinitions(Resource... resources) throws BeansException;
	int loadBeanDefinitions(String location) throws BeansException;
	int loadBeanDefinitions(String... locations) throws BeansException;
}
