package pos_system;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUITest extends JFrame implements Runnable,Serializable,Cloneable {
	static JPanel contentPane;
	static JPanel tablePanel;
	private static Thread thread;
	private static JLabel  lblNewLabel_1;
	private JTextField textField;
	public static JTextField textField_1;
	static JLabel lblNewLabel_4;
	static public JScrollPane MainJP;
	public static Table t1,t2,t3,t4,t5,t6,t7,t8,t9;
	
	static GUITest frame;
	
	static int MenuNum=9;
	static String now;
	static int y;
	static int cur=1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 
					frame = new GUITest();
					frame.setVisible(true);
					if(thread==null) {
						thread=new Thread(frame);
						thread.start();
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
public GUITest() {
		for(int i=0;i<MenuNum;i++)
		{
			MainData.TotalOrderedMenu.add(0);
		}
		
		MainData.Menu.add("¶ó¸é");
		MainData.Menu.add("¶±ººÀÌ");
		MainData.Menu.add("Ä¡Áî¶±ººÀÌ");
		MainData.Menu.add("¼ø´ë");
		MainData.Menu.add("±è¹ä");
		MainData.Menu.add("¸¸µÎ");
		MainData.Menu.add("µ·±î½º");
		MainData.Menu.add("Ä¡Áîµ·±î½º");
		MainData.Menu.add("¿À¹Ç¶óÀÌ½º");
		
		MainData.Price.add(2000);
		MainData.Price.add(3000);
		MainData.Price.add(3500);
		MainData.Price.add(3000);
		MainData.Price.add(2500);
		MainData.Price.add(3000);
		MainData.Price.add(3500);
		MainData.Price.add(4000);
		MainData.Price.add(3500);
		
		MainData.curFood.add(new Foods(MainData.Menu.elementAt(0),1,new int[] {0}));
		MainData.curFood.add(new Foods(MainData.Menu.elementAt(1),3,new int[] {1,2,3}));
		MainData.curFood.add(new Foods(MainData.Menu.elementAt(2),4,new int[] {1,2,3,4}));
		MainData.curFood.add(new Foods(MainData.Menu.elementAt(3),1,new int[] {12}));
		MainData.curFood.add(new Foods(MainData.Menu.elementAt(4),6,new int[] {7,8,10,14,15,16}));
		MainData.curFood.add(new Foods(MainData.Menu.elementAt(5),1,new int[] {13}));
		MainData.curFood.add(new Foods(MainData.Menu.elementAt(6),1,new int[] {5}));
		MainData.curFood.add(new Foods(MainData.Menu.elementAt(7),1,new int[] {6}));
		MainData.curFood.add(new Foods(MainData.Menu.elementAt(8),1,new int[] {7,8,9,10,11}));
		
		t1 = new Table();
		t2 = new Table();
		t3 = new Table();
		t4 = new Table();
		t5 = new Table();
		t6 = new Table();
		t7 = new Table();
		t8 = new Table();
		t9 = new Table();
		
		Remains.Ingredient.add("¶ó¸é");
		Remains.Ingredient.add("¶±");
		Remains.Ingredient.add("°íÃßÀå");
		Remains.Ingredient.add("¼³ÅÁ");
		Remains.Ingredient.add("Ä¡Áî");
		Remains.Ingredient.add("³Ãµ¿ µ·±î½º");
		Remains.Ingredient.add("³Ãµ¿ Ä¡Áî µ·±î½º");
		Remains.Ingredient.add("¹ä");
		Remains.Ingredient.add("°è¶õ");
		Remains.Ingredient.add("ÄÉÂý");
		Remains.Ingredient.add("´ç±Ù");
		Remains.Ingredient.add("¾çÆÄ");
		Remains.Ingredient.add("³Ãµ¿ ¼ø´ë");
		Remains.Ingredient.add("³Ãµ¿ ¸¸µÎ");
		Remains.Ingredient.add("½Ã±ÝÄ¡");
		Remains.Ingredient.add("´Ü¹«Áö");
		Remains.Ingredient.add("±è");
		
		for(int i=0;i< MainData.curIngNum;i++)
		{
			Remains.IngRemains.add(200);
		}
		
		
		setBounds(100, 100, 721, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MainJP = t1.JP;
		
		tablePanel = new JPanel();
	    tablePanel.setBounds(372, 78, 312, 215);
	    tablePanel.add(MainJP);
	    contentPane.add(tablePanel);
	     
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TableListener(1);
				lblNewLabel_4.setText("Table1");
			}});
		btnNewButton.setBounds(24, 78, 105, 95);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TableListener(2);
				lblNewLabel_4.setText("Table2");
			}});
		btnNewButton_1.setBounds(128, 78, 105, 95);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				new TableListener(3); 
				lblNewLabel_4.setText("Table3");
			}});
		btnNewButton_2.setBounds(232, 78, 105, 95);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				new TableListener(4); 
				lblNewLabel_4.setText("Table4");
			}});
		btnNewButton_3.setBounds(24, 172, 105, 95);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				new TableListener(5);
				lblNewLabel_4.setText("Table5");
			}});
		btnNewButton_4.setBounds(128, 172, 105, 95);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				new TableListener(6); 
				lblNewLabel_4.setText("Table6");
			}});
		btnNewButton_5.setBounds(232, 172, 105, 95);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				new TableListener(7); 
				lblNewLabel_4.setText("Table7");
			}});
		btnNewButton_6.setBounds(24, 266, 105, 95);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				new TableListener(8); 
				lblNewLabel_4.setText("Table8");
			}});
		btnNewButton_7.setBounds(128, 266, 105, 95);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				new TableListener(9); 
				lblNewLabel_4.setText("Table9");
			}});
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
		btnNewButton_9.addActionListener(new CashListener());
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Card");
		btnNewButton_10.setBounds(508, 326, 73, 35);
		btnNewButton_10.addActionListener(new CardListener());
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Manager");
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
		button.addActionListener(new SetTable(1));
		contentPane.add(button);
		
		
		JButton button_1 = new JButton("-");
		button_1.setBounds(372, 331, 43, 30);
		contentPane.add(button_1);
		button_1.addActionListener(new SetTable(2));
		
		JLabel label_1 = new JLabel("±Ý¿ÀºÐ½Ä");
		label_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label_1.setBounds(315, 10, 89, 34);
		contentPane.add(label_1);
		
		lblNewLabel_1 = new JLabel("time");
		

		lblNewLabel_1.setBounds(515, 0, 185, 23);
		
		setVisible(true);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(101, 412, 583, 24);
		
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Á÷¿øÀÌ¸§");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(24, 414, 73, 18);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("±¼¸²", Font.BOLD, 21));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setText("ÃÑ¸ÅÃâ");
		textField_1.setBounds(0, 0, 143, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ÀüÈ­¹øÈ£    :     010-xxxx-xxxx");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(24, 371, 262, 31);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_12 = new JButton("ÀúÀå");
		btnNewButton_12.setBounds(477, 373, 96, 30);
		btnNewButton_12.addActionListener(new SaveDataListener());
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("ºÒ·¯¿À±â");
		btnNewButton_13.setBounds(588, 373, 96, 30);
		btnNewButton_13.addActionListener(new LoadDataListener());
		contentPane.add(btnNewButton_13);
		
		lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setBounds(372, 61, 62, 18);
		contentPane.add(lblNewLabel_4);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			Calendar cal=Calendar.getInstance();
			now=cal.get(Calendar.YEAR)+"³â "+(cal.get(Calendar.MONTH)+1)+"¿ù "
			+cal.get(Calendar.DATE)+"ÀÏ "+cal.get(Calendar.HOUR)
			+"½Ã"+cal.get(Calendar.MINUTE)+"ºÐ"+cal.get(Calendar.SECOND)+"ÃÊ";
			lblNewLabel_1.setText(now);
			
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}