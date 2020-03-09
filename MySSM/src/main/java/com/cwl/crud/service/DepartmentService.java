package com.cwl.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cwl.crud.bean.Department;
import com.cwl.crud.bean.Msg;
import com.cwl.crud.dao.DepartmentMapper;
@Service
public class DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;
	
	public List<Department> getDepts() {
		// TODO Auto-generated method stub
		List<Department> list = departmentMapper.selectByExample(null);
		return list;
	}

}
