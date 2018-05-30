package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Batchstatus entity. @author MyEclipse Persistence Tools
 */

public class Batchstatus implements java.io.Serializable {

	// Fields

	private Integer batchStatus;
	private String statusName;
	private Set deliveries = new HashSet(0);
	private Set carstowages = new HashSet(0);

	// Constructors

	/** default constructor */
	public Batchstatus() {
	}

	/** full constructor */
	public Batchstatus(String statusName, Set deliveries, Set carstowages) {
		this.statusName = statusName;
		this.deliveries = deliveries;
		this.carstowages = carstowages;
	}

	// Property accessors

	public Integer getBatchStatus() {
		return this.batchStatus;
	}

	public void setBatchStatus(Integer batchStatus) {
		this.batchStatus = batchStatus;
	}

	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public Set getDeliveries() {
		return this.deliveries;
	}

	public void setDeliveries(Set deliveries) {
		this.deliveries = deliveries;
	}

	public Set getCarstowages() {
		return this.carstowages;
	}

	public void setCarstowages(Set carstowages) {
		this.carstowages = carstowages;
	}

}