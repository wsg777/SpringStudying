/**
 * 用于测试对象创建方式
 *
 * @author 王少刚
 * @create 2018-11-14 21:44
 */
package com.wangshaogang.b_create;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void fun1() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
		// 从容器取对象
		User u = (User) ac.getBean("user3");
//		 打印User对象
//		System.out.println(u);
	}
}
