package com.service;

import com.entity.Emp;
import com.util.Pager;

public interface EmpService {
	
	public Pager findByPages(int curPage,int pageSize);//��ѯ����
	   public void save(Emp e);//�������
	   public void update(Emp e);//�޸�����
	   public void delete(Emp e);//ɾ������
	   public Emp get(Integer id);//����ID��ѯ
}
