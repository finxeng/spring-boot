package com.personal.starter.simple;

/**
 * 测试类加载器获取指定类构造器创建对象实例
 */
public class ClassLoaderCreateInstance {

	public ClassLoaderCreateInstance() {
		System.out.println("Call the Constructor");
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//获取当前线程默认类加载器
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		//通过类全路径名称获取类class对象
		Class<?> aClass = contextClassLoader.loadClass("com.personal.starter.simple.ClassLoaderCreateInstance");
		//通过类Class对象创建对象实例，newInstance()调用的是类无参构造器
		ClassLoaderCreateInstance classLoaderCreateInstance = (ClassLoaderCreateInstance) aClass.newInstance();
		System.out.println("Called the Constructor");
	}
}
