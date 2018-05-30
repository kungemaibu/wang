package com.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.dao.CarDao;
import com.entity.Branch;
import com.entity.Carstowage;
import com.entity.Circuit;
import com.entity.Driving;
import com.entity.Payment;
import com.entity.Vehicle;
import com.util.HibernateCollBack;
import com.util.Pagekun;
@Component("dao")
public class CarDaoImpl implements CarDao {
	//注入HibernateTemplate
			@Autowired
			private HibernateTemplate ht;
		    public HibernateTemplate getHt() {
				return ht;
			}
			public void setHt(HibernateTemplate ht) {
				this.ht = ht;
			}
		//添加车辆
			@Override
			public void saveCar(Vehicle v) {
				// TODO Auto-generated method stub
		       ht.save(v);
			}
		//查询车辆
			@Override
			public Pagekun findCar(int pageSize,int nowPage) {
				// TODO Auto-generated method stub
				String hql="from Vehicle";
				List<Vehicle> list=ht.executeFind(new HibernateCollBack<Vehicle>(hql, nowPage, pageSize));
				Pagekun p=new Pagekun(nowPage, pageSize, list);
				//总体数
				p.setCount(Integer.valueOf(ht.find("select count(*) from Vehicle").get(0).toString()));
				return p;
			}
		//更改车辆
			     //查询单个车辆
			public Vehicle  findcar(int id){
				Vehicle v=ht.get(Vehicle.class, id);
				return v;
			}
	            //更改信息
			@Override
			public void updateCar(Vehicle v) {
				// TODO Auto-generated method stub
		       ht.update(v);
			}
		//删除车辆
			@Override
			public void deleteCar(Vehicle v) {
				// TODO Auto-generated method stub
				Vehicle v1=ht.get(Vehicle.class,v.getVehicleId());
		        ht.delete(v1);
			}
	/**************************************司机管理**********************************************/
			//查询司机
			@Override
			public Pagekun findDriving(int pageSize, int nowPage) {
				// TODO Auto-generated method stub
				String hql="from Driving";
				List<Driving> list=ht.executeFind(new HibernateCollBack<Driving>(hql, nowPage, pageSize));
				Pagekun p=new Pagekun(nowPage, pageSize, list);
				//总体数
				p.setCount(Integer.valueOf(ht.find("select count(*) from Driving").get(0).toString()));
				return p;
			}
			//更新司机
			@Override
			public Driving finddriving(int id) {
				// TODO Auto-generated method stub
				Driving  dr=ht.get(Driving.class, id);
				return dr;
			}
			@Override
			public void updateDriving(Driving d) {
				// TODO Auto-generated method stub
				ht.update(d);
			}
			//删除司机
			@Override
			public void deleteDriving(Driving d) {
				// TODO Auto-generated method stub
				ht.delete(d);
			}
			//添加司机
			@Override
			public void saveDriving(Driving d) {
				// TODO Auto-generated method stub
				ht.save(d);
			}
	/**************************************线路管理**********************************************/
			//添加线路
			@Override
			public void saveCircuit(Circuit c) {
				// TODO Auto-generated method stub
				ht.save(c);
			}
			//删除线路
			@Override
			public void deleteCircuit(Circuit c) {
				// TODO Auto-generated method stub
				ht.get(Circuit.class, c.getCircuitId());
				ht.delete(c);
			}
			//更新线路
			@Override
			public Circuit findcircuit(Circuit c) {
				// TODO Auto-generated method stub
				int id=c.getCircuitId();
				return ht.get(Circuit.class,id);
			}
			@Override
			public void updateCircuit(Circuit c) {
				// TODO Auto-generated method stub
				ht.update(c);
			}
			//查询线路
			@Override
			public Pagekun findCircuit(int pageSize, int nowPage) {
				// TODO Auto-generated method stub
				String hql="from Circuit";
				List<Circuit> list=ht.executeFind(new HibernateCollBack<Circuit>(hql, nowPage, pageSize));
				Pagekun p=new Pagekun(nowPage, pageSize, list);
				//总体数
				p.setCount(Integer.valueOf(ht.find("select count(*) from Circuit").get(0).toString()));
				return p;
			}
			/******************************************/
			//查询支付方式
			@Override
			public List<Payment> findPay() {
				// TODO Auto-generated method stub
				String hql="from Payment";
				List<Payment> list= ht.find(hql);
				return list;
			}
			@Override
			public List<Circuit> findCircuit() {//查询线路
				// TODO Auto-generated method stub
				String hql="from Circuit";
				List<Circuit> list=ht.find(hql);
				return list;
			}
			@Override
			public List<Branch> findBranch() {
				// TODO Auto-generated method stub
				List<Branch> list=ht.find("from Branch");
				return list;
			}
		/*************************************车辆配载*************************************************/
			//添加配载
			@Override
			public void saveCarstwoage(Carstowage cars) {
				// TODO Auto-generated method stub
				ht.save(cars);
			}
		
}
