/**
 * @author 王少刚
 * @create 2018-11-18 15:25
 */
package com.wangshaogang.c_tx.test;

import com.wangshaogang.c_tx.service.Service;
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
	@Resource(name = "serviceImpl")
	// 这里一定要使用接口而不是类！
	//! private ServiceImpl service;
	private Service service;

	@Test
	public void test() {
		// 要用接口对象调用方法而不是类的对象！
		service.transfer(1, 2, 10.00);
	}
}
