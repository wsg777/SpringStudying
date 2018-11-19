/**
 * 测试
 *
 * @author 王少刚
 * @create 2018-11-17 13:53
 */
package com.wangshaogang.b_springjdbctemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

// 用于创建容器
@RunWith(SpringJUnit4ClassRunner.class)
// 指定创建容器时使用的配置
@ContextConfiguration("classpath:applicationContext1.xml")
public class Demo {

	@Resource(name = "userDaoImpl")
	private UserDaoImpl userDao;

	@Test
	public void test() {

		User user = new User();
		user.setName("wsg");
		userDao.save(user);
		System.out.println("---------------------------------");

		userDao.delete(28);
		System.out.println("---------------------------------");

		User user2 = new User();
		user2.setId(29);
		user2.setName("aaaa");
		userDao.update(user2);
		System.out.println("---------------------------------");

		User user3 = userDao.getById(29);
		System.out.println(user3);
		System.out.println("---------------------------------");

		Integer count = userDao.getCount();
		System.out.println(count);
		System.out.println("---------------------------------");

		List<User> allUsers = userDao.getAll();
		System.out.println(allUsers);
		System.out.println("---------------------------------");
	}
}