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
	//��ҳ��ѯ
	public Pagerr findWayBill(int curPage, int pageSize) {
		// TODO Auto-generated method stub
		return dao.findWayBill(curPage, pageSize);
	}
	@Override
	//���
	public void saveWayBill(Waybill b) {
		// TODO Auto-generated method stub
		dao.saveWayBill(b);
	}
	@Override
	//����
	//��ѯ����
	public Waybill findwayBill(int id) {
		// TODO Auto-generated method stub
		return dao.findwayBill(id);
	}
	@Override
	//����
	public void updateWayBill(Waybill b) {
		// TODO Auto-generated method stub
		dao.updateWayBill(b);
	}
	@Override
	//ɾ��
	public void deleteWayBill(Waybill b) {
		// TODO Auto-generated method stub
		dao.deleteWayBill(b);
	}
	

}
