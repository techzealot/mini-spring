package com.mavis.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * 直接简化为一个实现类，封装属性集合
 * 
 * @author Administrator
 *
 */
public class PropertyValues {
	private final List<PropertyValue> propertyValueList;

	public PropertyValues() {
		this.propertyValueList = new ArrayList<PropertyValue>(0);
	}

	public PropertyValue[] getPropertyValues() {
		return this.propertyValueList.toArray(new PropertyValue[this.propertyValueList.size()]);
	}

	public PropertyValue getPropertyValue(String propertyName) {
		for (PropertyValue pv : this.propertyValueList) {
			if (pv.getName().equals(propertyName)) {
				return pv;
			}
		}
		return null;
	}

	public PropertyValues addPropertyValue(PropertyValue pv) {
		for (int i = 0; i < this.propertyValueList.size(); i++) {
			PropertyValue currentPv = this.propertyValueList.get(i);
			if (currentPv.getName().equals(pv.getName())) {
				// spring采用value值如果Mergable则合并，此处实现为直接跳过；
				return this;
			}
		}
		this.propertyValueList.add(pv);
		return this;
	}
}
