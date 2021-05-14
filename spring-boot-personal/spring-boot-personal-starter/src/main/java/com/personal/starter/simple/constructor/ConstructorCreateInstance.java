package com.personal.starter.simple.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorCreateInstance {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {

		Class[] types = new Class[]{Integer.class};
		Constructor<?> constructor = getPersonConstructor(types);
		Object[] objects = new Object[]{Integer.valueOf(1)};
		Person o = (Person) constructor.newInstance(objects);
		System.out.println(o.toString());

		types = new Class[]{String.class};
		constructor = getPersonConstructor(types);
		objects = new Object[]{"fengxin"};
		o = (Person) constructor.newInstance(objects);
		System.out.println(o.toString());

		types = new Class[]{String.class, Integer.class};
		constructor = getPersonConstructor(types);
		objects = new Object[]{"fengxin", Integer.valueOf(1)};
		o = (Person) constructor.newInstance(objects);
		System.out.println(o.toString());
	}

	public static Constructor getPersonConstructor(Class[] types){
		try {
			Class<?> aClass = Class.forName("com.personal.starter.simple.constructor.Person");
			return aClass.getConstructor(types);
		} catch (ClassNotFoundException | NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
}
