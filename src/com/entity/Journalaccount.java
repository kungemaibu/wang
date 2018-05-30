package com.entity;

import java.util.Date;

/**
 * Journalaccount entity. @author MyEclipse Persistence Tools
 */

public class Journalaccount implements java.io.Serializable {

	// Fields

	private Integer id;
	private Financetype financetype;
	private Date accountTime;
	private String incident;
	private Double money;

	// Constructors

	/** default constructor */
	public Journalaccount() {
	}

	/** full constructor */
	public Journalaccount(Financetype financetype, Date accountTime, String incident, Double money) {
		this.financetype = financetype;
		this.accountTime = accountTime;
		this.incident = incident;
		this.money = money;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Financetype getFinancetype() {
		return this.financetype;
	}

	public void setFinancetype(Financetype financetype) {
		this.financetype = financetype;
	}

	public Date getAccountTime() {
		return this.accountTime;
	}

	public void setAccountTime(Date accountTime) {
		this.accountTime = accountTime;
	}

	public String getIncident() {
		return this.incident;
	}

	public void setIncident(String incident) {
		this.incident = incident;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

}