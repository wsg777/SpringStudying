/**
 * @author 王少刚
 * @create 2018-11-18 15:15
 */
package com.wangshaogang.c_tx.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	public void increaseMoney(Integer id, Double money) {
		super.getJdbcTemplate().update("update t_account set money = money + ? where id = ? ;", money, id);
	}

	public void decreaseMoney(Integer id, Double money) {
		super.getJdbcTemplate().update("update t_account set money = money - ? where id = ? ;", money, id);
	}
}
