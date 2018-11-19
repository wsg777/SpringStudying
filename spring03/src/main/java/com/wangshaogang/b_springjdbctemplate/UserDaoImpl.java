/**
 * DaoImpl
 *
 * @author 王少刚
 * @create 2018-11-17 13:30
 */
package com.wangshaogang.b_springjdbctemplate;

import lombok.Setter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Setter
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

	public void save(User user) {
		String sql = "insert into t_user values (null, ?)";
		super.getJdbcTemplate().update(sql, user.getName());
	}

	public void delete(Integer id) {
		String sql = "delete from t_user where id = ?";
		super.getJdbcTemplate().update(sql, id);
	}

	public void update(User user) {
		String sql = "update t_user set name = ? where id = ?";
		super.getJdbcTemplate().update(sql, user.getName(), user.getId());
	}

	public User getById(Integer id) {
		String sql = "select * from t_user where id = ?";
		User user = super.getJdbcTemplate().queryForObject(sql,
				new RowMapper<User>() {
					public User mapRow(ResultSet resultSet, int i) throws SQLException {
						User user = new User();
						user.setId(resultSet.getInt("id"));
						user.setName(resultSet.getString("name"));
						return user;
					}
				},
				id);
		return user;
	}

	public Integer getCount() {
		String sql = "select count(*) from t_user";
		Integer total = super.getJdbcTemplate().queryForObject(sql, Integer.class);
		return total;
	}

	public List<User> getAll() {
		String sql = "select * from t_user";
		List<User> users = super.getJdbcTemplate().query(sql, new RowMapper<User>() {
			public User mapRow(ResultSet resultSet, int i) throws SQLException {
				User u = new User();
				u.setId(resultSet.getInt("id"));
				u.setName(resultSet.getString("name"));
				return u;
			}
		});
		return users;
	}
}
