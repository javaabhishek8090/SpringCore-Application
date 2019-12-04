package com.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.Data;

@Data
@Entity
@Table(name = "Employee1")
public class EmployeeHLO {

	@Id
	@Column(name = "ID", length = 10)
	@Type(type = "int")
	@GenericGenerator(name = "gen1", strategy = "increment")

	@GeneratedValue(generator = "gen1")

	private int eId;

	@Column(name = "ENAME", length = 15)
	@Type(type = "string")
	private String eName;

	@Column(name = "ADDR", length = 20)
	@Type(type = "string")
	private String addr;

	@Column(name = "SAL", length = 10)
	@Type(type = "float")
	private float sal;

}
