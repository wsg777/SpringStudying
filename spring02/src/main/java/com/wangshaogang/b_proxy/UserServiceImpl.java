/**
 * @author 王少刚
 * @create 2018-11-16 14:24
 */
package com.wangshaogang.b_proxy;

public class UserServiceImpl implements UserService {
	@Override
	public void save() {
		System.out.println("保存用户");
	}

	@Override
	public void delete() {
		System.out.println("删除用户");
	}

	@Override
	public void update() {
		System.out.println("更新用户");
	}

	@Override
	public void find() {
		System.out.println("查找用户");
	}
}