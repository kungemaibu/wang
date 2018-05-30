package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Accounttype entity. @author MyEclipse Persistence Tools
 */

public class Accounttype implements java.io.Serializable {

	// Fields

	private Integer accountTypeId;
	private String accountTypeName;
	private Set accounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Accounttype() {
	}

	/** full constructor */
	public Accounttype(String accountTypeName, Set accounts) {
		this.accountTypeName = accountTypeName;
		this.accounts = accounts;
	}

	// Property accessors

	public Integer getAccountTypeId() {
		return this.accountTypeId;
	}

	public void setAccountTypeId(Integer accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public String getAccountTypeName() {
		return this.accountTypeName;
	}

	public void setAccountTypeName(String accountTypeName) {
		this.accountTypeName = accountTypeName;
	}

	public Set getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set accounts) {
		this.accounts = accounts;
	}

}