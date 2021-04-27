package pos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SetTable implements ActionListener  {

	private DefaultTableModel mymodel;
	private JTable mytable;
	private String str;
	private String[] list;
	private String[][] mylist = new String[9][3];
	Vector<Integer> num;
 	int choice;
 	int y;
 	int x;
	
	SetTable(DefaultTableModel model,JTable mt, String st, String[] foodlist,Vector<Integer> i, int m_choice)
	{
		mymodel = model;
		mytable = mt;
		str=st;
		list = foodlist;
		num =i;
		choice = m_choice;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		y = mytable.getSelectedRow();
		Object number = mytable.getValueAt(y, 1);
		Object food  = mytable.getValueAt(y, 0);
		int mynum =  Integer.parseInt( number.toString());
		str = food.toString();
		
		if(choice==1)
		{
			if(mynum != 0)
			{
				mymodel.setValueAt(String.valueOf(++mynum), y, 1);
				mymodel.setValueAt(String.valueOf(mynum*3000), y, 2);
			}
			if(str.equals("���"))
			{
				num.setElementAt(num.elementAt(0)+1, 0);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)+1, 0);
			}
			else if(str.equals("���"))
			{
				num.setElementAt(num.elementAt(1)+1, 1);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)+1, 0);
			}
			else if(str.equals("����"))
			{
				num.setElementAt(num.elementAt(2)+1, 2);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)+1, 0);
			}
			else if(str.equals("����"))
			{
				num.setElementAt(num.elementAt(3)+1, 3);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)+1, 0);
			}
			else if(str.equals("����������"))
			{
				num.setElementAt(num.elementAt(4)+1, 4);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)+1, 0);
			}
			else if(str.equals("���ϸ�����"))
			{
				num.setElementAt(num.elementAt(5)+1, 5);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)+1, 0);
			}
			else if(str.equals("�Ѽ�"))
			{
				num.setElementAt(num.elementAt(6)+1, 6);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)+1, 0);
			}
			else if(str.equals("������"))
			{
				num.setElementAt(num.elementAt(7)+1, 7);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)+1, 0);
			}
			else if(str.equals("����"))
			{
				num.setElementAt(num.elementAt(8)+1, 8);
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)+1, 0);
			}
		}
		
		if(choice==2)
		{
			if(mynum != 0)
			{
				mymodel.setValueAt(String.valueOf(--mynum), y, 1);
				mymodel.setValueAt(String.valueOf(mynum*3000), y, 2);
				if(str.equals("���"))
				{
					num.setElementAt(num.elementAt(0)-1, 0);
					Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)-1, 0);
				}
				else if(str.equals("���"))
				{
					num.setElementAt(num.elementAt(1)-1, 1);
					Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)-1, 0);
				}
				else if(str.equals("����"))
				{
					num.setElementAt(num.elementAt(2)-1, 2);
					Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)-1, 0);
				}
				else if(str.equals("����"))
				{
					num.setElementAt(num.elementAt(3)-1, 3);
					Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)-1, 0);
				}
				else if(str.equals("����������"))
				{
					num.setElementAt(num.elementAt(4)-1, 4);
					Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)-1, 0);
				}
				else if(str.equals("���ϸ�����"))
				{
					num.setElementAt(num.elementAt(5)-1, 5);
					Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)-1, 0);
				}
				else if(str.equals("�Ѽ�"))
				{
					num.setElementAt(num.elementAt(6)-1, 6);
					Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)-1, 0);
				}
				else if(str.equals("������"))
				{
					num.setElementAt(num.elementAt(7)-1, 7);
					Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)-1, 0);
				}
				else if(str.equals("����"))
				{
					num.setElementAt(num.elementAt(8)-1, 8);
					Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)-1, 0);
				}
			}
			else
			{
				mymodel.removeRow(y);
			}
		}
		
		if(choice == 3)
		{
			mymodel.removeRow(y);
			if(str.equals("���"))
			{
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(0)-num.elementAt(0), 0);
				num.setElementAt(0, 0);
			}
			else if(str.equals("���"))
			{
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(1)-num.elementAt(1), 1);
				num.setElementAt(0, 1);
			}
			else if(str.equals("����"))
			{
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(2)-num.elementAt(2), 2);
				num.setElementAt(0, 2);
			}
			else if(str.equals("����"))
			{
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(3)-num.elementAt(3), 3);
				num.setElementAt(0, 3);
			}
			else if(str.equals("����������"))
			{
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(4)-num.elementAt(4), 4);
				num.setElementAt(0, 4);
			}
			else if(str.equals("���ϸ�����"))
			{
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(5)-num.elementAt(5), 5);
				num.setElementAt(0, 5);
			}
			else if(str.equals("�Ѽ�"))
			{
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(6)-num.elementAt(6), 6);
				num.setElementAt(0, 6);
			}
			else if(str.equals("������"))
			{
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(7)-num.elementAt(7), 7);
				num.setElementAt(0, 7);
			}
			else if(str.equals("����"))
			{
				Pos.OrderedMenu.setElementAt(Pos.OrderedMenu.elementAt(8)-num.elementAt(8), 8);
				num.setElementAt(0, 8);
			}
		}
	}
}