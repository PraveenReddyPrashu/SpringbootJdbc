package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcTest implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public void run(String... args) throws Exception {
		// TOD356+O Auto-generated method stub
		String sql = "INSERT INTO student_data VALUES (?,?,?,?)";
		Object[] objects = {5,"Praveen",5,55};
		int no_rows_inserted = jt.update(sql,objects);
		System.out.println("no of rows inserted = "+no_rows_inserted);
	}
}
