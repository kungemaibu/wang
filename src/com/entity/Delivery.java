package com.entity;

import java.util.Date;

/**
 * Delivery entity. @author MyEclipse Persistence Tools
 */

public class Delivery implements java.io.Serializable {

	// Fields

	private Integer deliveryId;
	private Branch branch;
	private Batchstatus batchstatus;
	private Vehicle vehicle;
	private Deliverywaybill deliverywaybill;
	private Driving driving;
	private String deliveryName;
	private Date deliveryK;
	private Date deliveryJ;
	private String deliveryBei;

	// Constructors

	/** default constructor */
	public Delivery() {
	}

	/** full constructor */
	public Delivery(Branch branch, Batchstatus batchstatus, Vehicle vehicle, Deliverywaybill deliverywaybill,
			Driving driving, String deliveryName, Date deliveryK, Date deliveryJ, String deliveryBei) {
		this.branch = branch;
		this.batchstatus = batchstatus;
		this.vehicle = vehicle;
		this.deliverywaybill = deliverywaybill;
		this.driving = driving;
		this.deliveryName = deliveryName;
		this.deliveryK = deliveryK;
		this.deliveryJ = deliveryJ;
		this.deliveryBei = deliveryBei;
	}

	// Property accessors

	public Integer getDeliveryId() {
		return this.deliveryId;
	}

	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Batchstatus getBatchstatus() {
		return this.batchstatus;
	}

	public void setBatchstatus(Batchstatus batchstatus) {
		this.batchstatus = batchstatus;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Deliverywaybill getDeliverywaybill() {
		return this.deliverywaybill;
	}

	public void setDeliverywaybill(Deliverywaybill deliverywaybill) {
		this.deliverywaybill = deliverywaybill;
	}

	public Driving getDriving() {
		return this.driving;
	}

	public void setDriving(Driving driving) {
		this.driving = driving;
	}

	public String getDeliveryName() {
		return this.deliveryName;
	}

	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public Date getDeliveryK() {
		return this.deliveryK;
	}

	public void setDeliveryK(Date deliveryK) {
		this.deliveryK = deliveryK;
	}

	public Date getDeliveryJ() {
		return this.deliveryJ;
	}

	public void setDeliveryJ(Date deliveryJ) {
		this.deliveryJ = deliveryJ;
	}

	public String getDeliveryBei() {
		return this.deliveryBei;
	}

	public void setDeliveryBei(String deliveryBei) {
		this.deliveryBei = deliveryBei;
	}

}