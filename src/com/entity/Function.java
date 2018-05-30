package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Function entity. @author MyEclipse Persistence Tools
 */

public class Function implements java.io.Serializable {

	// Fields

	private Integer functionId;
	private String functionName;
	private String functionType;
	private String functionUrl;
	private Integer functionFuid;
	private Set functionroles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Function() {
	}

	/** full constructor */
	public Function(String functionName, String functionType, String functionUrl, Integer functionFuid,
			Set functionroles) {
		this.functionName = functionName;
		this.functionType = functionType;
		this.functionUrl = functionUrl;
		this.functionFuid = functionFuid;
		this.functionroles = functionroles;
	}

	// Property accessors

	public Integer getFunctionId() {
		return this.functionId;
	}

	public void setFunctionId(Integer functionId) {
		this.functionId = functionId;
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionType() {
		return this.functionType;
	}

	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}

	public String getFunctionUrl() {
		return this.functionUrl;
	}

	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}

	public Integer getFunctionFuid() {
		return this.functionFuid;
	}

	public void setFunctionFuid(Integer functionFuid) {
		this.functionFuid = functionFuid;
	}

	public Set getFunctionroles() {
		return this.functionroles;
	}

	public void setFunctionroles(Set functionroles) {
		this.functionroles = functionroles;
	}

}