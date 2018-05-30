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
	//车辆实体类
	Vehicle v=new Vehicle();
	//司机实体类
	private Driving d=new Driving();
	public Circuit c=new Circuit();//线路
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
	//查询所有车辆                
	public String findCar(){          
		Pagekun car=service.findCar(6,p.getNowPage());
		request().put("car", car);
		return "findCar";
	}
	//添加车辆
	public void saveCar(){
		service.saveCar(v);
		getPrintWriter().print("添加成功");
		//return "findCar";
	}
	//更改车辆信息
	public String findcar(){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		Vehicle car=service.findcar(v.getVehicleId());
		List<Payment> list=service.findPay();
		List<Circuit> cir=service.findCircuit();//查询线路
		request().put("cir",cir);
		request().put("pay",list);
		request().put("car", car);
		return "findcar";
	}
	public String updateCar(){
		service.updateCar(v); 
		return "findCar";
	}
	//删除车辆
	public void deleteCar(){
		service.deleteCar(v);
		getPrintWriter().print("删除成功");
		}
	/****************************************司机管理**************************************************/
	//司机查询
	public String findDriving(){
		Pagekun driver=service.findDriving(5,p.getNowPage());
		request().put("driver",driver);
		return "findDriving";
	}
	//司机更改
	public String finddriving(){
		Driving d1=service.finddriving(d.getDriverId());
		
		request().put("dr",d1);
		return "finddriving";
	}
	public String updateDriving(){
		service.updateDriving(d);
		return "findCar";
	}
	//司机添加
	public void saveDriving(){
		service.saveDriving(d);
		getPrintWriter().print("添加成功");
	}
	//司机删除
	public void deleteDriving(){
		service.deleteDriving(d);
		getPrintWriter().print("删除成功");
	}
	/**************************************线路管理**********************************************/
	//添加线路
	public void saveCircuit(){
		service.saveCircuit(c);
		getPrintWriter().print("操作成功");
	}
	//删除线路
	public void deleteCircuit(){
		service.deleteCircuit(c);
		getPrintWriter().print("删除成功");
	}
	//修改线路
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
	//查询线路
	public String findCircuit(){
		List<Circuit> list=service.findCircuit();
		request().put("cir", list);
		return "findCircuit";
		
	}
	
	
	
	
	//查询车的外键连接表
	public void findcarp(){
		  List<Payment> plist=service.findPay();//查询支付方式
		  List<Circuit> clist=service.findCircuit();//查询线路
		  List<Branch> blist=service.findBranch();//查询网点
		  Map map=new HashMap();
		  map.put("blist",blist);
		  map.put("plist", plist);map.put("clist", clist);//把集合存到map集合中  , 此后进行转换成json对象
		  JsonConfig config=new JsonConfig();//过滤掉不需转换成的属性
		  config.setExcludes(new String[]{"vehicles","clienteles","waybills",
				  "branch","emp","stitchings","drivings","carstowages",
				  "deliverywaybills","stitchings","warehouses","deliveries",
				  "orders","repertors","repertors","circuits"});
		  JSONObject json1=new JSONObject();
		  String json=json1.fromObject(map, config).toString();
		  getPrintWriter().print(json);
	}
	/*************************************车辆配载*************************************************/
	//配载添加
	public void saveCarstwoage(){
		service.saveCarstwoage(carstwo);
	}
	
	
	
/**
 * 实验区域	
 * 
 * 
 * 
 */
	public void find(){
		List<Branch> br=service.findBranch();
		JsonConfig config = new JsonConfig();
		config.setExcludes(new String[] { "waybills","drivings","carstowages","deliverywaybills","stitchings","warehouses","deliveries","orders","repertors","circuits"});//过滤掉不需转换的属性名
		JSONArray jsonArray=JSONArray.fromObject(br,config);
		String json=jsonArray.toString();
		getPrintWriter().print(json);
	}
} 
