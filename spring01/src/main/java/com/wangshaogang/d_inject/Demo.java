/**
 * 属性注入
 *
 * @author 王少刚
 * @create 2018-11-15 13:01
 */
package com.wangshaogang.d_inject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void fun1() {
		// 创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext4.xml");
		// 从容器取对象
		CollectionBean cb = (CollectionBean) ac.getBean("cb");
		// 打印User对象
		System.out.println(cb);
	}
}
