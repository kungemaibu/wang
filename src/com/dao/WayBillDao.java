package com.dao;

import java.util.List;

import com.entity.Pagerr;
import com.entity.Waybill;

public interface WayBillDao {
 //��ҳ��ѯ�˵�
	public Pagerr findWayBill(int curPage,int pageSize);
	//����˵�
	public void saveWayBill(Waybill b);
	//����
	public Waybill findwayBill(int id);
	public void updateWayBill(Waybill b);
	//ɾ��
	public void deleteWayBill(Waybill b);
}
