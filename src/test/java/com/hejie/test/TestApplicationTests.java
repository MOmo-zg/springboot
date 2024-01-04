package com.hejie.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.hejie.test.dao.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

@SpringBootTest
class TestApplicationTests {
	
	@Qualifier("dataSource")
	@Autowired
	DataSource dataSource;
	@Autowired
	UserDao userDao;


	// 测试是否能连接
	@Test
	void contextLoads() throws SQLException {
		Connection connection = dataSource.getConnection();
		System.err.println(connection);
	}
	@Test
	void show(){
		userDao.showUser();
	}

}
