package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Position entity. @author MyEclipse Persistence Tools
 */

public class Position implements java.io.Serializable {

	// Fields

	private Integer positionId;
	private Dept dept;
	private String positionName;
	private String positionBei;
	private Set drivings = new HashSet(0);
	private Set emps = new HashSet(0);

	// Constructors

	/** default constructor */
	public Position() {
	}

	/** full constructor */
	public Position(Dept dept, String positionName, String positionBei, Set drivings, Set emps) {
		this.dept = dept;
		this.positionName = positionName;
		this.positionBei = positionBei;
		this.drivings = drivings;
		this.emps = emps;
	}

	// Property accessors

	public Integer getPositionId() {
		return this.positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getPositionBei() {
		return this.positionBei;
	}

	public void setPositionBei(String positionBei) {
		this.positionBei = positionBei;
	}

	public Set getDrivings() {
		return this.drivings;
	}

	public void setDrivings(Set drivings) {
		this.drivings = drivings;
	}

	public Set getEmps() {
		return this.emps;
	}

	public void setEmps(Set emps) {
		this.emps = emps;
	}

}