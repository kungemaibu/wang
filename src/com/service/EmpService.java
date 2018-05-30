package com.service;

import com.entity.Emp;
import com.util.Pager;

public interface EmpService {
	
	public Pager findByPages(int curPage,int pageSize);//查询数据
	   public void save(Emp e);//添加数据
	   public void update(Emp e);//修改数据
	   public void delete(Emp e);//删除数据
	   public Emp get(Integer id);//根据ID查询
}
