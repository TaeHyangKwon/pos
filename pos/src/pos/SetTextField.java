package pos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SetTextField implements ActionListener {
	private DefaultTableModel mymodel;
	private JTable mytable;
	private String str;
	private String[] list;
	private String[][] mylist = new String[9][3];
	Vector<Integer> num;
 	int y;
	
	SetTextField(DefaultTableModel model,JTable mt, String st, String[] foodlist,Vector<Integer> i)
	{
		mymodel = model;
		mytable = mt;
		str=st;
		list = foodlist;
		num =i;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(str.equals("¶ó¸é") && num.elementAt(0) != 0)
		{
			y = mytable.getSelectedRow();
			if(mytable.getValueAt(y, 0).equals("¶ó¸é"))
			{
				mymodel.removeRow(y);
				mylist[0][0] = str;
				num.setElementAt(num.elementAt(0)+1, 0);
				mylist[0][1] = String.valueOf(num.elementAt(0));
				mylist[0][2] = String.valueOf(num.elementAt(0)*2000);
				mymodel.addRow(mylist[0]);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)+1, 0);
			}
		}
		else if(str.equals("¶ó¸é") && num.elementAt(0) == 0)
		{
			mymodel.addRow(new Object[] {str,"1","2000" });
			num.setElementAt(num.elementAt(0)+1, 0);
			Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)+1, 0);
		}
		
		if(str.equals("¶±ººÀÌ") && num.elementAt(1) != 0)
		{
			y = mytable.getSelectedRow();
			if(mytable.getValueAt(y, 0).equals("¶±ººÀÌ"))
			{
				mymodel.removeRow(y);
				mylist[1][0] = str;
				num.setElementAt(num.elementAt(1)+1, 1);
				mylist[1][1] = String.valueOf(num.elementAt(1));
				mylist[1][2] = String.valueOf(num.elementAt(1)*3000);
				mymodel.addRow(mylist[1]);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(1)+1, 1);
			}
		}
		else if(str.equals("¶±ººÀÌ") && num.elementAt(1) == 0)
		{
			mymodel.addRow(new Object[] {str,"1","3000" });
			num.setElementAt(num.elementAt(1)+1, 1);
			Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(1)+1, 1);
		}
		
		if(str.equals("Ä¡Áî¶±ººÀÌ") && num.elementAt(2) != 0)
		{
			y = mytable.getSelectedRow();
			if(mytable.getValueAt(y, 0).equals("Ä¡Áî¶±ººÀÌ"))
			{
				mymodel.removeRow(y);
				mylist[2][0] = str;
				num.setElementAt(num.elementAt(2)+1, 2);
				mylist[2][1] = String.valueOf(num.elementAt(2));
				mylist[2][2] = String.valueOf(num.elementAt(2)*3500);
				mymodel.addRow(mylist[2]);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(2)+1, 2);
			}
		}
		else if(str.equals("Ä¡Áî¶±ººÀÌ") && num.elementAt(2) == 0)
		{
			mymodel.addRow(new Object[] {str,"1","3500" });
			num.setElementAt(num.elementAt(2)+1, 2);
			Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(2)+1, 2);
		}
		
		if(str.equals("¼ø´ë") && num.elementAt(3) != 0)
		{
			y = mytable.getSelectedRow();
			if(mytable.getValueAt(y, 0).equals("¼ø´ë"))
			{
				mymodel.removeRow(y);
				mylist[3][0] = str;
				num.setElementAt(num.elementAt(3)+1, 3);
				mylist[3][1] = String.valueOf(num.elementAt(3));
				mylist[3][2] = String.valueOf(num.elementAt(3)*3000);
				mymodel.addRow(mylist[0]);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(3)+1, 3);
			}
		}
		else if(str.equals("¼ø´ë") && num.elementAt(3) == 0)
		{
			mymodel.addRow(new Object[] {str,"1","3000" });
			num.setElementAt(num.elementAt(3)+1, 3);
			Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(3)+1, 3);
		}
		
		if(str.equals("±è¹ä") && num.elementAt(4) != 0)
		{
			y = mytable.getSelectedRow();
			if(mytable.getValueAt(y, 0).equals("±è¹ä"))
			{
				mymodel.removeRow(y);
				mylist[4][0] = str;
				num.setElementAt(num.elementAt(4)+1, 4);
				mylist[4][1] = String.valueOf(num.elementAt(4));
				mylist[4][2] = String.valueOf(num.elementAt(4)*2500);
				mymodel.addRow(mylist[4]);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(4)+1, 4);
			}
		}
		else if(str.equals("±è¹ä") && num.elementAt(4) == 0)
		{
			mymodel.addRow(new Object[] {str,"1","2500" });
			num.setElementAt(num.elementAt(4)+1, 4);
			Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(4)+1, 4);
		}
		
		if(str.equals("¸¸µÎ") && num.elementAt(5) != 0)
		{
			y = mytable.getSelectedRow();
			if(mytable.getValueAt(y, 0).equals("¸¸µÎ"))
			{
				mymodel.removeRow(y);
				mylist[5][0] = str;
				num.setElementAt(num.elementAt(5)+1, 5);
				mylist[5][1] = String.valueOf(num.elementAt(5));
				mylist[5][2] = String.valueOf(num.elementAt(5)*3000);
				mymodel.addRow(mylist[5]);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(5)+1, 5);
			}
		}
		else if(str.equals("¸¸µÎ") && num.elementAt(5) == 0)
		{
			mymodel.addRow(new Object[] {str,"1","3000" });
			num.setElementAt(num.elementAt(5)+1, 5);
			Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(5)+1, 5);
		}
		
		if(str.equals("µ·±î½º") && num.elementAt(6) != 0)
		{
			y = mytable.getSelectedRow();
			if(mytable.getValueAt(y, 0).equals("µ·±î½º"))
			{
				mymodel.removeRow(y);
				mylist[6][0] = str;
				num.setElementAt(num.elementAt(6)+1, 6);
				mylist[6][1] = String.valueOf(num.elementAt(6));
				mylist[6][2] = String.valueOf(num.elementAt(6)*3000);
				mymodel.addRow(mylist[6]);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(6)+1, 6);
			}
		}
		else if(str.equals("µ·±î½º") && num.elementAt(6) == 0)
		{
			mymodel.addRow(new Object[] {str,"1","3000" });
			num.setElementAt(num.elementAt(6)+1, 6);
			Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(6)+1, 6);
		}
		
		if(str.equals("Ä¡Áîµ·±î½º") && num.elementAt(7) != 0)
		{
			y = mytable.getSelectedRow();
			if(mytable.getValueAt(y, 0).equals("Ä¡Áîµ·±î½º"))
			{
				mymodel.removeRow(y);
				mylist[7][0] = str;
				num.setElementAt(num.elementAt(7)+1, 7);
				mylist[7][1] = String.valueOf(num.elementAt(7));
				mylist[7][2] = String.valueOf(num.elementAt(7)*4000);
				mymodel.addRow(mylist[7]);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(7)+1, 7);
			}
		}
		else if(str.equals("Ä¡Áîµ·±î½º") && num.elementAt(7) == 0)
		{
			mymodel.addRow(new Object[] {str,"1","4000" });
			num.setElementAt(num.elementAt(7)+1, 7);
			Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(7)+1, 7);
		}
		
		if(str.equals("¿À¹Ç¶óÀÌ½º") && num.elementAt(8) != 0)
		{
			y = mytable.getSelectedRow();
			if(mytable.getValueAt(y, 0).equals("¿À¹Ç¶óÀÌ½º"))
			{
				mymodel.removeRow(y);
				mylist[8][0] = str;
				num.setElementAt(num.elementAt(8)+1, 8);
				mylist[8][1] = String.valueOf(num.elementAt(8));
				mylist[8][2] = String.valueOf(num.elementAt(8)*3500);
				mymodel.addRow(mylist[8]);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(8)+1, 8);
			}
		}
		else if(str.equals("¿À¹Ç¶óÀÌ½º") && num.elementAt(8) == 0)
		{
			mymodel.addRow(new Object[] {str,"1","3500" });
			num.setElementAt(num.elementAt(8)+1, 8);
			Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(8)+1, 8);
		}
	}
}