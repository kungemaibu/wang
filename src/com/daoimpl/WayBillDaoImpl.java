package com.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dao.WayBillDao;
import com.entity.Pagerr;
import com.entity.Waybill;
import com.util.PageHibernateCallBackP;
@Repository
public class WayBillDaoImpl implements WayBillDao{
@Autowired
	private HibernateTemplate hibernatetemplate;
        public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}
	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
       //��ҳ��ѯ
	@Override
	public Pagerr findWayBill(int curPage, int pageSize) {
		// TODO Auto-generated method stub
		Pagerr p=new Pagerr(curPage,pageSize);
		String hql="from Waybill";
		List list=this.getHibernatetemplate().executeFind(new PageHibernateCallBackP(hql, null,pageSize,curPage));
		List<Long> list1=this.getHibernatetemplate().find("select count(*) from Waybill");
		p.setList(list);
		p.setTotalRecords(Integer.valueOf(list1.get(0).toString()));
		return p;
	}
	//���
	@Override
	public void saveWayBill(Waybill b) {
		// TODO Auto-generated method stub
		hibernatetemplate.save(b);
	}
	//����
	//��ѯ����
	@Override
	public Waybill findwayBill(int id) {
		// TODO Auto-generated method stub
		Waybill b=hibernatetemplate.get(Waybill.class, id);
		return b;
	}
	//����
	@Override
	public void updateWayBill(Waybill b) {
		// TODO Auto-generated method stub
		hibernatetemplate.update(b);
	}
	//ɾ��
	@Override
	public void deleteWayBill(Waybill b) {
		// TODO Auto-generated method stub
		Waybill b1=hibernatetemplate.get(Waybill.class,b.getId());
		hibernatetemplate.delete(b1);
				
				
				
				
	}

}
