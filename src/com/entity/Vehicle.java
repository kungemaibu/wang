package com.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vehicle entity. @author MyEclipse Persistence Tools
 */

public class Vehicle implements java.io.Serializable {

	// Fields

	private Integer vehicleId;
	private Circuit circuit;
	private Driving driving;
	private Payment payment;
	private String vehicleChe;
	private String vehicleSource;
	private String statement;
	private String headstock;
	private String motorcycle;
	private String brand;
	private Double vload;
	private Double vbulk;
	private Double vlength;
	private Double vwidth;
	private Double vheight;
	private String vcolour;
	private Date vriqi;
	private String vvin;
	private String vengine;
	private String voperation;
	private String insurance;
	private Date insuranceK;
	private Date insuranceJ;
	private String carDanWei;
	private String carAdress;
	private String carPhone;
	private Set drivings = new HashSet(0);
	private Set carstowages = new HashSet(0);
	private Set deliveries = new HashSet(0);

	// Constructors

	/** default constructor */
	public Vehicle() {
	}

	/** full constructor */
	public Vehicle(Circuit circuit, Driving driving, Payment payment, String vehicleChe, String vehicleSource,
			String statement, String headstock, String motorcycle, String brand, Double vload, Double vbulk,
			Double vlength, Double vwidth, Double vheight, String vcolour, Date vriqi, String vvin, String vengine,
			String voperation, String insurance, Date insuranceK, Date insuranceJ, String carDanWei, String carAdress,
			String carPhone, Set drivings, Set carstowages, Set deliveries) {
		this.circuit = circuit;
		this.driving = driving;
		this.payment = payment;
		this.vehicleChe = vehicleChe;
		this.vehicleSource = vehicleSource;
		this.statement = statement;
		this.headstock = headstock;
		this.motorcycle = motorcycle;
		this.brand = brand;
		this.vload = vload;
		this.vbulk = vbulk;
		this.vlength = vlength;
		this.vwidth = vwidth;
		this.vheight = vheight;
		this.vcolour = vcolour;
		this.vriqi = vriqi;
		this.vvin = vvin;
		this.vengine = vengine;
		this.voperation = voperation;
		this.insurance = insurance;
		this.insuranceK = insuranceK;
		this.insuranceJ = insuranceJ;
		this.carDanWei = carDanWei;
		this.carAdress = carAdress;
		this.carPhone = carPhone;
		this.drivings = drivings;
		this.carstowages = carstowages;
		this.deliveries = deliveries;
	}

	// Property accessors

	public Integer getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Circuit getCircuit() {
		return this.circuit;
	}

	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}

	public Driving getDriving() {
		return this.driving;
	}

	public void setDriving(Driving driving) {
		this.driving = driving;
	}

	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public String getVehicleChe() {
		return this.vehicleChe;
	}

	public void setVehicleChe(String vehicleChe) {
		this.vehicleChe = vehicleChe;
	}

	public String getVehicleSource() {
		return this.vehicleSource;
	}

	public void setVehicleSource(String vehicleSource) {
		this.vehicleSource = vehicleSource;
	}

	public String getStatement() {
		return this.statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getHeadstock() {
		return this.headstock;
	}

	public void setHeadstock(String headstock) {
		this.headstock = headstock;
	}

	public String getMotorcycle() {
		return this.motorcycle;
	}

	public void setMotorcycle(String motorcycle) {
		this.motorcycle = motorcycle;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getVload() {
		return this.vload;
	}

	public void setVload(Double vload) {
		this.vload = vload;
	}

	public Double getVbulk() {
		return this.vbulk;
	}

	public void setVbulk(Double vbulk) {
		this.vbulk = vbulk;
	}

	public Double getVlength() {
		return this.vlength;
	}

	public void setVlength(Double vlength) {
		this.vlength = vlength;
	}

	public Double getVwidth() {
		return this.vwidth;
	}

	public void setVwidth(Double vwidth) {
		this.vwidth = vwidth;
	}

	public Double getVheight() {
		return this.vheight;
	}

	public void setVheight(Double vheight) {
		this.vheight = vheight;
	}

	public String getVcolour() {
		return this.vcolour;
	}

	public void setVcolour(String vcolour) {
		this.vcolour = vcolour;
	}

	public Date getVriqi() {
		return this.vriqi;
	}

	public void setVriqi(Date vriqi) {
		this.vriqi = vriqi;
	}

	public String getVvin() {
		return this.vvin;
	}

	public void setVvin(String vvin) {
		this.vvin = vvin;
	}

	public String getVengine() {
		return this.vengine;
	}

	public void setVengine(String vengine) {
		this.vengine = vengine;
	}

	public String getVoperation() {
		return this.voperation;
	}

	public void setVoperation(String voperation) {
		this.voperation = voperation;
	}

	public String getInsurance() {
		return this.insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public Date getInsuranceK() {
		return this.insuranceK;
	}

	public void setInsuranceK(Date insuranceK) {
		this.insuranceK = insuranceK;
	}

	public Date getInsuranceJ() {
		return this.insuranceJ;
	}

	public void setInsuranceJ(Date insuranceJ) {
		this.insuranceJ = insuranceJ;
	}

	public String getCarDanWei() {
		return this.carDanWei;
	}

	public void setCarDanWei(String carDanWei) {
		this.carDanWei = carDanWei;
	}

	public String getCarAdress() {
		return this.carAdress;
	}

	public void setCarAdress(String carAdress) {
		this.carAdress = carAdress;
	}

	public String getCarPhone() {
		return this.carPhone;
	}

	public void setCarPhone(String carPhone) {
		this.carPhone = carPhone;
	}

	public Set getDrivings() {
		return this.drivings;
	}

	public void setDrivings(Set drivings) {
		this.drivings = drivings;
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

}