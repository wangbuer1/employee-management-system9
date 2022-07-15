package dao;

import java.util.ArrayList;

import entity.yg;

public interface ygDao {
	//DML”√ªß
	public int executeUpdate(String operate, yg user);
	public ArrayList<yg>  checkSignon(String username, String password);
}
