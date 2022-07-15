package dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import entity.bm;
import entity.yg;

public interface bmDao {
	public ArrayList<yg> getResultSet(String bmname);
	public ArrayList<yg> getResultSet2(String name);
	public int executeUpdate( bm bm);
	public int remove(int id);
	public int update(bm bm);
}
