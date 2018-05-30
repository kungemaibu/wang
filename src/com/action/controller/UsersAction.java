package com.action.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Emp;
import com.entity.Modules;
import com.entity.Rolesmodule;
import com.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.service.UsersService;

@Controller
public class UsersAction extends BaseAction{
	private Emp emp;
   public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
private Users users;
   public Users getUsers() {
	return users;
}
public void setUsers(Users users) {
	this.users = users;
}
private Modules modules;


public Modules getModules() {
	return modules;
}
public void setModules(Modules modules) {
	this.modules = modules;
}
private String userName;
private String userPsd;
private int rolesId;
private String modulesId;

public String getModulesId() {
	return modulesId;
}
public void setModulesId(String modulesId) {
	this.modulesId = modulesId;
}
public int getRolesId() {
	return rolesId;
}
public void setRolesId(int rolesId) {
	this.rolesId = rolesId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPsd() {
	return userPsd;
}
public void setUserPsd(String userPsd) {
	this.userPsd = userPsd;
}
@Autowired
   private UsersService us;

  
//查出是否有此用户
public String findUsers(){
	   List<Users> list=us.find(userName,userPsd,rolesId);
	   getRequest().put("list",list);
	   //System.out.println(rolesId);
	   if (list.size()>0) {
		   return "module";
	} else {
		return "findUsers";
	}
	
	 }

//详细可用窗口
public String xiangxi(){
	
	
	List<Rolesmodule> list=us.findxiangxi(rolesId);
	getRequest().put("list",list);
	return "cheng";
	
}
//查询职位
public String gongsi_zhiwei(){
	  List<Users> list=us.find();
	  getRequest().put("list",list);
	return "zhiwei";
	
}

////注册账户
public String adduser(){
	us.adduser(users);
	return "adduser";
	
}
}
