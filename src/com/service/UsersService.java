package com.service;

import java.util.List;

import com.entity.Modules;
import com.entity.Rolesmodule;
import com.entity.Users;

public interface UsersService {
	//��ѯ�˻��Ƿ����
   public List<Users> find(String userName,String userPsd,int rolesId);
 
 //��ϸҳ����ʾ
   public List<Rolesmodule> findxiangxi(int rolesId);
   
 //��ѯְλ
   public List<Users> find();
   
 //����Ա����Ϣ
   public void zhiwei_up(Users users);

 //ע���˻�
   public void adduser(Users users);
}
