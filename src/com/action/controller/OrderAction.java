package com.action.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.entity.Order;
import com.entity.Pagerr;

import com.service.OrderService;


@Controller
public class OrderAction extends BaseAction{
@Autowired
    private OrderService service;
    private Pagerr p;
    private Order o;
	private int curPage;
    private int pageSize=5;
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public OrderService getService() {
		return service;
	}
	public void setService(OrderService service) {
		this.service = service;
	}
	public Pagerr getP() {
		return p;
	}
	public void setP(Pagerr p) {
		this.p = p;
	}
	public Order getO() {
		return o;
	}
	public void setO(Order o) {
		this.o = o;
	}
	//多表联合查询
	public String findOrder(){
		Pagerr p=service.findOrder(curPage, pageSize);
		getRequest().put("o1",p);
		return "findOrder";
	
	}
  //多表联合添加
	public String saveOrder(){
		
		service.saveOrder(o);
		Pagerr p=service.findOrder(curPage, pageSize);
		System.out.println(p.getList().get(0));
		getRequest().put("o",p);
		return "findOrder";
		
	}
  //多表联合更新
	public String findorder(){
		Order order=service.findorder(o.getOrderId());
		getRequest().put("order", order);
		return "findorder";
	}
	//多表联合更新
	public String updateOrder(){
		System.out.println(o.getOrderId());
		service.updateOrder(o);
		Pagerr p=service.findOrder(curPage, pageSize);
		System.out.println(p.getList().get(0));
		getRequest().put("o",p);
		return "findOrder";
		
	}
	//多表联合查询删除
	public String deleteOrder(){
		service.deleteOrder(o);
		Pagerr p=service.findOrder(curPage, pageSize);
		getRequest().put("o", p);
		return "findOrder";
	}
	
}
