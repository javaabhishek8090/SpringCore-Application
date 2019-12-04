package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.dto.EmployeeDTO;
import com.nit.service.EmployeeServiceMngnt;
import com.nit.service.EmployeeServiceMngntIMPL;

public class ORMTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		EmployeeDTO dto = null;
		EmployeeServiceMngnt service = null;
		ctx = new FileSystemXmlApplicationContext("src/main/java/com/nit/cfgs/applicationContext.xml");
		service = ctx.getBean("empService", EmployeeServiceMngnt.class);
		dto = new EmployeeDTO();
	//	dto.seteId(1001);
		dto.setAddr("HYD");
		dto.setEName("Raja");
		
		dto.setSal(10021);
		try {
			int idval = 0;
			idval = service.registerEmployee(dto);
			System.out.println("Employee Register::::" + idval);
		} catch (Exception e) {

			System.out.println("Employee Registaion Failed");
			e.printStackTrace();
		}
		((AbstractApplicationContext) ctx).close();
	}

}
