package com.action.controller;

import com.util.Pager;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.entity.Dept;
import com.entity.Emp;
import com.entity.Position;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.EmpService;

@Controller
public class EmpAction extends ActionSupport{
	
	  private Emp e;
	  private  Dept d;
	  private Position p;
	  private int curPage;
	  private int pageSize=4;
	  private Pager pager;
	  @Autowired
	  private EmpService empService;
	  Integer id;
	  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Emp getE() {
		return e;
	}
	public void setE(Emp e) {
		this.e = e;
	}
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	public Position getP() {
		return p;
	}
	public void setP(Position p) {
		this.p = p;
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
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	public EmpService getEmpService() {
		return empService;
	}
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}
	 //分页查询 
	 public String findByPages(){
	       	Pager p=empService.findByPages(curPage, pageSize);
	      	Map request=(Map) ActionContext.getContext().get("request");
	  	    request.put("p", p);
		   return "findByPages";
		
	}  
	 //添加信息
	 public String save(){
		   empService.save(e);
		   
		   return "save";
	   }
	  
	//修改信息 
	  public String update(){
			empService.update(e);
			
			return SUCCESS;
		
		}
	 
	//删除信息
	    public String delete(){
			 
			 empService.delete(e);
			 
			return SUCCESS;
		
		}
	  //根据ID查询信息
	    public String get(){
			Emp  emp=empService.get(id);
		
			Map request=(Map) ActionContext.getContext().get("request");
			request.put("emp", emp);
			return SUCCESS;
		
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
