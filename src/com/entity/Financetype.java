package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Financetype entity. @author MyEclipse Persistence Tools
 */

public class Financetype implements java.io.Serializable {

	// Fields

	private Integer financeTypeId;
	private String typeName;
	private Set journalaccounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Financetype() {
	}

	/** full constructor */
	public Financetype(String typeName, Set journalaccounts) {
		this.typeName = typeName;
		this.journalaccounts = journalaccounts;
	}

	// Property accessors

	public Integer getFinanceTypeId() {
		return this.financeTypeId;
	}

	public void setFinanceTypeId(Integer financeTypeId) {
		this.financeTypeId = financeTypeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Set getJournalaccounts() {
		return this.journalaccounts;
	}

	public void setJournalaccounts(Set journalaccounts) {
		this.journalaccounts = journalaccounts;
	}

}