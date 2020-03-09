package com.cwl.crud.test;

import java.util.Random;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cwl.crud.bean.Department;
import com.cwl.crud.bean.Employee;
import com.cwl.crud.dao.DepartmentMapper;
import com.cwl.crud.dao.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:Spring.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	@Test
	public void testCRUD() {
		/*
		  ApplicationContext ioc = new ClassPathXmlApplicationContext("Spring.xml");
		  DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);
		 */
		//System.out.println(departmentMapper);
		
		
//		departmentMapper.insertSelective(new Department(null,"开发部"));
//		departmentMapper.insertSelective(new Department(null,"测试部"));
		
		//employeeMapper.insertSelective(new Employee(null,"英雄","M","yx@cwl.com",2));
		
		EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//		mapper.insert(new Employee(null,"test","M","@cwl.com",2));
		for(int i=0; i<1000;i++) {
			String uid = UUID.randomUUID().toString().substring(0, 5)+i;
			mapper.insertSelective(new Employee(null,uid,"M","@cwl.com",new Random().nextInt(2)+1));
//			)
		}
//		System.out.println("批量完成");
//		for(int i=3007;i<=5014;i++) {
//			mapper.deleteByPrimaryKey(i)
//		}
	}

}
