/**
 * 用于测试对象创建方式
 *
 * @author 王少刚
 * @create 2018-11-14 20:49
 */
package com.wangshaogang.d_inject;

import lombok.*;

@Setter
@Getter
@ToString
public class User {
	User(){}
	User(String name, Integer age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}
	private String name;
	private Integer age;
	private Car car;
}

