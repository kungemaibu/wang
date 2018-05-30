package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer empId;
	private Position position;
	private Account account;
	private Dept dept;
	private String empName;
	private String empSex;
	private String empPhone;
	private String empEmil;
	private String empCard;
	private String empAdress;
	private String empBei;
	private Set waybills = new HashSet(0);
	private Set circuits = new HashSet(0);
	private Set branchs = new HashSet(0);
	private Set warehouses = new HashSet(0);
	private Set orders = new HashSet(0);
	private Set userses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(Position position, Account account, Dept dept, String empName, String empSex, String empPhone,
			String empEmil, String empCard, String empAdress, String empBei, Set waybills, Set circuits, Set branchs,
			Set warehouses, Set orders, Set userses) {
		this.position = position;
		this.account = account;
		this.dept = dept;
		this.empName = empName;
		this.empSex = empSex;
		this.empPhone = empPhone;
		this.empEmil = empEmil;
		this.empCard = empCard;
		this.empAdress = empAdress;
		this.empBei = empBei;
		this.waybills = waybills;
		this.circuits = circuits;
		this.branchs = branchs;
		this.warehouses = warehouses;
		this.orders = orders;
		this.userses = userses;
	}

	// Property accessors

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSex() {
		return this.empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public String getEmpPhone() {
		return this.empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpEmil() {
		return this.empEmil;
	}

	public void setEmpEmil(String empEmil) {
		this.empEmil = empEmil;
	}

	public String getEmpCard() {
		return this.empCard;
	}

	public void setEmpCard(String empCard) {
		this.empCard = empCard;
	}

	public String getEmpAdress() {
		return this.empAdress;
	}

	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}

	public String getEmpBei() {
		return this.empBei;
	}

	public void setEmpBei(String empBei) {
		this.empBei = empBei;
	}

	public Set getWaybills() {
		return this.waybills;
	}

	public void setWaybills(Set waybills) {
		this.waybills = waybills;
	}

	public Set getCircuits() {
		return this.circuits;
	}

	public void setCircuits(Set circuits) {
		this.circuits = circuits;
	}

	public Set getBranchs() {
		return this.branchs;
	}

	public void setBranchs(Set branchs) {
		this.branchs = branchs;
	}

	public Set getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(Set warehouses) {
		this.warehouses = warehouses;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

}