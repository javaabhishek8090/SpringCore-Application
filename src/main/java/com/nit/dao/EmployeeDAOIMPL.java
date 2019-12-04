package com.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nit.entity.EmployeeHLO;

@Repository
public class EmployeeDAOIMPL implements EmployeeDAO {

	@Autowired
	private HibernateTemplate ht;

	@Override
	public int insert(EmployeeHLO hlo) {
		int idval = 0;
		// disable readonly mode
		ht.setCheckWriteOperations(false);
		idval = (int) ht.save(hlo);
		return idval;
	}

}
