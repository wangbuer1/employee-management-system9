package biz.impl;

import java.util.ArrayList;

import biz.BmBiz;
import dao.bmDao;
import dao.impl.bmDaoImpI;
import entity.bm;
import entity.yg;

public class BmBizImpI implements BmBiz {
	bmDao bmd=new bmDaoImpI();
	@Override
	public ArrayList<yg> show(String bmname) {
		ArrayList<yg> rs=bmd.getResultSet(bmname);
		return rs;
	}
	@Override
	public int remove(int id) {
		bmd.remove(id);
		return 0;
	}
	@Override
	public void insert(bm bm) {		
		bmd.executeUpdate(bm);
	}
	@Override
	public void update(bm bm) {
		bmd.update(bm);
		
	}
	@Override
	public ArrayList<yg> show2(String name) {
		ArrayList<yg> rs=bmd.getResultSet2(name);
		return rs;
	}

}
