package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Rolestable entity. @author MyEclipse Persistence Tools
 */

public class Rolestable implements java.io.Serializable {

	// Fields

	private Integer rolesId;
	private String rolesName;
	private Set userses = new HashSet(0);
	private Set rolesmodules = new HashSet(0);

	// Constructors

	/** default constructor */
	public Rolestable() {
	}

	/** full constructor */
	public Rolestable(String rolesName, Set userses, Set rolesmodules) {
		this.rolesName = rolesName;
		this.userses = userses;
		this.rolesmodules = rolesmodules;
	}

	// Property accessors

	public Integer getRolesId() {
		return this.rolesId;
	}

	public void setRolesId(Integer rolesId) {
		this.rolesId = rolesId;
	}

	public String getRolesName() {
		return this.rolesName;
	}

	public void setRolesName(String rolesName) {
		this.rolesName = rolesName;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

	public Set getRolesmodules() {
		return this.rolesmodules;
	}

	public void setRolesmodules(Set rolesmodules) {
		this.rolesmodules = rolesmodules;
	}

}