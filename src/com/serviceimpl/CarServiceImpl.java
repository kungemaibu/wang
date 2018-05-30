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
//��ӳ���
	@Override
	public void saveCar(Vehicle v) {
		// TODO Auto-generated method stub
     dao.saveCar(v);  
	}
//��ѯ����
	@Override
	public Pagekun findCar(int pageSize,int nowPage) {
		// TODO Auto-generated method stub
		return dao.findCar(pageSize, nowPage);
	}
//���ĳ�����Ϣ
	public Vehicle findcar(int id){
		return dao.findcar(id);
	}
	@Override
	public void updateCar(Vehicle v) {
		// TODO Auto-generated method stub
       dao.updateCar(v);
	}
//ɾ������
	@Override
	public void deleteCar(Vehicle v) {
		// TODO Auto-generated method stub
       dao.deleteCar(v);
	}
/**************************************˾������**********************************************/
	//��ѯ˾��
	@Override
	public Pagekun findDriving(int pageSize, int nowPage) {
		// TODO Auto-generated method stub
		return dao.findDriving(pageSize, nowPage);
	}
	//����˾��
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
	//ɾ��˾��
	@Override
	public void deleteDriving(Driving d) {
		// TODO Auto-generated method stub
		dao.deleteDriving(d);
	}
	//���˾��
	@Override
	public void saveDriving(Driving d) {
		// TODO Auto-generated method stub
		dao.saveDriving(d);
	}
	/**************************************��·����**********************************************/
	//�����·
	@Override
	public void saveCircuit(Circuit c) {
		// TODO Auto-generated method stub
		dao.saveCircuit(c);
	}
	//ɾ����·
	@Override
	public void deleteCircuit(Circuit c) {
		// TODO Auto-generated method stub
		dao.deleteCircuit(c);
	}
	//�޸���·
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
	//��ѯ��·
	@Override
	public Pagekun findCircuit(int pageSize, int nowPage) {
		// TODO Auto-generated method stub
		return dao.findCircuit(pageSize, nowPage);
	}
	/***************************************************************************************/
	//��ѯ֧����ʽ	
	@Override
	public List<Payment> findPay() {
		// TODO Auto-generated method stub
		return dao.findPay();
	}
	//��ѯ��·
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
	/*************************************��������*************************************************/
	//�������
	@Override
	public void saveCarstwoage(Carstowage[] cars) {
		// TODO Auto-generated method stub
		//ѭ��cars����      ��Ӷ���cars����
		for (int i = 0; i < cars.length; i++) {
			dao.saveCarstwoage(cars[i]);
		}
		
	}
	
}
