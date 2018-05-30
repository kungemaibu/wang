package com.entity;

import java.util.Date;

/**
 * Carstowage entity. @author MyEclipse Persistence Tools
 */

public class Carstowage implements java.io.Serializable {

	// Fields

	private Integer peizaiId;
	private String startBatch;
	private Date departureTime;
	private Integer vehicleId;
	private Integer truckLoadingNum;
	private Integer branchId;
	private Integer startBatchStatus;
	private Integer carPath;
	private Integer driverId;
	private Double theLoadingWeight;
	private Double loadingVolume;
	private Integer totalBillNum;
	private Double totalWeight;
	private Double totalVolume;
	private String remarks;
	private Double currentPayment;
	private Double cashCharge;
	private Double toPayFreight;
	private Double vehicleTransportCosts;
	private Double backFreight;
	private Double totalTransportationCost;

	// Constructors

	/** default constructor */
	public Carstowage() {
	}

	/** minimal constructor */
	public Carstowage(String startBatch) {
		this.startBatch = startBatch;
	}

	/** full constructor */
	public Carstowage(String startBatch, Date departureTime, Integer vehicleId, Integer truckLoadingNum,
			Integer branchId, Integer startBatchStatus, Integer carPath, Integer driverId, Double theLoadingWeight,
			Double loadingVolume, Integer totalBillNum, Double totalWeight, Double totalVolume, String remarks,
			Double currentPayment, Double cashCharge, Double toPayFreight, Double vehicleTransportCosts,
			Double backFreight, Double totalTransportationCost) {
		this.startBatch = startBatch;
		this.departureTime = departureTime;
		this.vehicleId = vehicleId;
		this.truckLoadingNum = truckLoadingNum;
		this.branchId = branchId;
		this.startBatchStatus = startBatchStatus;
		this.carPath = carPath;
		this.driverId = driverId;
		this.theLoadingWeight = theLoadingWeight;
		this.loadingVolume = loadingVolume;
		this.totalBillNum = totalBillNum;
		this.totalWeight = totalWeight;
		this.totalVolume = totalVolume;
		this.remarks = remarks;
		this.currentPayment = currentPayment;
		this.cashCharge = cashCharge;
		this.toPayFreight = toPayFreight;
		this.vehicleTransportCosts = vehicleTransportCosts;
		this.backFreight = backFreight;
		this.totalTransportationCost = totalTransportationCost;
	}

	// Property accessors

	public Integer getPeizaiId() {
		return this.peizaiId;
	}

	public void setPeizaiId(Integer peizaiId) {
		this.peizaiId = peizaiId;
	}

	public String getStartBatch() {
		return this.startBatch;
	}

	public void setStartBatch(String startBatch) {
		this.startBatch = startBatch;
	}

	public Date getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Integer getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Integer getTruckLoadingNum() {
		return this.truckLoadingNum;
	}

	public void setTruckLoadingNum(Integer truckLoadingNum) {
		this.truckLoadingNum = truckLoadingNum;
	}

	public Integer getBranchId() {
		return this.branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public Integer getStartBatchStatus() {
		return this.startBatchStatus;
	}

	public void setStartBatchStatus(Integer startBatchStatus) {
		this.startBatchStatus = startBatchStatus;
	}

	public Integer getCarPath() {
		return this.carPath;
	}

	public void setCarPath(Integer carPath) {
		this.carPath = carPath;
	}

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public Double getTheLoadingWeight() {
		return this.theLoadingWeight;
	}

	public void setTheLoadingWeight(Double theLoadingWeight) {
		this.theLoadingWeight = theLoadingWeight;
	}

	public Double getLoadingVolume() {
		return this.loadingVolume;
	}

	public void setLoadingVolume(Double loadingVolume) {
		this.loadingVolume = loadingVolume;
	}

	public Integer getTotalBillNum() {
		return this.totalBillNum;
	}

	public void setTotalBillNum(Integer totalBillNum) {
		this.totalBillNum = totalBillNum;
	}

	public Double getTotalWeight() {
		return this.totalWeight;
	}

	public void setTotalWeight(Double totalWeight) {
		this.totalWeight = totalWeight;
	}

	public Double getTotalVolume() {
		return this.totalVolume;
	}

	public void setTotalVolume(Double totalVolume) {
		this.totalVolume = totalVolume;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Double getCurrentPayment() {
		return this.currentPayment;
	}

	public void setCurrentPayment(Double currentPayment) {
		this.currentPayment = currentPayment;
	}

	public Double getCashCharge() {
		return this.cashCharge;
	}

	public void setCashCharge(Double cashCharge) {
		this.cashCharge = cashCharge;
	}

	public Double getToPayFreight() {
		return this.toPayFreight;
	}

	public void setToPayFreight(Double toPayFreight) {
		this.toPayFreight = toPayFreight;
	}

	public Double getVehicleTransportCosts() {
		return this.vehicleTransportCosts;
	}

	public void setVehicleTransportCosts(Double vehicleTransportCosts) {
		this.vehicleTransportCosts = vehicleTransportCosts;
	}

	public Double getBackFreight() {
		return this.backFreight;
	}

	public void setBackFreight(Double backFreight) {
		this.backFreight = backFreight;
	}

	public Double getTotalTransportationCost() {
		return this.totalTransportationCost;
	}

	public void setTotalTransportationCost(Double totalTransportationCost) {
		this.totalTransportationCost = totalTransportationCost;
	}

}