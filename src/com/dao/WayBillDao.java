package com.dao;

import java.util.List;

import com.entity.Pagerr;
import com.entity.Waybill;

public interface WayBillDao {
 //分页查询运单
	public Pagerr findWayBill(int curPage,int pageSize);
	//添加运单
	public void saveWayBill(Waybill b);
	//更新
	public Waybill findwayBill(int id);
	public void updateWayBill(Waybill b);
	//删除
	public void deleteWayBill(Waybill b);
}
