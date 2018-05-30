package com.entity;

/**
 * Emprole entity. @author MyEclipse Persistence Tools
 */

public class Emprole implements java.io.Serializable {

	// Fields

	private Integer empRole;
	private Role role;
	private Integer empId;

	// Constructors

	/** default constructor */
	public Emprole() {
	}

	/** full constructor */
	public Emprole(Role role, Integer empId) {
		this.role = role;
		this.empId = empId;
	}

	// Property accessors

	public Integer getEmpRole() {
		return this.empRole;
	}

	public void setEmpRole(Integer empRole) {
		this.empRole = empRole;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

}