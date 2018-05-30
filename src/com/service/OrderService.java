package com.service;

import com.entity.Order;
import com.entity.Pagerr;

public interface OrderService {
      //多表联合查询
	    public Pagerr findOrder(int curPage,int pageSize);
	  //多表联合查询添加
		public void saveOrder(Order o);
	  //多表联合查询更新
		public Order findorder(int id);
		public void updateOrder(Order o);
	  //多表联合查询删除
		public void deleteOrder(Order o);
		
}
