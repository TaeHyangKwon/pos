package pos_system;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

public class RemainsListener extends JFrame implements Serializable  {
	
	private JPanel contentPane;

	public JTable table;
	public DefaultTableModel model = new DefaultTableModel();
	String curRemains = new String();
	
	private JPanel contentPane2;
	static String Path = new String();
	JTextField textField = new JTextField();
	JTextField textField2 = new JTextField();
	JTextField textField3 = new JTextField();
	String curRemains2;
	Integer result;
	
	
	RemainsListener()
	{
		super("재고 관리");
		
		setBounds(100, 100, 390, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		model.addColumn("Remains");
	    model.addColumn("Number");
		
	    for(int i=0;i<MainData.curIngNum;i++) {
	    	model.addRow(new Object[] {Remains.Ingredient.elementAt(i),Remains.IngRemains.elementAt(i)});
	    }
	    
	    model.addRow(new Object[] {"",""});
	    
		JPanel tablePanel = new JPanel();
	    tablePanel.setBounds(372, 178, 312, 215);
	    contentPane.add(tablePanel, BorderLayout.CENTER);
	    tablePanel.setLayout(null);
	    table = new JTable(model);
	    table.setBounds(100, 58, 466, 279);
	    table.setPreferredScrollableViewportSize(new Dimension(300, 200));
	    table.setFillsViewportHeight(true);
	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(30, 5, 300, 202);
	    tablePanel.add(scrollPane);
	    
	    JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(427, 326, 73, 100);
		contentPane.add(buttonPanel,BorderLayout.PAGE_END);
		
		JButton btn1 = new JButton("변경...");
		btn1.setBounds(427, 290, 73, 35);
		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = table.getSelectedRow();
				// TODO Auto-generated method stub
				setBounds(100, 100, 250, 300);
				contentPane2 = new JPanel();
				contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane2);
				contentPane2.setLayout(null);
				
				JLabel label1 = new JLabel();
				label1.setText("현재 재고");
				label1.setBounds(10, 10, 120, 24);
				contentPane2.add(label1);
				
				curRemains = model.getValueAt(x, 1).toString();
				textField.setBounds(10, 40, 120, 24);
				contentPane2.add(textField);
				textField.setText(curRemains);
				textField.setColumns(10);
				
				JLabel label2 = new JLabel();
				label2.setText("변경량");
				label2.setBounds(10, 70, 120, 24);
				contentPane2.add(label2);
				
				textField2.setBounds(10, 100, 120, 24);
				contentPane2.add(textField2);
				textField2.setColumns(10);
				
				
				JLabel label3 = new JLabel("결과");
				label3.setBounds(10, 130, 120, 24);
				contentPane2.add(label3);
				
				textField3.setBounds(10, 160, 120, 24);
				contentPane2.add(textField3);
				textField3.setColumns(10);
				
				JButton btnNewButton = new JButton("OK");
				btnNewButton.setBounds(140, 160, 60, 24);
				btnNewButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int temp = Integer.parseInt(textField.getText());
						int temp2 = Integer.parseInt(textField2.getText());
						result = temp + temp2;
						textField3.setText(result.toString());
					}
				});
				contentPane2.add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("OK");
				btnNewButton_1.setBounds(10, 210, 120, 24);
				btnNewButton_1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Remains.IngRemains.setElementAt(result, table.getSelectedRow());
						if(result<0)
						{
							model.removeRow(table.getSelectedRow());
						}
					}
				});
				contentPane2.add(btnNewButton_1);
				setVisible(true);
			}});
		buttonPanel.add(btn1);
	}
}
