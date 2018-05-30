package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Payment entity. @author MyEclipse Persistence Tools
 */

public class Payment implements java.io.Serializable {

	// Fields

	private Integer paymentId;
	private String paymentName;
	private Set vehicles = new HashSet(0);
	private Set clienteles = new HashSet(0);
	private Set waybills = new HashSet(0);

	// Constructors

	/** default constructor */
	public Payment() {
	}

	/** full constructor */
	public Payment(String paymentName, Set vehicles, Set clienteles, Set waybills) {
		this.paymentName = paymentName;
		this.vehicles = vehicles;
		this.clienteles = clienteles;
		this.waybills = waybills;
	}

	// Property accessors

	public Integer getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentName() {
		return this.paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public Set getVehicles() {
		return this.vehicles;
	}

	public void setVehicles(Set vehicles) {
		this.vehicles = vehicles;
	}

	public Set getClienteles() {
		return this.clienteles;
	}

	public void setClienteles(Set clienteles) {
		this.clienteles = clienteles;
	}

	public Set getWaybills() {
		return this.waybills;
	}

	public void setWaybills(Set waybills) {
		this.waybills = waybills;
	}

}