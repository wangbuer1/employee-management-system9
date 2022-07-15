package entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class yg {
	private int id;//ID
	private String name = null;//员工名
	private String pwd = null;//密码
	private String mialbox = null;//邮箱
	private String sal=null;//薪水
	private int qx=0;
	public int getQx() {
		return qx;
	}
	public void setQx(int qx) {
		this.qx = qx;
	}
	private String zw = null;//员工职务
	private String bmname = null;//部门名字
	public String getBmname() {
		return bmname;
	}
	public void setBmname(String bmname) {
		this.bmname = bmname;
	}
	public String getZw() {
		return zw;
	}
	public void setZw(String zw) {
		this.zw = zw;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMialbox() {
		return mialbox;
	}
	public void setMialbox(String mialbox) {
		this.mialbox = mialbox;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}



}
