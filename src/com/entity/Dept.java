package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer deptId;
	private String deptName;
	private String deptType;
	private String deptBei;
	private Set emps = new HashSet(0);
	private Set drivings = new HashSet(0);
	private Set positions = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String deptName, String deptType, String deptBei, Set emps, Set drivings, Set positions) {
		this.deptName = deptName;
		this.deptType = deptType;
		this.deptBei = deptBei;
		this.emps = emps;
		this.drivings = drivings;
		this.positions = positions;
	}

	// Property accessors

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptType() {
		return this.deptType;
	}

	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

	public String getDeptBei() {
		return this.deptBei;
	}

	public void setDeptBei(String deptBei) {
		this.deptBei = deptBei;
	}

	public Set getEmps() {
		return this.emps;
	}

	public void setEmps(Set emps) {
		this.emps = emps;
	}

	public Set getDrivings() {
		return this.drivings;
	}

	public void setDrivings(Set drivings) {
		this.drivings = drivings;
	}

	public Set getPositions() {
		return this.positions;
	}

	public void setPositions(Set positions) {
		this.positions = positions;
	}

}