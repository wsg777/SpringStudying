/**
 * 测试
 *
 * @author 王少刚
 * @create 2018-11-14 20:58
 */
package com.wangshaogang.a_hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void fun1() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从容器取对象
		User u = (User) ac.getBean("user");
		// 打印User对象
		System.out.println(u);
	}
}
