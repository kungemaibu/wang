package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Deliverytype entity. @author MyEclipse Persistence Tools
 */

public class Deliverytype implements java.io.Serializable {

	// Fields

	private Integer deliveryTypeId;
	private String deliveryTypeName;
	private Set deliverywaybills = new HashSet(0);

	// Constructors

	/** default constructor */
	public Deliverytype() {
	}

	/** full constructor */
	public Deliverytype(String deliveryTypeName, Set deliverywaybills) {
		this.deliveryTypeName = deliveryTypeName;
		this.deliverywaybills = deliverywaybills;
	}

	// Property accessors

	public Integer getDeliveryTypeId() {
		return this.deliveryTypeId;
	}

	public void setDeliveryTypeId(Integer deliveryTypeId) {
		this.deliveryTypeId = deliveryTypeId;
	}

	public String getDeliveryTypeName() {
		return this.deliveryTypeName;
	}

	public void setDeliveryTypeName(String deliveryTypeName) {
		this.deliveryTypeName = deliveryTypeName;
	}

	public Set getDeliverywaybills() {
		return this.deliverywaybills;
	}

	public void setDeliverywaybills(Set deliverywaybills) {
		this.deliverywaybills = deliverywaybills;
	}

}