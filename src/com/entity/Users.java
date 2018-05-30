package com.entity;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Emp emp;
	private Rolestable rolestable;
	private String userName;
	private String userPsd;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(Emp emp, Rolestable rolestable, String userName, String userPsd) {
		this.emp = emp;
		this.rolestable = rolestable;
		this.userName = userName;
		this.userPsd = userPsd;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Emp getEmp() {
		return this.emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Rolestable getRolestable() {
		return this.rolestable;
	}

	public void setRolestable(Rolestable rolestable) {
		this.rolestable = rolestable;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPsd() {
		return this.userPsd;
	}

	public void setUserPsd(String userPsd) {
		this.userPsd = userPsd;
	}

}