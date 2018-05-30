package com.serviceimpl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderDao;
import com.entity.Order;
import com.entity.Pagerr;
import com.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
  private OrderDao dao;
	public OrderDao getDao() {
	return dao;
}
public void setDao(OrderDao dao) {
	this.dao = dao;
}
//多表联合查询
	@Override
	public Pagerr findOrder(int curPage, int pageSize) {
		// TODO Auto-generated method stub
		return dao.findOrder(curPage, pageSize);
	}
	@Override
	 //多表联合查询添加
	public void saveOrder(Order o) {
		// TODO Auto-generated method stub
		dao.saveOrder(o);
	}
	@Override
	  //多表联合查询更新
	public Order findorder(int id) {
		// TODO Auto-generated method stub
		return dao.findorder(id);
	}
	@Override
	  //多表联合查询更新
	public void updateOrder(Order o) {
		// TODO Auto-generated method stub
		dao.updateOrder(o);
	}
	@Override
	  //多表联合查询删除
	public void deleteOrder(Order o) {
		// TODO Auto-generated method stub
		dao.deleteOrder(o);
	}
	

}
