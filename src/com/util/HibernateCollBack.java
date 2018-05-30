package com.util;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

public class HibernateCollBack<T> implements HibernateCallback<List<T>> {

	 private String hql;
     private int nowPage;
     private int pageSize;
	@Override
	public List<T> doInHibernate(Session session) throws HibernateException, SQLException {
		// TODO Auto-generated method stub
	    Query query=session.createQuery(hql);
	    query.setFirstResult((nowPage-1)*pageSize);
	    query.setMaxResults(pageSize);
		return query.list();
	}
	
	public String getHql() {
		return hql;
	}

	public void setHql(String hql) {
		this.hql = hql;
	}

	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public HibernateCollBack(String hql, int nowPage, int pageSize) {
		super();
		this.hql = hql;
		this.nowPage = nowPage;
		this.pageSize = pageSize;
	}

}
