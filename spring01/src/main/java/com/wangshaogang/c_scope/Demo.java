/**
 * 用于测试对象创建方式
 *
 * @author 王少刚
 * @create 2018-11-14 21:44
 */
package com.wangshaogang.c_scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void fun1() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext3.xml");
//		 从容器取对象
//		User u = (User) ac.getBean("user");
//		User u2 = (User) ac.getBean("user");

		// 打印true说明是单例
//		System.out.println(u == u2);

		User u3 = (User) ac.getBean("user2");
		User u4 = (User) ac.getBean("user2");
		// 打印false说明是多例
		System.out.println(u3 == u4);
	}
}
