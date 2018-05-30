package com.entity;

import java.util.List;

public class Pagerr {
	private List list;//数据集合
	private int curPage;//当前页
	private int pageSize;//每页条数
	private int totalRecords;//总记录数
	private int totalPages;//总记录数
	private int firstPage;//第一页
	private int prevPage;//上页
	private int nextPage;//下页
	private int lastPage;//最后页
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public int getCurPage() {
		return curPage<=1?1:curPage;
	}
	public void setCurPage(int curPage) {
		if(curPage<=1){
			this.curPage=1;
		}else {
			this.curPage = curPage;
		}	
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public int getFirstPage() {
		return 1;
	}
	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}
	public int getPrevPage() {
		return getCurPage()<1?1:getCurPage()-1;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public int getNextPage() {
		return getCurPage()>=getTotalPages()?getTotalPages():getCurPage()+1;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int getLastPage() {
		return getTotalPages()==0?1:getTotalPages();
	}
	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}
	public int getTotalPages() {
		return (getTotalRecords()+getPageSize()-1)/getPageSize();
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public Pagerr(int curPage, int pageSize) {
		super();
		this.curPage = curPage;
		this.pageSize = pageSize;
	}
	public Pagerr() {
		super();
		// TODO Auto-generated constructor stub
	}
}
