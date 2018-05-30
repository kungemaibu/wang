package com.action.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.entity.Emp;
import com.entity.Rolestable;
import com.entity.Users;
import com.service.UsersService;
@Controller
public class FenpeiAction extends BaseAction {
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
	private Rolestable rolestable;
	
	public Rolestable getRolestable() {
		return rolestable;
	}
	public void setRolestable(Rolestable rolestable) {
		this.rolestable = rolestable;
	}
	private int rolesId;
	
	public int getRolesId() {
		return rolesId;
	}
	public void setRolesId(int rolesId) {
		this.rolesId = rolesId;
	}
	private int empId;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Autowired
	   private UsersService us;
	
	//更改员工信息

	public String zhiwei_up(){
		
		//users.getRolestable().setRolesId(rolesId);
		/*users.getEmp().setEmpId(empId);*/
		us.zhiwei_up(users);
		return "zhiwei_up";
		
	}
}
