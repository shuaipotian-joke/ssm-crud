package com.cwl.crud.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cwl.crud.bean.Employee;
import com.cwl.crud.dao.DepartmentMapper;
import com.cwl.crud.dao.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:Spring.xml"})
public class IdTest {
	@Autowired
	DepartmentMapper departmentMapper;
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	@Test
	public void test() {
		EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
		Employee employee = mapper.selectByPrimaryKey(3333);
		System.out.println(employee);
	}
}
