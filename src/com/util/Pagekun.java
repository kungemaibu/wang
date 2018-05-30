package com.util;

import java.util.List;

public class Pagekun {
	private int nowPage;//当前页
    private int firstPage;//首页
    private int prevPage;//上一页
    private int naxtPage;//下一页
    private int lastPage;//最后一页/总页数 
    private int pageSize;//每页条数
    private int count;//总条数
    
    public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private List list;   //查询结果 
	public int getNowPage() {
		return nowPage<=1?1:nowPage;
	}
	public void setNowPage(int nowPage) {
		if(nowPage<=1){
			this.nowPage = 1;
		}else{
		this.nowPage = nowPage;
		}
	}
	public int getFirstPage() {
		return 1;
	} 
	public int getPrevPage() {
		return getNowPage()<=1?1:getNowPage()-1;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public int getNaxtPage() {
		return getNowPage()>=getLastPage()?getLastPage():getNowPage()+1;
	}
	public void setNaxtPage(int naxtPage) {
		this.naxtPage = naxtPage;
	}
	public int getLastPage() {
		return getCount()%getPageSize()==0?getCount()/getPageSize():getCount()/getPageSize()+1;
	}
	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Pagekun(int nowPage, int pageSize, List list) {
		super();
		this.nowPage = nowPage;
		this.pageSize = pageSize;
		this.list = list;
	}
	public Pagekun() {
		super();
		// TODO Auto-generated constructor stub
	}
    
} 
