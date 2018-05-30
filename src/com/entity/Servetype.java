package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Servetype entity. @author MyEclipse Persistence Tools
 */

public class Servetype implements java.io.Serializable {

	// Fields

	private Integer serveId;
	private String serveName;
	private Set waybills = new HashSet(0);

	// Constructors

	/** default constructor */
	public Servetype() {
	}

	/** full constructor */
	public Servetype(String serveName, Set waybills) {
		this.serveName = serveName;
		this.waybills = waybills;
	}

	// Property accessors

	public Integer getServeId() {
		return this.serveId;
	}

	public void setServeId(Integer serveId) {
		this.serveId = serveId;
	}

	public String getServeName() {
		return this.serveName;
	}

	public void setServeName(String serveName) {
		this.serveName = serveName;
	}

	public Set getWaybills() {
		return this.waybills;
	}

	public void setWaybills(Set waybills) {
		this.waybills = waybills;
	}

}