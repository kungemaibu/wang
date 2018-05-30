package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Modules entity. @author MyEclipse Persistence Tools
 */

public class Modules implements java.io.Serializable {

	// Fields

	private String modulesId;
	private String modulesText;
	private String modulesType;
	private String parentId;
	private String modulesUrl;
	private Set rolesmodules = new HashSet(0);

	// Constructors

	/** default constructor */
	public Modules() {
	}

	/** full constructor */
	public Modules(String modulesText, String modulesType, String parentId, String modulesUrl, Set rolesmodules) {
		this.modulesText = modulesText;
		this.modulesType = modulesType;
		this.parentId = parentId;
		this.modulesUrl = modulesUrl;
		this.rolesmodules = rolesmodules;
	}

	// Property accessors

	public String getModulesId() {
		return this.modulesId;
	}

	public void setModulesId(String modulesId) {
		this.modulesId = modulesId;
	}

	public String getModulesText() {
		return this.modulesText;
	}

	public void setModulesText(String modulesText) {
		this.modulesText = modulesText;
	}

	public String getModulesType() {
		return this.modulesType;
	}

	public void setModulesType(String modulesType) {
		this.modulesType = modulesType;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getModulesUrl() {
		return this.modulesUrl;
	}

	public void setModulesUrl(String modulesUrl) {
		this.modulesUrl = modulesUrl;
	}

	public Set getRolesmodules() {
		return this.rolesmodules;
	}

	public void setRolesmodules(Set rolesmodules) {
		this.rolesmodules = rolesmodules;
	}

}