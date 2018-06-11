package com.mavis.beans.factory.config;

import com.mavis.beans.PropertyValues;

/**
 * 简化BeanDefinition相关处理，从接口退化为类，并且直接将最终的目标bean保存在内部(缺陷：无法应用bean缓存)
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("rawtypes")
public class BeanDefinition {

	private Object bean;

	private Class BeanClass;

	private String beanClassName;

	private PropertyValues propertyValues = new PropertyValues();

	public BeanDefinition() {
		super();
	}

	public Object getBean() {
		return bean;
	}

	public void setBean(Object bean) {
		this.bean = bean;
	}

	public Class getBeanClass() {
		return BeanClass;
	}

	public void setBeanClass(Class beanClass) {
		BeanClass = beanClass;
	}

	public String getBeanClassName() {
		return beanClassName;
	}

	public void setBeanClassName(String beanClassName) {
		this.beanClassName = beanClassName;
	}

	public PropertyValues getPropertyValues() {
		return propertyValues;
	}

	public void setPropertyValues(PropertyValues propertyValues) {
		this.propertyValues = propertyValues;
	}
}
