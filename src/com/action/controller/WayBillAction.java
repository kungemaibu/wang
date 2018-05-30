package com.action.controller;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.entity.Pagerr;
import com.entity.Waybill;
import com.service.WayBillService;
@Controller
public class WayBillAction extends BaseAction{
@Autowired	
    private WayBillService service;
    private Pagerr page;
    private Waybill w;
    private int curPage;
    private int pageSize=5;
	public WayBillService getService() {
		return service;
	}
	public void setService(WayBillService service) {
		this.service = service;
	}
	public Pagerr getPage() {
		return page;
	}
	public void setPage(Pagerr page) {
		this.page = page;
	}
	public Waybill getW() {
		return w;
	}
	public void setW(Waybill w) {
		this.w = w;
	}
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
  //查询
	public String findWayBill(){
		Pagerr p=service.findWayBill(curPage, pageSize);
		getRequest().put("w",p);
		return "findWayBill";
	}
	//添加
	public String saveWayBill(){
		service.saveWayBill(w);
		Pagerr p=service.findWayBill(curPage, pageSize);
		System.out.println(p.getList().get(0));
		getRequest().put("w",p);
		return "findWayBill";
		
	}
	//更新
	public String findwayBill(){
		Waybill waybill=service.findwayBill(w.getId());
		getRequest().put("waybill",waybill);
		return "findwayBill";
	}
	public String updateWayBill(){
		System.out.println(w.getId());
		service.updateWayBill(w);
		Pagerr p=service.findWayBill(curPage, pageSize);
		System.out.println(p.getList().get(0));
		getRequest().put("w",p);
		return "findWayBill";
	}
	//删除
	public String deleteWayBill(){
		service.deleteWayBill(w);
		Pagerr p=service.findWayBill(curPage, pageSize);
		getRequest().put("w",p);
		return "findWayBill";
	}
}
