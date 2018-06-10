package com.mavis.beans.factory;

import com.mavis.beans.BeansException;
/**
 * <p>
 * IOC容器的顶级接口，主要定义了获取bean的方法(只能根据bean name获取bean)，其有3个直接子接口分别如下：
 * </p>
 * <p>
 * 1.{@link org.springframework.beans.factory.HierarchicalBeanFactory}
 * <strong>v1.0中不做实现</strong>
 * 定义了IOC容器可以具备父容器，从而实现了具有层级关系的多级容器体系
 * </p>
 * <p>
 * 2.{@link org.springframework.beans.factory.ListableBeanFactory}
 * <strong>v1.0中不做实现</strong>
 * 定义了可以从容器中根据bean类型等快速获取所有符合条件的bean的方法,扩展了获取bean的方式
 * </p>
 * <p>
 * 3.{@link org.AbstractAutowireCapableBeanFactory.beans.factory.config.AutowireCapableBeanFactory}
 * 定义了IOC容器的自动装配能力，使得容器内部的bean可以相互注入
 * </p>
 * @author mavis
 *
 */
public interface BeanFactory {
	/**
	 * FactoryBean的命名前缀
	 */
	String FACTORY_BEAN_PREFIX = "&";

	Object getBean(String name) throws BeansException;

	<T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
