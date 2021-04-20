package com.te.springmvcproject.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class EmployeeBean implements Serializable{
	
	@Id
	private int id;
	
	@Column
	private String Password;
	
	@Column
	private Date dob;
	
	@Column
	private String name;
}
