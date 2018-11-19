/**
 * 通知
 *
 * @author 王少刚
 * @create 2018-11-16 14:26
 */
package com.wangshaogang.b_proxy;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	// 通知有五种，使用方法来定义

	// 前置通知
	public void before() {
		System.out.println("这是前置通知");
	}

	// 后置通知（无异常）
	public void afterReturning() {
		System.out.println("这是后置通知（出现异常不调用）");
	}

	// 环绕通知
	// 比较特殊，要接收参数
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("这是环绕通知（前）");
		// 要手动调用目标方法，死记硬背即可
		Object proceed = pjp.proceed();
		System.out.println("这是环绕通知（后）");
		return proceed;
	}

	// 后置通知（异常）
	public void afterException() {
		System.out.println("这是后置通知（出现异常才调用）");
	}

	// 后置通知
	public void after() {
		System.out.println("这是后置通知（无论是否出现异常都调用）");
	}


}
