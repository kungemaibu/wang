package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account implements java.io.Serializable {

	// Fields

	private Integer accountId;
	private Accounttype accounttype;
	private String accountName;
	private String accountPossword;
	private String accountXing;
	private Set emps = new HashSet(0);

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** full constructor */
	public Account(Accounttype accounttype, String accountName, String accountPossword, String accountXing, Set emps) {
		this.accounttype = accounttype;
		this.accountName = accountName;
		this.accountPossword = accountPossword;
		this.accountXing = accountXing;
		this.emps = emps;
	}

	// Property accessors

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Accounttype getAccounttype() {
		return this.accounttype;
	}

	public void setAccounttype(Accounttype accounttype) {
		this.accounttype = accounttype;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountPossword() {
		return this.accountPossword;
	}

	public void setAccountPossword(String accountPossword) {
		this.accountPossword = accountPossword;
	}

	public String getAccountXing() {
		return this.accountXing;
	}

	public void setAccountXing(String accountXing) {
		this.accountXing = accountXing;
	}

	public Set getEmps() {
		return this.emps;
	}

	public void setEmps(Set emps) {
		this.emps = emps;
	}

}