package pos_system;

import java.io.Serializable;
import java.util.Vector;

public class SaveData implements Serializable {
	public Vector<Integer> TotalOrderedMenu;
	public Vector<String> Menu;
	static Vector<Integer> Numfood;
	public Vector<Integer> Price;
	public Vector<Foods> curFood;
	public Vector<Integer> TotalPrice;
	public int curIngNum;
	Remains remains;
	int MenuNum;
	String now;
	int y;
	int cur;

	SaveData()
	{
		TotalOrderedMenu = MainData.TotalOrderedMenu;
		Menu = MainData.Menu;
		Price = MainData.Price;
		curFood = MainData.curFood;
		curIngNum = MainData.curIngNum;
		remains = MainData.remains;
		MenuNum = MainData.MenuNum;
		now = MainData.now;
		y = MainData.y;
		cur = MainData.cur;
		TotalPrice=MainData.TotalPrice;
	}
}

