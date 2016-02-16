package com.budgetms.pojo;

public class User extends BasePOJO{
	private int userId;
	private String name;
	private String account;
	private String pwd;
	private int deptid;
	private String tel;
	private String email;
	private String remark;

	public User() {
	}

	public User(String name, String account, String pwd, int deptid,
			String tel, String email, String remark) {
		// this.userId=userId;
		this.name = name;
		this.account = account;
		this.pwd = pwd;
		this.deptid = deptid;
		this.tel = tel;
		this.email = email;
		this.remark = remark;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
