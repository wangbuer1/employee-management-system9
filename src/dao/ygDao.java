package dao;

import java.util.ArrayList;

import entity.yg;

public interface ygDao {
	//DML�û�
	public int executeUpdate(String operate, yg user);
	public ArrayList<yg>  checkSignon(String username, String password);
}
