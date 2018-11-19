/**
 * @author 王少刚
 * @create 2018-11-16 21:21
 */
package com.wangshaogang.a_jdbctemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class Demo {
	@Test
	public void test1() throws PropertyVetoException {
		// 配置连接池
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/spring");
		dataSource.setUser("root");
		dataSource.setPassword("123456");
		// 创建JDBC模板
		JdbcTemplate jt = new JdbcTemplate();
		// 模板对象获取连接池
		jt.setDataSource(dataSource);
		// 执行sql
		String sql = "insert into t_user values(null, 'rose')";
		jt.update(sql);
	}
}
