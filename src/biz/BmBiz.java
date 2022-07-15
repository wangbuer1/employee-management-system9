package biz;

import java.util.ArrayList;

import entity.bm;
import entity.yg;

public interface BmBiz {
		public ArrayList<yg> show(String bmname);
		public ArrayList<yg> show2(String name);
		public int remove(int id);
		public void insert(bm bm);
		public void update(bm bm);
}
