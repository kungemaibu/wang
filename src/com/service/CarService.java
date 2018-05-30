package com.service;

import java.util.List;
import java.util.Map;

import com.entity.Branch;
import com.entity.Carstowage;
import com.entity.Circuit;
import com.entity.Driving;
import com.entity.Payment;
import com.entity.Vehicle;
import com.util.Pagekun;

public interface CarService {
	//添加车辆
	public void saveCar(Vehicle v);
	//查询车辆
    public Pagekun findCar(int pageSize,int nowPage);
	//更改车辆信息
    public Vehicle findcar(int id);
	public void updateCar(Vehicle v);
    //删除车辆
	public void deleteCar(Vehicle v);
/**************************************司机管理**********************************************/
	//司机查询
	public Pagekun findDriving(int pageSize,int nowPage);
	//司机更改
	public Driving finddriving(int id);
	public void updateDriving(Driving d);
	//司机删除
	public void deleteDriving(Driving d);
	//司机添加
	public void saveDriving(Driving d);
	/**************************************线路管理**********************************************/
	//添加线路
	public void saveCircuit(Circuit c);
	//删除线路
	public void deleteCircuit(Circuit c);
	//修改线路
	public Circuit findcircuit(Circuit c);
	public void updateCircuit(Circuit c);
	//查询线路
	public Pagekun findCircuit(int pageSize, int nowPage);
	/***************************************************************************************/
	public List<Payment> findPay();//查询支付方式
	public List<Circuit> findCircuit();//查询线路
	public List<Branch> findBranch();//查询网点
	/*************************************车辆配载*************************************************/
	//配载添加
	public void saveCarstwoage(Carstowage[] cars);
	
}
