package com.personal.starter.simple;

/**
 * 函数式接口默认继承java.lang.Object,如果子类显示的声明的Object的方法，那么被声明的方法不会违背：FunctionalInterface只有一个抽象方法的规则。
 */
@FunctionalInterface
public interface PersonalFunctionalInterface{

	/**
	 * 默认该变量为final and static
	 */
	String message = "this `message` is final and static!!!";

	/**
	 * FunctionalInterface只有此一个抽象方法
	 */
	String getMessage(String message);

	/**
	 * jdk8 接口支持声明静态方法实现
	 */
	static void staticMessage(){
		System.out.println(message);
	}

	/**
	 * jdk8 接口支持默认方法实现
	 */
	default void defaultMessage(){
		System.out.println(message);
	}

	/**
	 * java.lang.Object的方法
	 */
	@Override
	boolean equals(Object var1);
}
