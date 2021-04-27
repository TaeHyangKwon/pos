package pos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Pos extends JFrame implements Runnable {
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	static JPanel tablePanel;
	
	public static Vector<Integer> OrderedMenu = new Vector<Integer>(0);
	
	public static Vector<String> Menu = new Vector<String>();
	String FoodList[] = new String[9];
	Vector<Integer> Numfood;
	public static Vector<Integer> Price = new Vector<Integer>();
	
	public static Table t1,t2,t3,t4,t5,t6,t7,t8,t9;
	
	static int MenuNum=0;
	static String now;
	private Thread thread;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pos frame = new Pos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pos() {
		
		t1 = new Table();
		t2 = new Table();
		t3 = new Table();
		t4 = new Table();
		t5 = new Table();
		t6 = new Table();
		t7 = new Table();
		t8 = new Table();
		t9 = new Table();
		
		MenuNum=9;
		
		for(int i=0;i<MenuNum;i++)
		{
		   OrderedMenu.add(0);
		}
		
		Menu.add("¶ó¸é");
		Menu.add("¶±ººÀÌ");
		Menu.add("Ä¡Áî¶±ººÀÌ");
		Menu.add("¼ø´ë");
		Menu.add("±è¹ä");
		Menu.add("¸¸µÎ");
		Menu.add("µ·±î½º");
		Menu.add("Ä¡Áîµ·±î½º");
		Menu.add("¿À¹Ç¶óÀÌ½º");
		
		Price.add(2000);
		Price.add(3000);
		Price.add(3500);
		Price.add(3000);
		Price.add(2500);
		Price.add(3000);
		Price.add(3500);
		Price.add(4000);
		Price.add(3500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tablePanel = new JPanel();
	    tablePanel.setBounds(372, 78, 312, 215);
	    contentPane.add(tablePanel);
		
		model.addColumn("Menu");
	    model.addColumn("Number");
	    model.addColumn("Cost");
	    
	    for(int i=0;i<9;i++) {
	    	model.addRow(new Object[] {Menu.elementAt(i),"0",Price.elementAt(i)});
	    }
		
		JPanel tablePanel = new JPanel();
	    tablePanel.setBounds(372, 78, 312, 215);
	    contentPane.add(tablePanel);
	    table = new JTable(model);
	    table.setBounds(100, 58, 466, 279);
	    table.setPreferredScrollableViewportSize(new Dimension(310, 200));
	    table.setFillsViewportHeight(true);
	    tablePanel.add(new JScrollPane(table));
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new TableListener(t1));
		btnNewButton.setBounds(24, 78, 105, 95);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new TableListener(t2));
		btnNewButton_1.setBounds(128, 78, 105, 95);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new TableListener(t3));
		btnNewButton_2.setBounds(232, 78, 105, 95);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new TableListener(t4));
		btnNewButton_3.setBounds(24, 172, 105, 95);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new TableListener(t5));
		btnNewButton_4.setBounds(128, 172, 105, 95);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new TableListener(t6));
		btnNewButton_5.setBounds(232, 172, 105, 95);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new TableListener(t7));
		btnNewButton_6.setBounds(24, 266, 105, 95);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new TableListener(t8));
		btnNewButton_7.setBounds(128, 266, 105, 95);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new TableListener(t9));
		btnNewButton_8.setBounds(232, 266, 105, 95);
		contentPane.add(btnNewButton_8);
		
		JLabel lblNewLabel = new JLabel("Order List");
		lblNewLabel.setBounds(500, 50, 73, 18);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblTable = new JLabel("Table");
		lblTable.setBounds(163, 50, 62, 18);
		contentPane.add(lblTable);
		
		JButton btnNewButton_9 = new JButton("Cash");
		btnNewButton_9.setBounds(427, 326, 73, 35);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Card");
		btnNewButton_10.setBounds(508, 326, 73, 35);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Order");
		btnNewButton_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Password p = new Password();
		    	p.setVisible(true);
			}});
		btnNewButton_11.setBounds(588, 305, 96, 56);
		contentPane.add(btnNewButton_11);
		
		
		
		JLabel label = new JLabel("°áÁ¦");
		label.setBounds(487, 304, 62, 18);
		contentPane.add(label);
		
		JButton button = new JButton("+");
		button.setBounds(372, 298, 43, 30);
		//button.addActionListener(new SetTable(model, table,"",FoodList,Numfood, 1));
		contentPane.add(button);
		
		
		JButton button_1 = new JButton("-");
		button_1.setBounds(372, 331, 43, 30);
		contentPane.add(button_1);
		//button_1.addActionListener(new SetTable(model, table,"",FoodList,Numfood, 2));
		
		JLabel label_1 = new JLabel("±Ý¿ÀºÐ½Ä");
		label_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label_1.setBounds(315, 10, 89, 34);
		contentPane.add(label_1);
		
		lblNewLabel_1 = new JLabel("time");
		
		if(thread==null) {
			thread=new Thread(this);
			thread.start();
		}
		lblNewLabel_1.setBounds(521, 0, 182, 23);
		
		setVisible(true);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("»óÅÂÃ¢");
		textField.setBounds(100, 373, 482, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Á÷¿øÀÌ¸§");
		lblNewLabel_2.setBounds(24, 376, 62, 18);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("±¼¸²", Font.BOLD, 21));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setText("ÃÑ¸ÅÃâ");
		textField_1.setBounds(0, 0, 116, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_12 = new JButton("Manager");
		btnNewButton_12.setBounds(588, 366, 96, 30);
		contentPane.add(btnNewButton_12);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			Calendar cal=Calendar.getInstance();
			now=cal.get(Calendar.YEAR)+"³â "+(cal.get(Calendar.MONTH)+1)+"¿ù "+cal.get(Calendar.DATE)+"ÀÏ "+cal.get(Calendar.HOUR)+"½Ã"+cal.get(Calendar.MINUTE)+"ºÐ"+cal.get(Calendar.SECOND)+"ÃÊ";
			lblNewLabel_1.setText(now);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

 /*
public class Pos extends JFrame {
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	
	public static Vector<Integer> OrderedMenu = new Vector<Integer>(0);
	public static Table t1,t2,t3,t4,t5,t6,t7,t8,t9;
	
	int MenuNum=0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pos frame = new Pos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pos() {
		
		t1 = new Table();
		t2 = new Table();
		t3 = new Table();
		t4 = new Table();
		t5 = new Table();
		t6 = new Table();
		t7 = new Table();
		t8 = new Table();
		t9 = new Table();
		
		MenuNum=9;
		
		for(int i=0;i<MenuNum;i++)
		{
		   OrderedMenu.add(0);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		model.addColumn("Menu");
	    model.addColumn("Number");
	    model.addColumn("Cost");
		
		JPanel tablePanel = new JPanel();
	    tablePanel.setBounds(320, 58, 250, 200);
	    contentPane.add(tablePanel);
	    table = new JTable(model);
	    table.setBounds(100, 58, 466, 279);
	    table.setPreferredScrollableViewportSize(new Dimension(250, 200));
	    table.setFillsViewportHeight(true);
	    tablePanel.add(new JScrollPane(table));
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new TableListener(t1));
		btnNewButton.setBounds(0, 58, 105, 90);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new TableListener(t2));
		btnNewButton_1.setBounds(104, 58, 105, 90);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new TableListener(t3));
		btnNewButton_2.setBounds(208, 58, 105, 90);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new TableListener(t4));
		btnNewButton_3.setBounds(0, 147, 105, 90);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new TableListener(t5));
		btnNewButton_4.setBounds(104, 147, 105, 90);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new TableListener(t6));
		btnNewButton_5.setBounds(208, 147, 105, 90);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new TableListener(t7));
		btnNewButton_6.setBounds(0, 236, 105, 90);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new TableListener(t8));
		btnNewButton_7.setBounds(104, 236, 105, 90);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new TableListener(t9));
		btnNewButton_8.setBounds(208, 236, 105, 90);
		contentPane.add(btnNewButton_8);
		
		JLabel lblNewLabel = new JLabel("Order List");
		lblNewLabel.setBounds(412, 30, 73, 18);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblTable = new JLabel("Table");
		lblTable.setBounds(139, 30, 62, 18);
		contentPane.add(lblTable);
		
		JButton btnNewButton_9 = new JButton("Cash");
		btnNewButton_9.setBounds(320, 291, 73, 35);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Card");
		btnNewButton_10.setBounds(396, 291, 73, 35);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Manager");
		btnNewButton_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Password p = new Password();
		    	p.setVisible(true);
			}});
		btnNewButton_11.setBounds(474, 270, 96, 56);
		contentPane.add(btnNewButton_11);
		
		
		JLabel label = new JLabel("°áÁ¦");
		label.setBounds(377, 270, 62, 18);
		contentPane.add(label);
	}
}
*/