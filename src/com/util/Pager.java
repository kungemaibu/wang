package com.util;

import java.util.List;

public class Pager {
	private List list;//���ݼ���
	private int curPage;//��ǰҳ
	private int pageSize;//ÿҳ����
	private int totalRecords;//�ܼ�¼��
	private int totalPages;//��ҳ��
	private int firstPage;//��һҳ
	private int prevPage;//��ҳ
	private int nextPage;//��ҳ
	private int lastPage;//���ҳ
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		if(curPage<1){
			this.curPage=1;
		}else
		{
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
	public int getPrevPage() {
		return getCurPage()<=1?1:getCurPage()-1;
	}
	public int getNextPage() {
		return getCurPage()>=getTotalPages()?getTotalPages():getCurPage()+1;
	}

	public int getLastPage() {
		return getTotalPages()==0?1:getTotalPages();
	}
	public int getTotalPages() {
		//100 10 =10
		return (getTotalRecords()+getPageSize()-1)/getPageSize();
	}
	public Pager(int curPage, int pageSize) {
		super();
		this.curPage = curPage;
		this.pageSize = pageSize;
	}
	public Pager() {
		super();
	}
	
	

}
