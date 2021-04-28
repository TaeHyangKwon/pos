package pos_system;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Calendar;
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

public class CardReceipt extends JFrame implements Runnable, ActionListener, Serializable {
	
	private JPanel contentPane;

	private JTable table;
	private DefaultTableModel model;
	JScrollPane myJP;
	
	Vector<String> Menu = new Vector<String>();
	Vector<Integer> Price = new Vector<Integer>();
	
	static String now;
	private static Thread thread;
	JLabel lblNewLabel;
	
	static Vector<Integer> Sum = new Vector<Integer>();
	
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_3;
	JLabel lblNewLabel_4;
	
	public CardReceipt() {
		super("영수증");
		
		model = GUITest.t1.model;
		table = new JTable(model);
		myJP = new JScrollPane(table);
		
		setBounds(100, 100, 390, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel tablePanel = new JPanel();
	    tablePanel.setBounds(372, 178, 312, 215);
	    contentPane.add(tablePanel);
	    tablePanel.setLayout(null);
	    
	    JLabel label = new JLabel("<영수증>");
	    label.setBounds(152, 30, 62, 18);
	    tablePanel.add(label);
	    
	    lblNewLabel = new JLabel("time");
	    lblNewLabel.setBounds(178, 0, 185, 18);
	    tablePanel.add(lblNewLabel);
	    
	    lblNewLabel_1 = new JLabel();
	    lblNewLabel_1.setBounds(34, 285, 151, 18);
	    tablePanel.add(lblNewLabel_1);
	    
	    JLabel lblNewLabel_2 = new JLabel("금오분식");
	    lblNewLabel_2.setBounds(0, 0, 62, 18);
	    tablePanel.add(lblNewLabel_2);
	    
	    lblNewLabel_3 = new JLabel();
	    lblNewLabel_3.setBounds(34, 315, 151, 18);
	    tablePanel.add(lblNewLabel_3);
	    
	    lblNewLabel_4 = new JLabel();
	    lblNewLabel_4.setBounds(0, 20, 96, 18);
	    tablePanel.add(lblNewLabel_4);	
	    
		JButton btnNewButton_2 = new JButton("OK");
		btnNewButton_2.setBounds(292, 73, 52, 27);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub		
				
			}
		});
	    
		 switch(GUITest.cur)
		 {
		 case 1:
				model = GUITest.t1.model;

				table = new JTable(model);
			    table.setBounds(100, 58, 466, 279);
			    table.setPreferredScrollableViewportSize(new Dimension(300, 200));
			    table.setFillsViewportHeight(true);
				myJP = new JScrollPane(table);
				myJP.setBounds(30, 60, 300, 202);
				
				int sum1=0;
				for(int i=0;i<GUITest.MenuNum;i++)
				{
					if(GUITest.t1.table.getValueAt(i, 1)!="0")
					sum1+=Integer.valueOf((String)GUITest.t1.table.getValueAt(i,2));
					lblNewLabel_1.setText("받을금액 : "+Integer.toString(sum1));
					lblNewLabel_3.setText("받은금액 : "+Integer.toString(CardListener.total));
					lblNewLabel_4.setText("테이블번호 : 1");
					Sum.add(sum1);
				}
				
				tablePanel.add(myJP);
				break;
		 case 2:
				model = GUITest.t2.model;
				table = new JTable(model);
			    table.setBounds(100, 58, 466, 279);
			    table.setPreferredScrollableViewportSize(new Dimension(300, 200));
			    table.setFillsViewportHeight(true);
				myJP = new JScrollPane(table);
				myJP.setBounds(30, 60, 300, 202);
				
				int sum2=0;
				for(int i=0;i<GUITest.MenuNum;i++)
				{
					if(GUITest.t1.table.getValueAt(i, 1)!="0")
					sum2+=Integer.valueOf((String)GUITest.t2.table.getValueAt(i,2));
					lblNewLabel_1.setText("받을금액 : "+Integer.toString(sum2));
					lblNewLabel_3.setText("받은금액 : "+Integer.toString(CardListener.total));
					lblNewLabel_4.setText("테이블번호 : 2");
					Sum.add(sum2);
				}
				
				tablePanel.add(myJP);
				break;
		 case 3:
				model = GUITest.t3.model;
				table = new JTable(model);
			    table.setBounds(100, 58, 466, 279);
			    table.setPreferredScrollableViewportSize(new Dimension(300, 200));
			    table.setFillsViewportHeight(true);
				myJP = new JScrollPane(table);
				myJP.setBounds(30, 60, 300, 202);
				
				int sum3=0;
				for(int i=0;i<GUITest.MenuNum;i++)
				{
					if(GUITest.t1.table.getValueAt(i, 1)!="0")
					sum3+=Integer.valueOf((String)GUITest.t2.table.getValueAt(i,2));
					lblNewLabel_1.setText("받을금액 : "+Integer.toString(sum3));
					lblNewLabel_3.setText("받은금액 : "+Integer.toString(CardListener.total));
					lblNewLabel_4.setText("테이블번호 : 3");
					Sum.add(sum3);
				}
				
				tablePanel.add(myJP);
				break;
		 case 4:
				model = GUITest.t4.model;
				table = new JTable(model);
			    table.setBounds(100, 58, 466, 279);
			    table.setPreferredScrollableViewportSize(new Dimension(300, 200));
			    table.setFillsViewportHeight(true);
				myJP = new JScrollPane(table);
				myJP.setBounds(30, 60, 300, 202);
				
				int sum4=0;
				for(int i=0;i<GUITest.MenuNum;i++)
				{
					if(GUITest.t1.table.getValueAt(i, 1)!="0")
					sum4+=Integer.valueOf((String)GUITest.t2.table.getValueAt(i,2));
					lblNewLabel_1.setText("받을금액 : "+Integer.toString(sum4));
					lblNewLabel_3.setText("받은금액 : "+Integer.toString(CardListener.total));
					lblNewLabel_4.setText("테이블번호 : 4");
					Sum.add(sum4);
				}
				
				tablePanel.add(myJP);
				break;
		 case 5:
				model = GUITest.t5.model;
				table = new JTable(model);
			    table.setBounds(100, 58, 466, 279);
			    table.setPreferredScrollableViewportSize(new Dimension(300, 200));
			    table.setFillsViewportHeight(true);
				myJP = new JScrollPane(table);
				myJP.setBounds(30, 60, 300, 202);
				
				int sum5=0;
				for(int i=0;i<GUITest.MenuNum;i++)
				{
					if(GUITest.t1.table.getValueAt(i, 1)!="0")
					sum5+=Integer.valueOf((String)GUITest.t2.table.getValueAt(i,2));
					lblNewLabel_1.setText("받을금액 : "+Integer.toString(sum5));
					lblNewLabel_3.setText("받은금액 : "+Integer.toString(CardListener.total));
					lblNewLabel_4.setText("테이블번호 : 5");
					Sum.add(sum5);
				}
				
				tablePanel.add(myJP);
				break;
		 case 6:
				model = GUITest.t6.model;
				table = new JTable(model);
			    table.setBounds(100, 58, 466, 279);
			    table.setPreferredScrollableViewportSize(new Dimension(300, 200));
			    table.setFillsViewportHeight(true);
				myJP = new JScrollPane(table);
				myJP.setBounds(30, 60, 300, 202);
				
				int sum6=0;
				for(int i=0;i<GUITest.MenuNum;i++)
				{
					if(GUITest.t1.table.getValueAt(i, 1)!="0")
					sum6+=Integer.valueOf((String)GUITest.t2.table.getValueAt(i,2));
					lblNewLabel_1.setText("받을금액 : "+Integer.toString(sum6));
					lblNewLabel_3.setText("받은금액 : "+Integer.toString(CardListener.total));
					lblNewLabel_4.setText("테이블번호 : 6");
					Sum.add(sum6);
				}
				
				tablePanel.add(myJP);
				break;
		 case 7:
				model = GUITest.t7.model;
				table = new JTable(model);
			    table.setBounds(100, 58, 466, 279);
			    table.setPreferredScrollableViewportSize(new Dimension(300, 200));
			    table.setFillsViewportHeight(true);
				myJP = new JScrollPane(table);
				myJP.setBounds(30, 60, 300, 202);
				
				int sum7=0;
				for(int i=0;i<GUITest.MenuNum;i++)
				{
					if(GUITest.t1.table.getValueAt(i, 1)!="0")
					sum7+=Integer.valueOf((String)GUITest.t2.table.getValueAt(i,2));
					lblNewLabel_1.setText("받을금액 : "+Integer.toString(sum7));
					lblNewLabel_3.setText("받은금액 : "+Integer.toString(CardListener.total));
					lblNewLabel_4.setText("테이블번호 : 7");
					Sum.add(sum7);
				}
				
				tablePanel.add(myJP);
				break;
		 case 8:
				model = GUITest.t8.model;
				table = new JTable(model);
			    table.setBounds(100, 58, 466, 279);
			    table.setPreferredScrollableViewportSize(new Dimension(300, 200));
			    table.setFillsViewportHeight(true);
				myJP = new JScrollPane(table);
				myJP.setBounds(30, 60, 300, 202);
				
				int sum8=0;
				for(int i=0;i<GUITest.MenuNum;i++)
				{
					if(GUITest.t1.table.getValueAt(i, 1)!="0")
					sum8+=Integer.valueOf((String)GUITest.t2.table.getValueAt(i,2));
					lblNewLabel_1.setText("받을금액 : "+Integer.toString(sum8));
					lblNewLabel_3.setText("받은금액 : "+Integer.toString(CardListener.total));
					lblNewLabel_4.setText("테이블번호 : 8");
					Sum.add(sum8);
				}
				
				tablePanel.add(myJP);
				break;
		 case 9:
				model = GUITest.t9.model;
				table = new JTable(model);
			    table.setBounds(100, 58, 466, 279);
			    table.setPreferredScrollableViewportSize(new Dimension(300, 200));
			    table.setFillsViewportHeight(true);
				myJP = new JScrollPane(table);
				myJP.setBounds(30, 60, 300, 202);
				
				int sum9=0;
				for(int i=0;i<GUITest.MenuNum;i++)
				{
					if(GUITest.t1.table.getValueAt(i, 1)!="0")
					sum9+=Integer.valueOf((String)GUITest.t2.table.getValueAt(i,2));
					lblNewLabel_1.setText("받을금액 : "+Integer.toString(sum9));
					lblNewLabel_3.setText("받은금액 : "+Integer.toString(CardListener.total));
					lblNewLabel_4.setText("테이블번호 : 9");
					Sum.add(sum9);
				}
				
				tablePanel.add(myJP);
				break;
		 }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					CardReceipt frame = new CardReceipt();
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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			Calendar cal=Calendar.getInstance();
			now=cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DATE)+"일 "+cal.get(Calendar.HOUR)+"시"+cal.get(Calendar.MINUTE)+"분"+cal.get(Calendar.SECOND)+"초";
			lblNewLabel.setText(now);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}