/**
 * 通知
 *
 * @author 王少刚
 * @create 2018-11-16 14:26
 */
package com.wangshaogang.c_proxy_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAdvice")
// 声明是通知类
@Aspect
public class MyAdvice {
	@Pointcut("execution(* com.wangshaogang.c_proxy_annotation.*ServiceImpl.*(..))")
	public void pc() { }

	// 通知有五种，使用方法来定义

	// 声明是前置通知
	@Before("MyAdvice.pc()")
	public void before() {
		System.out.println("这是前置通知");
	}

	// 声明是后置通知（无异常）
	@AfterReturning("MyAdvice.pc()")
	public void afterReturning() {
		System.out.println("这是后置通知（出现异常不调用）");
	}

	// 声明是环绕通知
	@Around("MyAdvice.pc()")
// 比较特殊，要接收参数
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("这是环绕通知（前）");
		// 要手动调用目标方法，死记硬背即可
		Object proceed = pjp.proceed();
		System.out.println("这是环绕通知（后）");
		return proceed;
	}

	// 声明是后置通知（异常）
	@AfterThrowing("MyAdvice.pc()")
	public void afterException() {
		System.out.println("这是后置通知（出现异常才调用）");
	}

	// 声明是后置通知
	@After("MyAdvice.pc()")
	public void after() {
		System.out.println("这是后置通知（无论是否出现异常都调用）");
	}


}
