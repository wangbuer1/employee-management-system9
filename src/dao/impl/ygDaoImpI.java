package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.ygDao;

import entity.yg;

public class ygDaoImpI extends BaseDao implements ygDao{
	@Override
	public ArrayList<yg>  checkSignon(String username, String password) {
		String sql="select * from yg where name=? and pwd=?";
		Object param[]={username,password};
		ResultSet rs = this.getResultSet(sql, param);
		ArrayList<yg> slist = new ArrayList<yg>();
		try {
			while(rs.next()){
				yg signon = new yg(); 
				signon.setName(rs.getString(1));
				signon.setPwd(rs.getString(2));
				signon.setQx(rs.getInt(3));
				slist.add(signon);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return slist;
	}

	@Override
	public int executeUpdate(String operate, yg user) {
		String sql=null;	
		List<Object> list=new ArrayList<>();
		if(operate.equals("insert")){
			sql="insert into yg "
					+ "(id,name,pwd,mailbox,sal,qx,zw)"
					+ " values(?,?,?,?,?,?,?)";
			list.add(user.getId());
			list.add(user.getName());
			list.add(user.getPwd());
			list.add(user.getMialbox());
			list.add(user.getSal());
			list.add(user.getQx());
			list.add(user.getZw());
		}else if(operate.equals("update")){
			sql ="update yg set name=?, pwd=? ,mailbox=? , sal=? ,qx=? , zw=? where id=? ";
			list.add(user.getName());
			list.add(user.getPwd());
			list.add(user.getMialbox());
			list.add(user.getSal());
			list.add(user.getQx());
			list.add(user.getZw());
			list.add(user.getId());
		}else if(operate.equals("delete")){
			sql="delete from yg where id=?";
			list.add(user.getId());
		}
		
		return executeUpdata(sql, list);
	}

}
