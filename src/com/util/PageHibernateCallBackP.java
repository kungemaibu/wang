package com.util;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

public class PageHibernateCallBackP<T> implements HibernateCallback<List<T>> {
	private String hql;
	private Object[] params;//参数集合
	private int pageSize;//每页条数
	private int curPage;
	
	

	public PageHibernateCallBackP(String hql, Object[] params, int pageSize,int curPage) {
		super();
		this.hql = hql;
		this.params = params;
		this.pageSize = pageSize;
		this.curPage=curPage;
	}



	


	@Override
	public List<T> doInHibernate(Session session) throws HibernateException, SQLException {
		Query query=session.createQuery(hql);
		if(params!=null){
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
		query.setFirstResult((curPage-1)*pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}
}
