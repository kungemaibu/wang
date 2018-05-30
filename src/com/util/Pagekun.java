package com.util;

import java.util.List;

public class Pagekun {
	private int nowPage;//��ǰҳ
    private int firstPage;//��ҳ
    private int prevPage;//��һҳ
    private int naxtPage;//��һҳ
    private int lastPage;//���һҳ/��ҳ�� 
    private int pageSize;//ÿҳ����
    private int count;//������
    
    public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private List list;   //��ѯ��� 
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
