package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Deliverywaybill entity. @author MyEclipse Persistence Tools
 */

public class Deliverywaybill implements java.io.Serializable {

	// Fields

	private Integer deliveryWaybillid;
	private Branch branch;
	private Waybill waybill;
	private Deliverytype deliverytype;
	private Driving driving;
	private Set deliveries = new HashSet(0);

	// Constructors

	/** default constructor */
	public Deliverywaybill() {
	}

	/** full constructor */
	public Deliverywaybill(Branch branch, Waybill waybill, Deliverytype deliverytype, Driving driving, Set deliveries) {
		this.branch = branch;
		this.waybill = waybill;
		this.deliverytype = deliverytype;
		this.driving = driving;
		this.deliveries = deliveries;
	}

	// Property accessors

	public Integer getDeliveryWaybillid() {
		return this.deliveryWaybillid;
	}

	public void setDeliveryWaybillid(Integer deliveryWaybillid) {
		this.deliveryWaybillid = deliveryWaybillid;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Waybill getWaybill() {
		return this.waybill;
	}

	public void setWaybill(Waybill waybill) {
		this.waybill = waybill;
	}

	public Deliverytype getDeliverytype() {
		return this.deliverytype;
	}

	public void setDeliverytype(Deliverytype deliverytype) {
		this.deliverytype = deliverytype;
	}

	public Driving getDriving() {
		return this.driving;
	}

	public void setDriving(Driving driving) {
		this.driving = driving;
	}

	public Set getDeliveries() {
		return this.deliveries;
	}

	public void setDeliveries(Set deliveries) {
		this.deliveries = deliveries;
	}

}