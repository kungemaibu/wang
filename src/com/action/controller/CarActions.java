package com.action.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Resource;

import org.springframework.beans.factory.serviceloader.ServiceFactoryBean;
import org.springframework.stereotype.Controller;
import com.entity.Branch;
import com.entity.Carstowage;
import com.entity.Circuit;
import com.entity.Driving;
import com.entity.Payment;
import com.entity.Vehicle;
import com.serviceimpl.CarServiceImpl;
import com.util.Pagekun;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
@Controller
public class CarActions extends BaseAction{
	@Resource(name="service")
    private CarServiceImpl service;	
	Pagekun p=new Pagekun();
	//����ʵ����
	Vehicle v=new Vehicle();
	//˾��ʵ����
	private Driving d=new Driving();
	public Circuit c=new Circuit();//��·
	public Carstowage[] carstwo;
	public Circuit getC() {
		return c;
	}
	public void setC(Circuit c) {
		this.c = c;
	}
	public Driving getD() {
		return d;
	}
	public void setD(Driving d) {
		this.d = d;
	}
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}
	public CarServiceImpl getService() {
		return service;
	}
	public void setService(CarServiceImpl service) {
		this.service = service;
	}
	public Pagekun getP() {
		return p;
	}
	public void setP(Pagekun p) {
		this.p = p;
	}
	//��ѯ���г���                
	public String findCar(){          
		Pagekun car=service.findCar(6,p.getNowPage());
		request().put("car", car);
		return "findCar";
	}
	//��ӳ���
	public void saveCar(){
		service.saveCar(v);
		getPrintWriter().print("��ӳɹ�");
		//return "findCar";
	}
	//���ĳ�����Ϣ
	public String findcar(){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		Vehicle car=service.findcar(v.getVehicleId());
		List<Payment> list=service.findPay();
		List<Circuit> cir=service.findCircuit();//��ѯ��·
		request().put("cir",cir);
		request().put("pay",list);
		request().put("car", car);
		return "findcar";
	}
	public String updateCar(){
		service.updateCar(v); 
		return "findCar";
	}
	//ɾ������
	public void deleteCar(){
		service.deleteCar(v);
		getPrintWriter().print("ɾ���ɹ�");
		}
	/****************************************˾������**************************************************/
	//˾����ѯ
	public String findDriving(){
		Pagekun driver=service.findDriving(5,p.getNowPage());
		request().put("driver",driver);
		return "findDriving";
	}
	//˾������
	public String finddriving(){
		Driving d1=service.finddriving(d.getDriverId());
		
		request().put("dr",d1);
		return "finddriving";
	}
	public String updateDriving(){
		service.updateDriving(d);
		return "findCar";
	}
	//˾�����
	public void saveDriving(){
		service.saveDriving(d);
		getPrintWriter().print("��ӳɹ�");
	}
	//˾��ɾ��
	public void deleteDriving(){
		service.deleteDriving(d);
		getPrintWriter().print("ɾ���ɹ�");
	}
	/**************************************��·����**********************************************/
	//�����·
	public void saveCircuit(){
		service.saveCircuit(c);
		getPrintWriter().print("�����ɹ�");
	}
	//ɾ����·
	public void deleteCircuit(){
		service.deleteCircuit(c);
		getPrintWriter().print("ɾ���ɹ�");
	}
	//�޸���·
	public String findcircuit(){
		Circuit cir=service.findcircuit(c);
		List<Branch> branch=service.findBranch();
		request().put("branch", branch);
		request().put("cir",cir);
		return "findcircuit";
		//System.out.println(map+"hufiurtioueairu");
		//getPrintWriter().print(JSONObject.fromObject(map));
	}
	public String updateCircuit(){
		service.updateCircuit(c);
		return "findCar";
		
	}
	//��ѯ��·
	public String findCircuit(){
		List<Circuit> list=service.findCircuit();
		request().put("cir", list);
		return "findCircuit";
		
	}
	
	
	
	
	//��ѯ����������ӱ�
	public void findcarp(){
		  List<Payment> plist=service.findPay();//��ѯ֧����ʽ
		  List<Circuit> clist=service.findCircuit();//��ѯ��·
		  List<Branch> blist=service.findBranch();//��ѯ����
		  Map map=new HashMap();
		  map.put("blist",blist);
		  map.put("plist", plist);map.put("clist", clist);//�Ѽ��ϴ浽map������  , �˺����ת����json����
		  JsonConfig config=new JsonConfig();//���˵�����ת���ɵ�����
		  config.setExcludes(new String[]{"vehicles","clienteles","waybills",
				  "branch","emp","stitchings","drivings","carstowages",
				  "deliverywaybills","stitchings","warehouses","deliveries",
				  "orders","repertors","repertors","circuits"});
		  JSONObject json1=new JSONObject();
		  String json=json1.fromObject(map, config).toString();
		  getPrintWriter().print(json);
	}
	/*************************************��������*************************************************/
	//�������
	public void saveCarstwoage(){
		service.saveCarstwoage(carstwo);
	}
	
	
	
/**
 * ʵ������	
 * 
 * 
 * 
 */
	public void find(){
		List<Branch> br=service.findBranch();
		JsonConfig config = new JsonConfig();
		config.setExcludes(new String[] { "waybills","drivings","carstowages","deliverywaybills","stitchings","warehouses","deliveries","orders","repertors","circuits"});//���˵�����ת����������
		JSONArray jsonArray=JSONArray.fromObject(br,config);
		String json=jsonArray.toString();
		getPrintWriter().print(json);
	}
} 
