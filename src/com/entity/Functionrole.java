package com.entity;

/**
 * Functionrole entity. @author MyEclipse Persistence Tools
 */

public class Functionrole implements java.io.Serializable {

	// Fields

	private Integer functionRoleId;
	private Function function;
	private Role role;

	// Constructors

	/** default constructor */
	public Functionrole() {
	}

	/** full constructor */
	public Functionrole(Function function, Role role) {
		this.function = function;
		this.role = role;
	}

	// Property accessors

	public Integer getFunctionRoleId() {
		return this.functionRoleId;
	}

	public void setFunctionRoleId(Integer functionRoleId) {
		this.functionRoleId = functionRoleId;
	}

	public Function getFunction() {
		return this.function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}