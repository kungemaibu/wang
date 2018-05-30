package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Stitching entity. @author MyEclipse Persistence Tools
 */

public class Stitching implements java.io.Serializable {

	// Fields

	private Integer stitchingId;
	private Branch branch;
	private Circuit circuit;
	private String stitchingName;
	private Set carstowages = new HashSet(0);

	// Constructors

	/** default constructor */
	public Stitching() {
	}

	/** full constructor */
	public Stitching(Branch branch, Circuit circuit, String stitchingName, Set carstowages) {
		this.branch = branch;
		this.circuit = circuit;
		this.stitchingName = stitchingName;
		this.carstowages = carstowages;
	}

	// Property accessors

	public Integer getStitchingId() {
		return this.stitchingId;
	}

	public void setStitchingId(Integer stitchingId) {
		this.stitchingId = stitchingId;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Circuit getCircuit() {
		return this.circuit;
	}

	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}

	public String getStitchingName() {
		return this.stitchingName;
	}

	public void setStitchingName(String stitchingName) {
		this.stitchingName = stitchingName;
	}

	public Set getCarstowages() {
		return this.carstowages;
	}

	public void setCarstowages(Set carstowages) {
		this.carstowages = carstowages;
	}

}