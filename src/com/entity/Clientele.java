package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Clientele entity. @author MyEclipse Persistence Tools
 */

public class Clientele implements java.io.Serializable {

	// Fields

	private Integer clienteleId;
	private Payment payment;
	private String clienteleName;
	private String clientelePhone;
	private String clienteleUnit;
	private String clienteleAdress;
	private String verificationName;
	private String verificationPhone;
	private String clienteleMonthly;
	private String clienteleBank;
	private String clienteleBankCard;
	private String clienteleIdentity;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Clientele() {
	}

	/** minimal constructor */
	public Clientele(String clienteleUnit, String verificationName, String verificationPhone, String clienteleBank,
			String clienteleBankCard) {
		this.clienteleUnit = clienteleUnit;
		this.verificationName = verificationName;
		this.verificationPhone = verificationPhone;
		this.clienteleBank = clienteleBank;
		this.clienteleBankCard = clienteleBankCard;
	}

	/** full constructor */
	public Clientele(Payment payment, String clienteleName, String clientelePhone, String clienteleUnit,
			String clienteleAdress, String verificationName, String verificationPhone, String clienteleMonthly,
			String clienteleBank, String clienteleBankCard, String clienteleIdentity, Set orders) {
		this.payment = payment;
		this.clienteleName = clienteleName;
		this.clientelePhone = clientelePhone;
		this.clienteleUnit = clienteleUnit;
		this.clienteleAdress = clienteleAdress;
		this.verificationName = verificationName;
		this.verificationPhone = verificationPhone;
		this.clienteleMonthly = clienteleMonthly;
		this.clienteleBank = clienteleBank;
		this.clienteleBankCard = clienteleBankCard;
		this.clienteleIdentity = clienteleIdentity;
		this.orders = orders;
	}

	// Property accessors

	public Integer getClienteleId() {
		return this.clienteleId;
	}

	public void setClienteleId(Integer clienteleId) {
		this.clienteleId = clienteleId;
	}

	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public String getClienteleName() {
		return this.clienteleName;
	}

	public void setClienteleName(String clienteleName) {
		this.clienteleName = clienteleName;
	}

	public String getClientelePhone() {
		return this.clientelePhone;
	}

	public void setClientelePhone(String clientelePhone) {
		this.clientelePhone = clientelePhone;
	}

	public String getClienteleUnit() {
		return this.clienteleUnit;
	}

	public void setClienteleUnit(String clienteleUnit) {
		this.clienteleUnit = clienteleUnit;
	}

	public String getClienteleAdress() {
		return this.clienteleAdress;
	}

	public void setClienteleAdress(String clienteleAdress) {
		this.clienteleAdress = clienteleAdress;
	}

	public String getVerificationName() {
		return this.verificationName;
	}

	public void setVerificationName(String verificationName) {
		this.verificationName = verificationName;
	}

	public String getVerificationPhone() {
		return this.verificationPhone;
	}

	public void setVerificationPhone(String verificationPhone) {
		this.verificationPhone = verificationPhone;
	}

	public String getClienteleMonthly() {
		return this.clienteleMonthly;
	}

	public void setClienteleMonthly(String clienteleMonthly) {
		this.clienteleMonthly = clienteleMonthly;
	}

	public String getClienteleBank() {
		return this.clienteleBank;
	}

	public void setClienteleBank(String clienteleBank) {
		this.clienteleBank = clienteleBank;
	}

	public String getClienteleBankCard() {
		return this.clienteleBankCard;
	}

	public void setClienteleBankCard(String clienteleBankCard) {
		this.clienteleBankCard = clienteleBankCard;
	}

	public String getClienteleIdentity() {
		return this.clienteleIdentity;
	}

	public void setClienteleIdentity(String clienteleIdentity) {
		this.clienteleIdentity = clienteleIdentity;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}