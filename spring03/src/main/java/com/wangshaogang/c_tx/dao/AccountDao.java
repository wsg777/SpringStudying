/**
 * @author 王少刚
 * @create 2018-11-18 15:15
 */
package com.wangshaogang.c_tx.dao;

public interface AccountDao {
	void increaseMoney(Integer id, Double money);
	void decreaseMoney(Integer id, Double money);
}
