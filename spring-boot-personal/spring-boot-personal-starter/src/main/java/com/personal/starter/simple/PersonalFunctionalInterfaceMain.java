package com.personal.starter.simple;

public class PersonalFunctionalInterfaceMain {

	public static void main(String[] args) {
		//函数式接口可以使用Lambda表达式的方式声明一个实现类
		PersonalFunctionalInterface impl1 = message -> {
			return message.concat("fengxin1");
		};
		PersonalFunctionalInterface impl2 = message -> {
			return message.concat("fengxin2");
		};
		String s1 = impl1.getMessage("message");
		String s2 = impl2.getMessage("message");
		System.out.println(s1);
		System.out.println(s2);
	}
}
