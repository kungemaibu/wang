package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.WayBillDao;
import com.entity.Pagerr;
import com.entity.Waybill;
import com.service.WayBillService;
@Service
public class WayBillServiceImpl implements WayBillService{
	@Autowired
	private WayBillDao dao;
	
    public WayBillDao getDao() {
		return dao;
	}
	public void setDao(WayBillDao dao) {
		this.dao = dao;
	}
	@Override
	//分页查询
	public Pagerr findWayBill(int curPage, int pageSize) {
		// TODO Auto-generated method stub
		return dao.findWayBill(curPage, pageSize);
	}
	@Override
	//添加
	public void saveWayBill(Waybill b) {
		// TODO Auto-generated method stub
		dao.saveWayBill(b);
	}
	@Override
	//更新
	//查询单个
	public Waybill findwayBill(int id) {
		// TODO Auto-generated method stub
		return dao.findwayBill(id);
	}
	@Override
	//更新
	public void updateWayBill(Waybill b) {
		// TODO Auto-generated method stub
		dao.updateWayBill(b);
	}
	@Override
	//删除
	public void deleteWayBill(Waybill b) {
		// TODO Auto-generated method stub
		dao.deleteWayBill(b);
	}
	

}
