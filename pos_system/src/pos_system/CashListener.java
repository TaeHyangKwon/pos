package pos_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CashListener extends JFrame implements ActionListener, Serializable {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	static int total;
	static int change;
	static int get_money;

	public CashListener() {	
		super("현금결제");
		
		setBounds(100, 100, 376, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("받을 금액");
		lblNewLabel.setBounds(72, 32, 62, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("받은 금액");
		lblNewLabel_1.setBounds(72, 77, 62, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("거스름돈");
		lblNewLabel_2.setBounds(72, 120, 62, 18);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(162, 29, 116, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 74, 116, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 117, 116, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("영수증 출력(총액만)");
		btnNewButton.addActionListener(new CashPriceListener());
		btnNewButton.setBounds(90, 174, 175, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("영수증 출력(메뉴포함)");
		btnNewButton_1.addActionListener(new Receipt());
		btnNewButton_1.setBounds(90, 232, 175, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("OK");
		btnNewButton_2.setBounds(292, 73, 52, 27);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
				get_money=Integer.parseInt(textField_1.getText());
				total=Integer.parseInt(textField.getText());
				change=get_money-total;
				textField_2.setText(Integer.toString(change));
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("결제완료");
		btnNewButton_3.setBounds(130, 290, 100, 43);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub		
				switch(GUITest.cur)
				{
				case 1:
					GUITest.t1 = new Table();
					GUITest.MainJP.setViewportView(GUITest.t1.table);
					GUITest.MainJP.revalidate();
					GUITest.MainJP.repaint();
					break;
				case 2:
					GUITest.t2 = new Table();
					GUITest.MainJP.setViewportView(GUITest.t2.table);
					GUITest.MainJP.revalidate();
					GUITest.MainJP.repaint();
					break;
				case 3:
					GUITest.t3 = new Table();
					GUITest.MainJP.setViewportView(GUITest.t3.table);
					GUITest.MainJP.revalidate();
					GUITest.MainJP.repaint();
					break;
				case 4:
					GUITest.t4 = new Table();
					GUITest.MainJP.setViewportView(GUITest.t4.table);
					GUITest.MainJP.revalidate();
					GUITest.MainJP.repaint();
					break;
				case 5:
					GUITest.t5 = new Table();
					GUITest.MainJP.setViewportView(GUITest.t5.table);
					GUITest.MainJP.revalidate();
					GUITest.MainJP.repaint();
					break;
				case 6:
					GUITest.t6 = new Table();
					GUITest.MainJP.setViewportView(GUITest.t6.table);
					GUITest.MainJP.revalidate();
					GUITest.MainJP.repaint();
					break;
				case 7:
					GUITest.t7 = new Table();
					GUITest.MainJP.setViewportView(GUITest.t7.table);
					GUITest.MainJP.revalidate();
					GUITest.MainJP.repaint();
					break;
				case 8:
					GUITest.t8 = new Table();
					GUITest.MainJP.setViewportView(GUITest.t8.table);
					GUITest.MainJP.revalidate();
					GUITest.MainJP.repaint();
					break;
				case 9:
					GUITest.t9 = new Table();
					GUITest.MainJP.setViewportView(GUITest.t9.table);
					GUITest.MainJP.revalidate();
					GUITest.MainJP.repaint();
					break;
				}
			}
		});
		contentPane.add(btnNewButton_3);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		switch(GUITest.cur)
		 {
		 case 1:
			int sum1 = 0;
			
			for(int i=0;i<GUITest.MenuNum;i++)
			{
				if(GUITest.t1.table.getValueAt(i, 1)!="0")
				sum1+=Integer.valueOf((String)GUITest.t1.table.getValueAt(i,2));
			}
			textField.setText(Integer.toString(sum1));
			break;
		 case 2:
			 int sum2 = 0;
				
			for(int i=0;i<GUITest.MenuNum;i++)
			{
				if(GUITest.t2.table.getValueAt(i, 1)!="0")
				sum2+=Integer.valueOf((String)GUITest.t2.table.getValueAt(i,2));
				textField.setText(Integer.toString(sum2));
			}
				break;
		 case 3:
			 int sum3 = 0;
				
			for(int i=0;i<GUITest.MenuNum;i++)
			{
				if(GUITest.t3.table.getValueAt(i, 1)!="0")
				sum3+=Integer.valueOf((String)GUITest.t3.table.getValueAt(i,2));
				textField.setText(Integer.toString(sum3));
			}
			break;
		 case 4:
			 int sum4 = 0;
				
			for(int i=0;i<GUITest.MenuNum;i++)
			{
				if(GUITest.t4.table.getValueAt(i, 1)!="0")
				sum4+=Integer.valueOf((String)GUITest.t4.table.getValueAt(i,2));
				textField.setText(Integer.toString(sum4));
			}
			break;
		 case 5:
			 int sum5 = 0;
				
			for(int i=0;i<GUITest.MenuNum;i++)
			{
				if(GUITest.t5.table.getValueAt(i, 1)!="0")
				sum5+=Integer.valueOf((String)GUITest.t5.table.getValueAt(i,2));
				textField.setText(Integer.toString(sum5));
			}
			break;
		 case 6:
			 int sum6 = 0;
				
			for(int i=0;i<GUITest.MenuNum;i++)
			{
				if(GUITest.t6.table.getValueAt(i, 1)!="0")
				sum6+=Integer.valueOf((String)GUITest.t6.table.getValueAt(i,2));
				textField.setText(Integer.toString(sum6));
			}
			break;
		 case 7:
			 int sum7 = 0;
				
			for(int i=0;i<GUITest.MenuNum;i++)
			{
				if(GUITest.t7.table.getValueAt(i, 1)!="0")
				sum7+=Integer.valueOf((String)GUITest.t7.table.getValueAt(i,2));
				textField.setText(Integer.toString(sum7));
			}
			break;
		 case 8:
			 int sum8 = 0;
				
			for(int i=0;i<GUITest.MenuNum;i++)
			{
				if(GUITest.t8.table.getValueAt(i, 1)!="0")
				sum8+=Integer.valueOf((String)GUITest.t8.table.getValueAt(i,2));
				textField.setText(Integer.toString(sum8));
			}
			break;
		 case 9:
			 int sum9 = 0;
				
			for(int i=0;i<GUITest.MenuNum;i++)
			{
				if(GUITest.t9.table.getValueAt(i, 1)!="0")
				sum9+=Integer.valueOf((String)GUITest.t9.table.getValueAt(i,2));
				textField.setText(Integer.toString(sum9));
			}
			break;
		 }
		
		setVisible(true);
	}
}

