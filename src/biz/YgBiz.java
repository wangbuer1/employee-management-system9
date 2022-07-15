package biz;

import entity.bm;
import entity.yg;

public interface YgBiz {
	public int Update(String operate, yg user);
	public int checkSignon(String username,String password);
	public int Update(String operate, yg user,bm bm);
}
