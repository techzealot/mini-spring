package com.mavis.beans.factory.support;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.mavis.beans.factory.BeanFactory;
import com.mavis.beans.factory.config.BeanDefinition;
import com.mavis.beans.factory.config.BeanPostProcessor;

/**
 * 各种bean相关缓存所在的类体系
 * 
 * @author Administrator
 *
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory{
	private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

	private final List<String> beanDefinitionNames = new ArrayList<>();

	private List<BeanPostProcessor> beanPostProcessors = new ArrayList<>();
	
	
}
