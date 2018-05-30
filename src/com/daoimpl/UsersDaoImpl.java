package com.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dao.UsersDao;
import com.entity.Modules;
import com.entity.Rolesmodule;
import com.entity.Users;
@Repository
public class UsersDaoImpl implements UsersDao {
 
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Users> find(String userName,String userPsd,int rolesId) {
		// TODO Auto-generated method stub
		String hql=" from Users u where  u.userName='"+userName+"' and u.userPsd='"+userPsd+"' and u.rolestable.rolesId='"+rolesId+"'";
		return hibernateTemplate.find(hql);
	}



	@Override
	public List<Rolesmodule> findxiangxi(int rolesId) {
		// TODO Auto-generated method stub
		//String hql=" from Modules m where m.modulesId='"+mid+"'";
		//String hql=" select m.* from Rolestable r join Rolesmodule rm on r.rolesId=rm.rolestable.rolesId join Modules m on rm.modules.modulesId=m.modulesId where r.rolesId='"+rolesId+"'";
		String hql="from Rolesmodule as rm where rm.rolestable.rolesId='"+rolesId+"'";
		return hibernateTemplate.find(hql);
	}

	@Override
	public List<Users> find() {
		// TODO Auto-generated method stub
		String hql=" from Users ";
		return hibernateTemplate.find(hql);
	}

	@Override
	public void zhiwei_up(Users users) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(users);
	}

	@Override
	public void adduser(Users users) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(users);
	}

	
	

}
