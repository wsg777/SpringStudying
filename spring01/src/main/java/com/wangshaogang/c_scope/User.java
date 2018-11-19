/**
 * 用于测试对象创建方式
 *
 * @author 王少刚
 * @create 2018-11-14 20:49
 */
package com.wangshaogang.c_scope;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
	User() {
		System.out.println("使用了空参构造方法");
	}
	static User createUser2() {
		System.out.println("使用静态工厂");
		return null;
	}
	private String name;
	private String age;
}

class UserFactory {
	User createUser3() {
		System.out.println("使用实例工厂");
		return null;
	}
}
