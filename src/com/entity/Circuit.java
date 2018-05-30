package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Circuit entity. @author MyEclipse Persistence Tools
 */

public class Circuit implements java.io.Serializable {

	// Fields

	private Integer circuitId;
	private Branch branch;
	private Emp emp;
	private String circuitName;
	private String mileage;
	private String aging;
	private String accounting;
	private String send;
	private String invest;
	private Set stitchings = new HashSet(0);
	private Set vehicles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Circuit() {
	}

	/** full constructor */
	public Circuit(Branch branch, Emp emp, String circuitName, String mileage, String aging, String accounting,
			String send, String invest, Set stitchings, Set vehicles) {
		this.branch = branch;
		this.emp = emp;
		this.circuitName = circuitName;
		this.mileage = mileage;
		this.aging = aging;
		this.accounting = accounting;
		this.send = send;
		this.invest = invest;
		this.stitchings = stitchings;
		this.vehicles = vehicles;
	}

	// Property accessors

	public Integer getCircuitId() {
		return this.circuitId;
	}

	public void setCircuitId(Integer circuitId) {
		this.circuitId = circuitId;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Emp getEmp() {
		return this.emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public String getCircuitName() {
		return this.circuitName;
	}

	public void setCircuitName(String circuitName) {
		this.circuitName = circuitName;
	}

	public String getMileage() {
		return this.mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getAging() {
		return this.aging;
	}

	public void setAging(String aging) {
		this.aging = aging;
	}

	public String getAccounting() {
		return this.accounting;
	}

	public void setAccounting(String accounting) {
		this.accounting = accounting;
	}

	public String getSend() {
		return this.send;
	}

	public void setSend(String send) {
		this.send = send;
	}

	public String getInvest() {
		return this.invest;
	}

	public void setInvest(String invest) {
		this.invest = invest;
	}

	public Set getStitchings() {
		return this.stitchings;
	}

	public void setStitchings(Set stitchings) {
		this.stitchings = stitchings;
	}

	public Set getVehicles() {
		return this.vehicles;
	}

	public void setVehicles(Set vehicles) {
		this.vehicles = vehicles;
	}

}