package com.service;

import java.util.List;

import com.entity.Modules;
import com.entity.Rolesmodule;
import com.entity.Users;

public interface UsersService {
	//查询账户是否存在
   public List<Users> find(String userName,String userPsd,int rolesId);
 
 //详细页面显示
   public List<Rolesmodule> findxiangxi(int rolesId);
   
 //查询职位
   public List<Users> find();
   
 //更改员工信息
   public void zhiwei_up(Users users);

 //注册账户
   public void adduser(Users users);
}
