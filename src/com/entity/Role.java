package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private Integer roleId;
	private String roleName;
	private String roleType;
	private String roleBei;
	private Set functionroles = new HashSet(0);
	private Set emproles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** full constructor */
	public Role(String roleName, String roleType, String roleBei, Set functionroles, Set emproles) {
		this.roleName = roleName;
		this.roleType = roleType;
		this.roleBei = roleBei;
		this.functionroles = functionroles;
		this.emproles = emproles;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getRoleBei() {
		return this.roleBei;
	}

	public void setRoleBei(String roleBei) {
		this.roleBei = roleBei;
	}

	public Set getFunctionroles() {
		return this.functionroles;
	}

	public void setFunctionroles(Set functionroles) {
		this.functionroles = functionroles;
	}

	public Set getEmproles() {
		return this.emproles;
	}

	public void setEmproles(Set emproles) {
		this.emproles = emproles;
	}

}