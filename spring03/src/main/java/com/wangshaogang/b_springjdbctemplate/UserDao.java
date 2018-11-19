/**
 * dao
 *
 * @author 王少刚
 * @create 2018-11-17 13:27
 */
package com.wangshaogang.b_springjdbctemplate;

import java.util.List;

interface UserDao {
	void save(User user);
	void delete(Integer id);
	void update(User user);
	User getById(Integer id);
	Integer getCount();
	List<User> getAll();
}
