/**
 * 测试注入对象
 *
 * @author 王少刚
 * @create 2018-11-15 13:08
 */
package com.wangshaogang.a;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Setter
@Component("car")
public class Car {
	@Value("Lamborghini")
	private String name;
	@Value("white")
	private String color;
}
