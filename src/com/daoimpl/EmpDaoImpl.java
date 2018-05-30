package com.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.util.PageHibernateCallBack;
import com.dao.EmpDao;
import com.entity.Emp;
import com.util.Pager;
@Repository
public class EmpDaoImpl implements EmpDao {
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	
	public Pager findByPages(int curPage, int pageSize) {
		
		Pager p=new Pager(curPage, pageSize);
		String hql="from Emp";
		//数据集合
		List list= this.getHibernateTemplate().executeFind(new PageHibernateCallBack<List<Emp>>(hql, null, (curPage-1)*pageSize, pageSize));
		//总条数
		List<Long> list2= this.getHibernateTemplate().find("select count(*) from Emp");
		p.setList(list);//绑定数据
		p.setTotalRecords(Integer.valueOf(list2.get(0).toString()));//总条数
		
		return p;
		
	}

	
	public void save(Emp e) {
		
		this.hibernateTemplate.save(e);
		
	}

	
	public void update(Emp e) {
		this.hibernateTemplate.update(e);
		
	}

	
	public void delete(Emp e) {
		
		this.hibernateTemplate.delete(e);
		
	}

	
	public Emp get(Integer id) {
		
		return this.hibernateTemplate.get(Emp.class, id);
	}

}
