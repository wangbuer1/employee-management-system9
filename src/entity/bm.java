package entity;

public class bm {
	private int bmid;//部门ID
	private String bmname = null;//部门名
	private String bmzw = null;//部门职务
	private int id;//ID
	private String name = null;//员工名
	private String sal=null;//薪水
	public int getBmid() {
		return bmid;
	}
	public void setBmid(int bmid) {
		this.bmid = bmid;
	}
	public String getBmname() {
		return bmname;
	}
	public void setBmname(String bmname) {
		this.bmname = bmname;
	}
	public String getBmzw() {
		return bmzw;
	}
	public void setBmzw(String bmzw) {
		this.bmzw = bmzw;
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
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
}
