/**
 * 测试注解
 *
 * @author 王少刚
 * @create 2018-11-15 14:41
 */
package com.wangshaogang.a;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

// 用于创建容器
@RunWith(SpringJUnit4ClassRunner.class)
// 指定创建容器时使用的配置
@ContextConfiguration("classpath:applicationContext1.xml")
public class Demo {
	@Resource(name = "user")
	// 将user对象注入变量u中
	private User u;

	@Test
	public void test() {
		System.out.println(u);
	}
}
