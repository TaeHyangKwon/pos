package pos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/*
public class OrderedMenuListener implements ActionListener,Runnable {
	
	int MenuNum;
	
	OrderedMenuListener(int _MenuNum)
	{
		MenuNum = _MenuNum;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		OrderedMenu current_menu = new OrderedMenu();
		current_menu.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a[] = new int[MenuNum];
		for(int i=0;i<MenuNum;i++)
		{
			a[i] = Pos.t1.Numfood.elementAt(i) + Pos.t2.Numfood.elementAt(i) + Pos.t3.Numfood.elementAt(i) + 
					Pos.t4.Numfood.elementAt(i) + Pos.t5.Numfood.elementAt(i) + Pos.t6.Numfood.elementAt(i) + 
					Pos.t7.Numfood.elementAt(i) + Pos.t8.Numfood.elementAt(i) + Pos.t9.Numfood.elementAt(i);
			Pos.OrderedMenu.setElementAt(a[i], i);
		}
	}
}
*/