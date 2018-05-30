package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmpDao;
import com.entity.Emp;
import com.service.EmpService;
import com.util.Pager;
@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmpDao dao;
	

	public EmpDao getDao() {
		return dao;
	}

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	
	public Pager findByPages(int curPage, int pageSize) {
		
		return dao.findByPages(curPage, pageSize);
	}

	
	public void save(Emp e) {
		dao.save(e);
		
	}

	@Transactional
	public void update(Emp e) {
		dao.update(e);
		
	}

	@Transactional
	public void delete(Emp e) {
		dao.delete(e);
		
	}

	@Transactional
	public Emp get(Integer id) {
		// TODO Auto-generated method stub
		return dao.get(id);
	}

}
