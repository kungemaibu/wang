package com.dao;

import com.entity.Order;
import com.entity.Pagerr;

public interface OrderDao {
   //������ϲ�ѯ
	public Pagerr findOrder(int curPage,int pageSize);
   //������ϲ�ѯ���
	public void saveOrder(Order o);
  //������ϲ�ѯ����
	public Order findorder(int id);
	public void updateOrder(Order o);
  //������ϲ�ѯɾ��
	public void deleteOrder(Order o);
	
}
