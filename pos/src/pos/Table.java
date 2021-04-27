package pos;

import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class Table {
	public DefaultTableModel model;
	public JTable table;
	public Vector<String> OrderedMenu;
	
	Table()
	{
		OrderedMenu = new Vector<String>(Pos.MenuNum);
		model = new DefaultTableModel();
		model.addColumn("Menue");
	    model.addColumn("Number");
	    model.addColumn("Cost");
		
	    for(int i=0;i<Pos.MenuNum;i++) {
	    	model.addRow(new Object[] {Pos.Menu.elementAt(i),"0",Pos.Price.elementAt(i)});
	    }
	    
	    table = new JTable(model);
	}
}


/*
public class Table extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	String FoodList[] = new String[9];
	Vector<Integer> Numfood;
	int i=0;
	private JTextField textField;

	public Table() {
		
		  Numfood = new Vector<Integer>(0);
		  
	      for(int i=0;i<9;i++)
	      {
	    	  Numfood.add(0);
	      }
		
		  setBounds(100, 100, 693, 421);
	      contentPane = new JPanel();
	      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	      setContentPane(contentPane);
	      contentPane.setLayout(null);
	      
	      model.addColumn("Menu");
	      model.addColumn("Number");
	      model.addColumn("Cost");
	      
	      JPanel tablePanel = new JPanel();
	      tablePanel.setBounds(320, 58, 350, 230);
	      contentPane.add(tablePanel);
	      table = new JTable(model);
	      table.setBounds(100, 58, 466, 279);
	      table.setPreferredScrollableViewportSize(new Dimension(350, 220));
	      table.setFillsViewportHeight(true);
	      tablePanel.add(new JScrollPane(table));
	      
	      JButton btnNewButton = new JButton("¶ó¸é");
	      btnNewButton.setBounds(0, 58, 105, 90);
	      contentPane.add(btnNewButton);
	      btnNewButton.addActionListener(new SetTextField(model, table,"¶ó¸é",FoodList,Numfood));
	      
	      JButton btnNewButton_1 = new JButton("µ·±î½º");
	      btnNewButton_1.setBounds(104, 58, 105, 90);
	      contentPane.add(btnNewButton_1);
	      btnNewButton_1.addActionListener(new SetTextField(model, table,"µ·±î½º",FoodList,Numfood));
	      
	      JButton btnNewButton_2 = new JButton("°¨ÀÚ");
	      btnNewButton_2.setBounds(208, 58, 105, 90);
	      contentPane.add(btnNewButton_2);
	      btnNewButton_2.addActionListener(new SetTextField(model, table,"°¨ÀÚ",FoodList,Numfood));
	      
	      JButton btnNewButton_3 = new JButton("°í±¸¸¶");
	      btnNewButton_3.setBounds(0, 147, 105, 90);
	      contentPane.add(btnNewButton_3);
	      btnNewButton_3.addActionListener(new SetTextField(model, table,"°í±¸¸¶",FoodList,Numfood));
	      
	      JButton btnNewButton_4 = new JButton("¾îÁ¦¸ÔÀº°Å");
	      btnNewButton_4.setBounds(104, 147, 105, 90);
	      contentPane.add(btnNewButton_4);
	      btnNewButton_4.addActionListener(new SetTextField(model, table,"¾îÁ¦¸ÔÀº°Å",FoodList,Numfood));
	      
	      JButton btnNewButton_5 = new JButton("³»ÀÏ¸ÔÀ»°Å");
	      btnNewButton_5.setBounds(208, 147, 105, 90);
	      contentPane.add(btnNewButton_5);
	      btnNewButton_5.addActionListener(new SetTextField(model, table,"³»ÀÏ¸ÔÀ»°Å",FoodList,Numfood));
	      
	      JButton btnNewButton_6 = new JButton("ÇÑ¼Ü");
	      btnNewButton_6.setBounds(0, 236, 105, 90);
	      contentPane.add(btnNewButton_6);
	      btnNewButton_6.addActionListener(new SetTextField(model, table,"ÇÑ¼Ü",FoodList,Numfood));
	      
	      JButton btnNewButton_7 = new JButton("¶±ººÀÌ");
	      btnNewButton_7.setBounds(104, 236, 105, 90);
	      contentPane.add(btnNewButton_7);
	      btnNewButton_7.addActionListener(new SetTextField(model, table,"¶±ººÀÌ",FoodList,Numfood));
	      
	      JButton btnNewButton_8 = new JButton("¼ø´ë");
	      btnNewButton_8.setBounds(208, 236, 105, 90);
	      contentPane.add(btnNewButton_8);
	      btnNewButton_8.addActionListener(new SetTextField(model, table,"¼ø´ë",FoodList,Numfood));
	      
	      JButton btnNewButton_9 = new JButton("+");
	      btnNewButton_9.setBounds(320, 322, 62, 40);
	      contentPane.add(btnNewButton_9);
	      btnNewButton_9.addActionListener(new SetTable(model, table,"",FoodList,Numfood, 1));
	      
	      JButton btnNewButton_10 = new JButton("-");
	      btnNewButton_10.setBounds(385, 322, 62, 40);
	      contentPane.add(btnNewButton_10);
	      btnNewButton_10.addActionListener(new SetTable(model, table,"",FoodList,Numfood, 2));
	      
	      JButton btnNewButton_11 = new JButton("»èÁ¦");
	      btnNewButton_11.setBounds(454, 322, 105, 40);
	      contentPane.add(btnNewButton_11);
	      btnNewButton_11.addActionListener(new SetTable(model, table,"",FoodList,Numfood, 3));
	      
	      JLabel lblNewLabel = new JLabel("Order List");
	      lblNewLabel.setBounds(454, 28, 73, 18);
	      contentPane.add(lblNewLabel);
	      
	      JLabel lblTable = new JLabel("Menu");
	      lblTable.setBounds(139, 30, 62, 18);
	      contentPane.add(lblTable);
	      
	      JButton btnNewButton_12 = new JButton("ÁÖ¹®");
	      btnNewButton_12.setBounds(565, 322, 105, 40);
	      contentPane.add(btnNewButton_12);
	      /*
	      OrderedMenuListener temp = new OrderedMenuListener(MenuNum);
	      
		  btnNewButton_12.addActionListener(temp);
	      
	      
	      
	      JLabel lblNewLabel_1 = new JLabel("Total");
	      lblNewLabel_1.setBounds(488, 295, 62, 18);
	      contentPane.add(lblNewLabel_1);
	      
	      textField = new JTextField();
	      textField.setBounds(533, 292, 137, 24);
	      contentPane.add(textField);
	      textField.setColumns(10);
	}
}
*/