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
	//ע��HibernateTemplate
@Autowired
  private HibernateTemplate ht;
	public HibernateTemplate getHt() {
	return ht;
}
public void setHt(HibernateTemplate ht) {
	this.ht = ht;
}
	@Override
	//������ϲ�ѯ
	public Pagerr findOrder(int curPage, int pageSize) {
		// TODO Auto-generated method stub
		String hql="from Order";//hql���
		List<Order> list=ht.executeFind(new PageHibernateCallBackP<Order>(hql, null,pageSize,curPage));//��ҳ��ѯ
		Pagerr p=new Pagerr(curPage,pageSize);
		p.setList(list);//�õ�order
		List<Long> list1=this.getHt().find("select count(*) from Order");//�ܺ�
		p.setTotalRecords(Integer.valueOf(list1.get(0).toString()));//�õ�����
		return p;
	}
	@Override
	//������ϲ�ѯ���
	public void saveOrder(Order o) {
		// TODO Auto-generated method stub
		ht.save(o);
	}
	
	@Override
	//������ϲ�ѯ����
	//��ѯ��������
	public Order findorder(int id) {
		// TODO Auto-generated method stub
		Order o=ht.get(Order.class, id);
		return o;
	}
	
	@Override
	//������ϲ�ѯ����
	public void updateOrder(Order o) {
		// TODO Auto-generated method stub
		ht.update(o);
	}
	@Override
	  //������ϲ�ѯɾ��
	public void deleteOrder(Order o) {
		// TODO Auto-generated method stub
		Order o1=ht.get(Order.class,o.getOrderId());
		ht.delete(o1);
	}
	

}
