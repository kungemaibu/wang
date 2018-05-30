package com.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dao.OrderDao;
import com.entity.Order;
import com.entity.Pagerr;

import com.util.PageHibernateCallBackP;
@Repository
public class OrderDaoImpl implements OrderDao{
	//注入HibernateTemplate
@Autowired
  private HibernateTemplate ht;
	public HibernateTemplate getHt() {
	return ht;
}
public void setHt(HibernateTemplate ht) {
	this.ht = ht;
}
	@Override
	//多表联合查询
	public Pagerr findOrder(int curPage, int pageSize) {
		// TODO Auto-generated method stub
		String hql="from Order";//hql语句
		List<Order> list=ht.executeFind(new PageHibernateCallBackP<Order>(hql, null,pageSize,curPage));//分页查询
		Pagerr p=new Pagerr(curPage,pageSize);
		p.setList(list);//得到order
		List<Long> list1=this.getHt().find("select count(*) from Order");//总和
		p.setTotalRecords(Integer.valueOf(list1.get(0).toString()));//得到总数
		return p;
	}
	@Override
	//多表联合查询添加
	public void saveOrder(Order o) {
		// TODO Auto-generated method stub
		ht.save(o);
	}
	
	@Override
	//多表联合查询更新
	//查询单个车辆
	public Order findorder(int id) {
		// TODO Auto-generated method stub
		Order o=ht.get(Order.class, id);
		return o;
	}
	
	@Override
	//多表联合查询更新
	public void updateOrder(Order o) {
		// TODO Auto-generated method stub
		ht.update(o);
	}
	@Override
	  //多表联合查询删除
	public void deleteOrder(Order o) {
		// TODO Auto-generated method stub
		Order o1=ht.get(Order.class,o.getOrderId());
		ht.delete(o1);
	}
	

}
