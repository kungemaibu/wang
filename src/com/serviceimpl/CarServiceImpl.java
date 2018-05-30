package com.serviceimpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.CarDao;
import com.entity.Branch;
import com.entity.Carstowage;
import com.entity.Circuit;
import com.entity.Driving;
import com.entity.Payment;
import com.entity.Vehicle;
import com.service.CarService;
import com.util.Pagekun;
@Service("service")
public class CarServiceImpl implements CarService {

	@Resource(name="dao")
	private CarDao dao;
//添加车辆
	@Override
	public void saveCar(Vehicle v) {
		// TODO Auto-generated method stub
     dao.saveCar(v);  
	}
//查询车辆
	@Override
	public Pagekun findCar(int pageSize,int nowPage) {
		// TODO Auto-generated method stub
		return dao.findCar(pageSize, nowPage);
	}
//更改车辆信息
	public Vehicle findcar(int id){
		return dao.findcar(id);
	}
	@Override
	public void updateCar(Vehicle v) {
		// TODO Auto-generated method stub
       dao.updateCar(v);
	}
//删除车辆
	@Override
	public void deleteCar(Vehicle v) {
		// TODO Auto-generated method stub
       dao.deleteCar(v);
	}
/**************************************司机管理**********************************************/
	//查询司机
	@Override
	public Pagekun findDriving(int pageSize, int nowPage) {
		// TODO Auto-generated method stub
		return dao.findDriving(pageSize, nowPage);
	}
	//更新司机
	@Override
	public Driving finddriving(int id) {
		// TODO Auto-generated method stub
		return dao.finddriving(id);
	}
	@Override
	public void updateDriving(Driving d) {
		// TODO Auto-generated method stub
		dao.updateDriving(d);
	}
	//删除司机
	@Override
	public void deleteDriving(Driving d) {
		// TODO Auto-generated method stub
		dao.deleteDriving(d);
	}
	//添加司机
	@Override
	public void saveDriving(Driving d) {
		// TODO Auto-generated method stub
		dao.saveDriving(d);
	}
	/**************************************线路管理**********************************************/
	//添加线路
	@Override
	public void saveCircuit(Circuit c) {
		// TODO Auto-generated method stub
		dao.saveCircuit(c);
	}
	//删除线路
	@Override
	public void deleteCircuit(Circuit c) {
		// TODO Auto-generated method stub
		dao.deleteCircuit(c);
	}
	//修改线路
	@Override
	public Circuit findcircuit(Circuit c) {
		// TODO Auto-generated method stub
		return dao.findcircuit(c);
	}
	@Override
	public void updateCircuit(Circuit c) {
		// TODO Auto-generated method stub
		dao.updateCircuit(c);
	}
	//查询线路
	@Override
	public Pagekun findCircuit(int pageSize, int nowPage) {
		// TODO Auto-generated method stub
		return dao.findCircuit(pageSize, nowPage);
	}
	/***************************************************************************************/
	//查询支付方式	
	@Override
	public List<Payment> findPay() {
		// TODO Auto-generated method stub
		return dao.findPay();
	}
	//查询线路
	@Override
	public List<Circuit> findCircuit() {
		// TODO Auto-generated method stub
		return dao.findCircuit();
	}
	@Override
	public List<Branch> findBranch() {
		// TODO Auto-generated method stub
		return dao.findBranch();
	}
	/*************************************车辆配载*************************************************/
	//配载添加
	@Override
	public void saveCarstwoage(Carstowage[] cars) {
		// TODO Auto-generated method stub
		//循环cars数组      添加多条cars数据
		for (int i = 0; i < cars.length; i++) {
			dao.saveCarstwoage(cars[i]);
		}
		
	}
	
}
