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
//������ϲ�ѯ
	@Override
	public Pagerr findOrder(int curPage, int pageSize) {
		// TODO Auto-generated method stub
		return dao.findOrder(curPage, pageSize);
	}
	@Override
	 //������ϲ�ѯ���
	public void saveOrder(Order o) {
		// TODO Auto-generated method stub
		dao.saveOrder(o);
	}
	@Override
	  //������ϲ�ѯ����
	public Order findorder(int id) {
		// TODO Auto-generated method stub
		return dao.findorder(id);
	}
	@Override
	  //������ϲ�ѯ����
	public void updateOrder(Order o) {
		// TODO Auto-generated method stub
		dao.updateOrder(o);
	}
	@Override
	  //������ϲ�ѯɾ��
	public void deleteOrder(Order o) {
		// TODO Auto-generated method stub
		dao.deleteOrder(o);
	}
	

}
