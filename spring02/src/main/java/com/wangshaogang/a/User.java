/**
 * 用于测试对象创建方式
 *
 * @author 王少刚
 * @create 2018-11-14 20:49
 */
package com.wangshaogang.a;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

// @Setter
// @Getter
@ToString
@Component("user")
// 相当于<bean name="user" class="com.wangshaogang.a.User" />
// @Service("user")
// @Controller("user")
// @Repository("user")
// 指定作用域
@Scope(scopeName = "prototype")
public class User {
	@Value("Tom")
	// 相当于<property name="name" value="Tom" />
	private String name;
	@Value("18")
	private Integer age;
//	@Autowired
//	@Qualifier("car2")
	@Resource(name = "car2")
	// 这一个注解可以代替上面两个注解
	private Car car;

	// 对象创建后调用
	@PostConstruct
	void init() {
		System.out.println("init()");
	}
	// 对象销毁前调用
	@PreDestroy
	void destroy() {
		System.out.println("destroy()");
	}
}

