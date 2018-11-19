/**
 * @author 王少刚
 * @create 2018-11-18 15:15
 */
package com.wangshaogang.c_tx.service;

import com.wangshaogang.c_tx.dao.AccountDaoImpl;
import lombok.Setter;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Setter
public class ServiceImpl implements Service {
	private AccountDaoImpl accountDao;

	@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = false)
	public void transfer(final Integer from, final Integer to, final Double money) {
		accountDao.decreaseMoney(from, money);
//		int i = 1 / 0;
		accountDao.increaseMoney(to, money);
	}

}