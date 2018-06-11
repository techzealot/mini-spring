package com.mavis.beans;

public class PropertyValue {

	private final String name;

	private final Object value;

	public PropertyValue(String name, Object value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}
	
}
