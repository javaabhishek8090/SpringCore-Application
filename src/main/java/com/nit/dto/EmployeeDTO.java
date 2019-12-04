package com.nit.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {

	private int eId;
	private String eName;
	private String addr;
	private float sal;

	
}
