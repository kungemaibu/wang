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
	//��ӳ���
	public void saveCar(Vehicle v);
	//��ѯ����
    public Pagekun findCar(int pageSize,int nowPage);
	//���ĳ�����Ϣ
    public Vehicle findcar(int id);
	public void updateCar(Vehicle v);
    //ɾ������
	public void deleteCar(Vehicle v);
/**************************************˾������**********************************************/
	//˾����ѯ
	public Pagekun findDriving(int pageSize,int nowPage);
	//˾������
	public Driving finddriving(int id);
	public void updateDriving(Driving d);
	//˾��ɾ��
	public void deleteDriving(Driving d);
	//˾�����
	public void saveDriving(Driving d);
	/**************************************��·����**********************************************/
	//�����·
	public void saveCircuit(Circuit c);
	//ɾ����·
	public void deleteCircuit(Circuit c);
	//�޸���·
	public Circuit findcircuit(Circuit c);
	public void updateCircuit(Circuit c);
	//��ѯ��·
	public Pagekun findCircuit(int pageSize, int nowPage);
	/***************************************************************************************/
	public List<Payment> findPay();//��ѯ֧����ʽ
	public List<Circuit> findCircuit();//��ѯ��·
	public List<Branch> findBranch();//��ѯ����
	/*************************************��������*************************************************/
	//�������
	public void saveCarstwoage(Carstowage[] cars);
	
}
