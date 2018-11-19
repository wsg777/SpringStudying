/**
 * @author 王少刚
 * @create 2018-11-16 14:51
 */
package com.wangshaogang.b_proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

// 用于创建容器
@RunWith(SpringJUnit4ClassRunner.class)
// 指定创建容器时使用的配置
@ContextConfiguration("classpath:applicationContext2.xml")
public class Demo {
	@Resource(name = "userService")
	// 将userService对象注入变量us中
	private UserService us;

	@Test
	public void test() {
		us.save();
	}
}
