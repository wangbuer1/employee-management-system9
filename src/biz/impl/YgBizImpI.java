package biz.impl;
import entity.bm;
import entity.yg;
import biz.YgBiz;
import dao.bmDao;
import dao.ygDao;
import dao.impl.bmDaoImpI;
import dao.impl.ygDaoImpI;
import entity.yg;

public class YgBizImpI implements YgBiz{
ygDao yg=new ygDaoImpI();
bmDao bmd=new bmDaoImpI();
	@Override
	public int checkSignon(String username, String password) {
		yg.checkSignon(username, password);
		return 0;
	}
	@Override
	public int Update(String operate, yg user, bm bm) {
		// TODO Auto-generated method stub
		yg.executeUpdate(operate, user);
		bmd.executeUpdate(bm);
		return 0;
	}
	@Override
	public int Update(String operate, entity.yg user) {
		yg.executeUpdate(operate, user);
		return 0;
	}

}
