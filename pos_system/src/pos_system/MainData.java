package pos_system;

import java.util.Vector;

public class MainData implements Cloneable {
	public static Vector<Integer> TotalOrderedMenu = new Vector<Integer>(0);
	public static Vector<String> Menu = new Vector<String>();
	public static Vector<Integer> Price = new Vector<Integer>();
	public static Vector<Integer> TotalPrice = new Vector<Integer>();
	public static Vector<Foods> curFood = new Vector<Foods>();
	public static int curIngNum=17;
	static Remains remains;
	static int MenuNum=9;
	static String now;
	static int y;
	static int cur=1;

	static void SetMainData(SaveData tp)
	{
		MainData.TotalOrderedMenu = tp.TotalOrderedMenu;
		MainData.Menu = tp.Menu;
		MainData.Price = tp.Price;
		MainData.curFood = tp.curFood;
		MainData.curIngNum=tp.curIngNum;
		MainData.remains = tp.remains;
		MainData.MenuNum=tp.MenuNum;
		MainData.now = tp.now;
		MainData.y = tp.y;
		MainData.cur=tp.cur;
		MainData.TotalPrice=tp.TotalPrice;
	}
}
