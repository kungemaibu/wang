package com.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Driving entity. @author MyEclipse Persistence Tools
 */

public class Driving implements java.io.Serializable {

	// Fields

	private Integer driverId;
	private Branch branch;
	private Position position;
	private Vehicle vehicle;
	private Dept dept;
	private String driverName;
	private String driverPhone;
	private String driverSex;
	private String driverAdress;
	private Date contractK;
	private Date contractJ;
	private String driverBei;
	private Date drivingDate;
	private String drivingNum;
	private String drivingChe;
	private Set carstowages = new HashSet(0);
	private Set deliveries = new HashSet(0);
	private Set deliverywaybills = new HashSet(0);
	private Set vehicles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Driving() {
	}

	/** full constructor */
	public Driving(Branch branch, Position position, Vehicle vehicle, Dept dept, String driverName, String driverPhone,
			String driverSex, String driverAdress, Date contractK, Date contractJ, String driverBei, Date drivingDate,
			String drivingNum, String drivingChe, Set carstowages, Set deliveries, Set deliverywaybills, Set vehicles) {
		this.branch = branch;
		this.position = position;
		this.vehicle = vehicle;
		this.dept = dept;
		this.driverName = driverName;
		this.driverPhone = driverPhone;
		this.driverSex = driverSex;
		this.driverAdress = driverAdress;
		this.contractK = contractK;
		this.contractJ = contractJ;
		this.driverBei = driverBei;
		this.drivingDate = drivingDate;
		this.drivingNum = drivingNum;
		this.drivingChe = drivingChe;
		this.carstowages = carstowages;
		this.deliveries = deliveries;
		this.deliverywaybills = deliverywaybills;
		this.vehicles = vehicles;
	}

	// Property accessors

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverPhone() {
		return this.driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public String getDriverSex() {
		return this.driverSex;
	}

	public void setDriverSex(String driverSex) {
		this.driverSex = driverSex;
	}

	public String getDriverAdress() {
		return this.driverAdress;
	}

	public void setDriverAdress(String driverAdress) {
		this.driverAdress = driverAdress;
	}

	public Date getContractK() {
		return this.contractK;
	}

	public void setContractK(Date contractK) {
		this.contractK = contractK;
	}

	public Date getContractJ() {
		return this.contractJ;
	}

	public void setContractJ(Date contractJ) {
		this.contractJ = contractJ;
	}

	public String getDriverBei() {
		return this.driverBei;
	}

	public void setDriverBei(String driverBei) {
		this.driverBei = driverBei;
	}

	public Date getDrivingDate() {
		return this.drivingDate;
	}

	public void setDrivingDate(Date drivingDate) {
		this.drivingDate = drivingDate;
	}

	public String getDrivingNum() {
		return this.drivingNum;
	}

	public void setDrivingNum(String drivingNum) {
		this.drivingNum = drivingNum;
	}

	public String getDrivingChe() {
		return this.drivingChe;
	}

	public void setDrivingChe(String drivingChe) {
		this.drivingChe = drivingChe;
	}

	public Set getCarstowages() {
		return this.carstowages;
	}

	public void setCarstowages(Set carstowages) {
		this.carstowages = carstowages;
	}

	public Set getDeliveries() {
		return this.deliveries;
	}

	public void setDeliveries(Set deliveries) {
		this.deliveries = deliveries;
	}

	public Set getDeliverywaybills() {
		return this.deliverywaybills;
	}

	public void setDeliverywaybills(Set deliverywaybills) {
		this.deliverywaybills = deliverywaybills;
	}

	public Set getVehicles() {
		return this.vehicles;
	}

	public void setVehicles(Set vehicles) {
		this.vehicles = vehicles;
	}

}