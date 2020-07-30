package com.neusoft.oa.hr.service;

import java.util.List;

import com.neusoft.oa.hr.model.DepartmentModel;

// Department Business Interface
public interface IDepartmentService {
	

	public int add(DepartmentModel dm) throws Exception;
	public void modify(DepartmentModel dm) throws Exception;
	public void delete(DepartmentModel dm) throws Exception;
	
	
	public List<DepartmentModel> getListByAll() throws Exception;
	
	public DepartmentModel getByNo(int no) throws Exception;
	public List<DepartmentModel> getListByAllWithPage(int rows, int page) throws Exception;
	public int getCountByAll() throws Exception;
	public int getPageCountByAll(int rows) throws Exception;

}
