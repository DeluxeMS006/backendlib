package com.neusoft.oa.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.oa.hr.model.DepartmentModel;

//Mapper Port Department 
@Mapper
public interface IDepartmentMapper {
	
	public void insert(DepartmentModel dm) throws Exception;
	public void update(DepartmentModel dm) throws Exception;
	public void delete(DepartmentModel dm) throws Exception;
	
	//Recuperation de toutes les listes Department
	public List<DepartmentModel> selectByAll() throws Exception;
	public List<DepartmentModel> selectByAllWithPage(@Param("start") int start,@Param("rows") int rows) throws Exception;
	
	public DepartmentModel selectByNo(int no) throws Exception;
	public int selectCountByAll();
	public DepartmentModel selectByNoWithEmployees(int no) throws Exception;

}
