package pos_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class SetTable implements ActionListener ,Serializable {

	int choice=0;
	static int y=0;
	static int total;
	
	SetTable(int tempChoice)
	{
		
		choice = tempChoice;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(choice == 1)
		{
			switch(GUITest.cur)
			{
			case 1:
				if(MainData.curFood.elementAt(y).CanFoodMaked())
				{
					y = GUITest.t1.table.getSelectedRow();
					Object number = GUITest.t1.table.getValueAt(y, 1);
					Object food  = GUITest.t1.table.getValueAt(y, 0);
					int mynum =  Integer.parseInt(number.toString());
					String str = food.toString();
					
					GUITest.t1.model.setValueAt(String.valueOf(++mynum), y, 1);
					GUITest.t1.model.setValueAt(String.valueOf(mynum*MainData.Price.elementAt(y)), y, 2);
					
					total+=MainData.Price.elementAt(y);
					GUITest.textField_1.setText("총매출 "+String.valueOf(total));
					MainData.curFood.elementAt(y).FoodMaked();
					MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)+1, y);
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "재고부족!!!!", "재고부족", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			case 2:
				if(MainData.curFood.elementAt(y).CanFoodMaked())
				{
					y = GUITest.t2.table.getSelectedRow();
					Object number2 = GUITest.t2.table.getValueAt(y, 1);
					Object food2  = GUITest.t2.table.getValueAt(y, 0);
					int mynum2 =  Integer.parseInt(number2.toString());
					String str2 = food2.toString();
					
					GUITest.t2.model.setValueAt(String.valueOf(++mynum2), y, 1);
					GUITest.t2.model.setValueAt(String.valueOf(mynum2*MainData.Price.elementAt(y)), y, 2);
					
					total+=MainData.Price.elementAt(y);
					GUITest.textField_1.setText("총매출 "+String.valueOf(total));
					MainData.curFood.elementAt(y).FoodMaked();
					MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)+1, y);
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "재고부족!!!!", "재고부족", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			case 3:
				if(MainData.curFood.elementAt(y).CanFoodMaked())
				{
					y = GUITest.t3.table.getSelectedRow();
					Object number3 = GUITest.t3.table.getValueAt(y, 1);
					Object food3  = GUITest.t3.table.getValueAt(y, 0);
					int mynum3 =  Integer.parseInt(number3.toString());
					String str3 = food3.toString();
					
					GUITest.t3.model.setValueAt(String.valueOf(++mynum3), y, 1);
					GUITest.t3.model.setValueAt(String.valueOf(mynum3*MainData.Price.elementAt(y)), y, 2);
					
					total+=MainData.Price.elementAt(y);
					GUITest.textField_1.setText("총매출 "+String.valueOf(total));
					//GUITest.textField_1.setText(String.valueOf(total));
					MainData.curFood.elementAt(y).FoodMaked();
					MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)+1, y);
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "재고부족!!!!", "재고부족", JOptionPane.INFORMATION_MESSAGE);
				}
			case 4:
				if(MainData.curFood.elementAt(y).CanFoodMaked())
				{
					y = GUITest.t4.table.getSelectedRow();
					Object number4 = GUITest.t4.table.getValueAt(y, 1);
					Object food4  = GUITest.t4.table.getValueAt(y, 0);
					int mynum4 =  Integer.parseInt(number4.toString());
					String str4 = food4.toString();
					
					GUITest.t4.model.setValueAt(String.valueOf(++mynum4), y, 1);
					GUITest.t4.model.setValueAt(String.valueOf(mynum4*MainData.Price.elementAt(y)), y, 2);
					
					total+=MainData.Price.elementAt(y);
					GUITest.textField_1.setText("총매출 "+String.valueOf(total));
					//GUITest.textField_1.setText(String.valueOf(total));
					MainData.curFood.elementAt(y).FoodMaked();
					MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)+1, y);
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "재고부족!!!!", "재고부족", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			case 5:
				if(MainData.curFood.elementAt(y).CanFoodMaked())
				{
					y = GUITest.t5.table.getSelectedRow();
					Object number5 = GUITest.t5.table.getValueAt(y, 1);
					Object food5  = GUITest.t5.table.getValueAt(y, 0);
					int mynum5 =  Integer.parseInt(number5.toString());
					String str5 = food5.toString();
					
					GUITest.t5.model.setValueAt(String.valueOf(++mynum5), y, 1);
					GUITest.t5.model.setValueAt(String.valueOf(mynum5*MainData.Price.elementAt(y)), y, 2);
					
					total+=MainData.Price.elementAt(y);
					GUITest.textField_1.setText("총매출 "+String.valueOf(total));
					//GUITest.textField_1.setText(String.valueOf(total));
					MainData.curFood.elementAt(y).FoodMaked();
					MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)+1, y);
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "재고부족!!!!", "재고부족", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			case 6:
				if(MainData.curFood.elementAt(y).CanFoodMaked())
				{
					y = GUITest.t6.table.getSelectedRow();
					Object number6 = GUITest.t6.table.getValueAt(y, 1);
					Object food6  = GUITest.t6.table.getValueAt(y, 0);
					int mynum6 =  Integer.parseInt(number6.toString());
					String str6 = food6.toString();
					
					GUITest.t6.model.setValueAt(String.valueOf(++mynum6), y, 1);
					GUITest.t6.model.setValueAt(String.valueOf(mynum6*MainData.Price.elementAt(y)), y, 2);
					
					total+=MainData.Price.elementAt(y);
					GUITest.textField_1.setText("총매출 "+String.valueOf(total));
					//GUITest.textField_1.setText(String.valueOf(total));
					MainData.curFood.elementAt(y).FoodMaked();
					MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)+1, y);
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "재고부족!!!!", "재고부족", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			case 7:
				if(MainData.curFood.elementAt(y).CanFoodMaked())
				{
					y = GUITest.t7.table.getSelectedRow();
					Object number7 = GUITest.t7.table.getValueAt(y, 1);
					Object food7  = GUITest.t7.table.getValueAt(y, 0);
					int mynum7 =  Integer.parseInt(number7.toString());
					String str7 = food7.toString();
					
					GUITest.t7.model.setValueAt(String.valueOf(++mynum7), y, 1);
					GUITest.t7.model.setValueAt(String.valueOf(mynum7*MainData.Price.elementAt(y)), y, 2);
					
					total+=MainData.Price.elementAt(y);
					GUITest.textField_1.setText("총매출 "+String.valueOf(total));
					//GUITest.textField_1.setText(String.valueOf(total));
					MainData.curFood.elementAt(y).FoodMaked();
					MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)+1, y);
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "재고부족!!!!", "재고부족", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			case 8:
				if(MainData.curFood.elementAt(y).CanFoodMaked())
				{
					y = GUITest.t8.table.getSelectedRow();
					Object number8 = GUITest.t8.table.getValueAt(y, 1);
					Object food8  = GUITest.t8.table.getValueAt(y, 0);
					int mynum8 =  Integer.parseInt(number8.toString());
					String str8 = food8.toString();
					
					GUITest.t8.model.setValueAt(String.valueOf(++mynum8), y, 1);
					GUITest.t8.model.setValueAt(String.valueOf(mynum8*MainData.Price.elementAt(y)), y, 2);
					
					total+=MainData.Price.elementAt(y);
					GUITest.textField_1.setText("총매출 "+String.valueOf(total));
					//GUITest.textField_1.setText(String.valueOf(total));
					MainData.curFood.elementAt(y).FoodMaked();
					MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)+1, y);
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "재고부족!!!!", "재고부족", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			case 9:
				if(MainData.curFood.elementAt(y).CanFoodMaked())
				{
					y = GUITest.t9.table.getSelectedRow();
					Object number9 = GUITest.t9.table.getValueAt(y, 1);
					Object food9  = GUITest.t9.table.getValueAt(y, 0);
					int mynum9 =  Integer.parseInt(number9.toString());
					String str9 = food9.toString();
					
					GUITest.t9.model.setValueAt(String.valueOf(++mynum9), y, 1);
					GUITest.t9.model.setValueAt(String.valueOf(mynum9*MainData.Price.elementAt(y)), y, 2);
					
					total+=MainData.Price.elementAt(y);
					GUITest.textField_1.setText("총매출 "+String.valueOf(total));
					//GUITest.textField_1.setText(String.valueOf(total));
					MainData.curFood.elementAt(y).FoodMaked();
					MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)+1, y);
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "재고부족!!!!", "재고부족", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			}
		}
		else if(choice == 2)
		{
			switch(GUITest.cur)
			{
			case 1:
				y = GUITest.t1.table.getSelectedRow();
				Object number = GUITest.t1.table.getValueAt(y, 1);
				Object food  = GUITest.t1.table.getValueAt(y, 0);
				int mynum =  Integer.parseInt(number.toString());
				String str = food.toString();
				
				GUITest.t1.model.setValueAt(String.valueOf(--mynum), y, 1);
				GUITest.t1.model.setValueAt(String.valueOf(mynum*MainData.Price.elementAt(y)), y, 2);
				
				total-=MainData.Price.elementAt(y);
				GUITest.textField_1.setText("총매출 "+String.valueOf(total));
				MainData.curFood.elementAt(y).FoodCanceled();
				MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)-1, y);
				break;
			case 2:
				y = GUITest.t2.table.getSelectedRow();
				Object number2 = GUITest.t2.table.getValueAt(y, 1);
				Object food2  = GUITest.t2.table.getValueAt(y, 0);
				int mynum2 =  Integer.parseInt(number2.toString());
				String str2 = food2.toString();
				
				GUITest.t2.model.setValueAt(String.valueOf(--mynum2), y, 1);
				GUITest.t2.model.setValueAt(String.valueOf(mynum2*MainData.Price.elementAt(y)), y, 2);
				
				total-=MainData.Price.elementAt(y);
				GUITest.textField_1.setText("총매출 "+String.valueOf(total));
				//GUITest.textField_1.setText(String.valueOf(total));
				MainData.curFood.elementAt(y).FoodCanceled();
				MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)-1, y);
				break;
			case 3:
				y = GUITest.t3.table.getSelectedRow();
				Object number3 = GUITest.t3.table.getValueAt(y, 1);
				Object food3  = GUITest.t3.table.getValueAt(y, 0);
				int mynum3 =  Integer.parseInt(number3.toString());
				String str3 = food3.toString();
				
				GUITest.t3.model.setValueAt(String.valueOf(--mynum3), y, 1);
				GUITest.t3.model.setValueAt(String.valueOf(mynum3*MainData.Price.elementAt(y)), y, 2);
				
				total-=MainData.Price.elementAt(y);
				GUITest.textField_1.setText("총매출 "+String.valueOf(total));
				//GUITest.textField_1.setText(String.valueOf(total));
				MainData.curFood.elementAt(y).FoodCanceled();
				MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)-1, y);
				break;
			case 4:
				y = GUITest.t4.table.getSelectedRow();
				Object number4 = GUITest.t4.table.getValueAt(y, 1);
				Object food4  = GUITest.t4.table.getValueAt(y, 0);
				int mynum4 =  Integer.parseInt(number4.toString());
				String str4 = food4.toString();
				
				GUITest.t4.model.setValueAt(String.valueOf(--mynum4), y, 1);
				GUITest.t4.model.setValueAt(String.valueOf(mynum4*MainData.Price.elementAt(y)), y, 2);
				
				total-=MainData.Price.elementAt(y);
				GUITest.textField_1.setText("총매출 "+String.valueOf(total));
				//GUITest.textField_1.setText(String.valueOf(total));
				MainData.curFood.elementAt(y).FoodCanceled();
				MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)-1, y);
				break;
			case 5:
				y = GUITest.t5.table.getSelectedRow();
				Object number5 = GUITest.t5.table.getValueAt(y, 1);
				Object food5  = GUITest.t5.table.getValueAt(y, 0);
				int mynum5 =  Integer.parseInt(number5.toString());
				String str5 = food5.toString();
				
				GUITest.t5.model.setValueAt(String.valueOf(--mynum5), y, 1);
				GUITest.t5.model.setValueAt(String.valueOf(mynum5*MainData.Price.elementAt(y)), y, 2);
				
				total-=MainData.Price.elementAt(y);
				GUITest.textField_1.setText("총매출 "+String.valueOf(total));
				//GUITest.textField_1.setText(String.valueOf(total));
				MainData.curFood.elementAt(y).FoodCanceled();
				MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)-1, y);
				break;
			case 6:
				y = GUITest.t6.table.getSelectedRow();
				Object number6 = GUITest.t6.table.getValueAt(y, 1);
				Object food6  = GUITest.t6.table.getValueAt(y, 0);
				int mynum6 =  Integer.parseInt(number6.toString());
				String str6 = food6.toString();
				
				GUITest.t6.model.setValueAt(String.valueOf(--mynum6), y, 1);
				GUITest.t6.model.setValueAt(String.valueOf(mynum6*MainData.Price.elementAt(y)), y, 2);
				
				total-=MainData.Price.elementAt(y);
				GUITest.textField_1.setText("총매출 "+String.valueOf(total));
				//GUITest.textField_1.setText(String.valueOf(total));
				MainData.curFood.elementAt(y).FoodCanceled();
				MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)-1, y);
				break;
			case 7:
				y = GUITest.t7.table.getSelectedRow();
				Object number7 = GUITest.t7.table.getValueAt(y, 1);
				Object food7  = GUITest.t7.table.getValueAt(y, 0);
				int mynum7 =  Integer.parseInt(number7.toString());
				String str7 = food7.toString();
				
				GUITest.t7.model.setValueAt(String.valueOf(--mynum7), y, 1);
				GUITest.t7.model.setValueAt(String.valueOf(mynum7*MainData.Price.elementAt(y)), y, 2);
				
				total-=MainData.Price.elementAt(y);
				GUITest.textField_1.setText("총매출 "+String.valueOf(total));
				//GUITest.textField_1.setText(String.valueOf(total));
				MainData.curFood.elementAt(y).FoodCanceled();
				MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)-1, y);
				break;
			case 8:
				y = GUITest.t8.table.getSelectedRow();
				Object number8 = GUITest.t8.table.getValueAt(y, 1);
				Object food8  = GUITest.t8.table.getValueAt(y, 0);
				int mynum8 =  Integer.parseInt(number8.toString());
				String str8 = food8.toString();
				
				GUITest.t8.model.setValueAt(String.valueOf(--mynum8), y, 1);
				GUITest.t8.model.setValueAt(String.valueOf(mynum8*MainData.Price.elementAt(y)), y, 2);
				
				total-=MainData.Price.elementAt(y);
				GUITest.textField_1.setText("총매출 "+String.valueOf(total));
				//GUITest.textField_1.setText(String.valueOf(total));
				MainData.curFood.elementAt(y).FoodCanceled();
				MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)-1, y);
				break;
			case 9:
				y = GUITest.t9.table.getSelectedRow();
				Object number9 = GUITest.t9.table.getValueAt(y, 1);
				Object food9  = GUITest.t9.table.getValueAt(y, 0);
				int mynum9 =  Integer.parseInt(number9.toString());
				String str9 = food9.toString();
				
				GUITest.t9.model.setValueAt(String.valueOf(--mynum9), y, 1);
				GUITest.t9.model.setValueAt(String.valueOf(mynum9*MainData.Price.elementAt(y)), y, 2);
				
				total-=MainData.Price.elementAt(y);
				GUITest.textField_1.setText("총매출 "+String.valueOf(total));
				//GUITest.textField_1.setText(String.valueOf(total));
				MainData.curFood.elementAt(y).FoodCanceled();
				MainData.TotalOrderedMenu.setElementAt(MainData.TotalOrderedMenu.elementAt(y)-1, y);
				break;
			}
		}
	}
}
