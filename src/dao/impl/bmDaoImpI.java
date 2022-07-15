package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.bmDao;
import entity.bm;
import entity.yg;


public class bmDaoImpI extends BaseDao implements bmDao{
@Override
public ArrayList<yg> getResultSet(String bmname){
	String sql="select * from bm,yg where bm.id=yg.id and bmname=?";
	Object param[]={bmname};
	ResultSet rs=this.getResultSet(sql, param);
	//遍历结果集，将记录存储在ArrayList
	ArrayList<yg> blist=new ArrayList<yg>();
	try {
		while(rs.next()){
			yg y= new yg();
			y.setId(rs.getInt("id"));
			y.setName(rs.getString("name"));
			y.setMialbox(rs.getString("mailbox"));
			y.setSal(rs.getString("sal"));
			y.setZw(rs.getString("zw"));
			blist.add(y);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return blist;

}

@Override
public int executeUpdate(bm bm) {
	String sql=null;	
	List<Object> list=new ArrayList<>();
	
		sql="insert into bm "
				+ "(bmname,id)"
				+ " values(?,?)";	
		list.add(bm.getBmname());
		list.add(bm.getId());	
	return executeUpdata(sql, list);
}

@Override
public int remove(int id) {
	String sql="delete from bm where id="+id;
	List<Object> list=new ArrayList<>();
	return executeUpdata(sql, list);
}

@Override
public int update(bm bm) {
	String sql="update bm set bmname=? where id=?";
	List<Object> list=new ArrayList<>();
	list.add(bm.getBmname());
	list.add(bm.getId());		
return executeUpdata(sql, list);
}

@Override
public ArrayList<yg> getResultSet2(String name) {
	String sql="select * from bm,yg where  name like ? and bm.id=yg.id";

	String bname="%"+name+"%";
	Object param[]={bname};
	ResultSet rs=this.getResultSet(sql, param);
	//遍历结果集，将记录存储在ArrayList
	ArrayList<yg> blist=new ArrayList<yg>();
	try {
		while(rs.next()){
			yg y= new yg();
			y.setId(rs.getInt("id"));
			y.setName(rs.getString("name"));
			y.setMialbox(rs.getString("mailbox"));
			y.setSal(rs.getString("sal"));
			y.setZw(rs.getString("zw"));
			y.setBmname(rs.getString("bmname"));
			blist.add(y);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return blist;

}
}
