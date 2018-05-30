package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsersDao;
import com.entity.Modules;
import com.entity.Rolesmodule;
import com.entity.Users;
import com.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
@Autowired
 private UsersDao dao;

	public UsersDao getDao() {
	return dao;
}

public void setDao(UsersDao dao) {
	this.dao = dao;
}

	@Override
	public List<Users> find(String userName,String userPsd,int rolesId) {
		// TODO Auto-generated method stub
		return dao.find(userName,userPsd,rolesId);
	}

	
	@Override
	public List<Rolesmodule> findxiangxi(int rolesId) {
		// TODO Auto-generated method stub
		return dao.findxiangxi(rolesId);
	}

	@Override
	public List<Users> find() {
		// TODO Auto-generated method stub
		return dao.find();
	}

	@Override
	@Transactional
	public void zhiwei_up(Users users) {
		// TODO Auto-generated method stub
		dao.zhiwei_up(users);
	}

	@Override
	@Transactional
	public void adduser(Users users) {
		// TODO Auto-generated method stub
		dao.adduser(users);
	}

	

}
