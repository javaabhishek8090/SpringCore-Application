package com.nit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nit.dao.EmployeeDAO;
import com.nit.dao.EmployeeDAOIMPL;
import com.nit.dto.EmployeeDTO;
import com.nit.entity.EmployeeHLO;

@Service("empService")
public class EmployeeServiceMngntIMPL implements EmployeeServiceMngnt {

	@Autowired()
	private EmployeeDAO dao;
	
	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int registerEmployee(EmployeeDTO dto) {
		EmployeeHLO hlo=null;
		int idval=0;
		hlo=new EmployeeHLO();
		BeanUtils.copyProperties(dto, hlo);
		idval=dao.insert(hlo);
		return idval;
	}

}
