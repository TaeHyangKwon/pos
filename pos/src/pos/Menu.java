package pos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.ScrollPane;
import java.awt.Scrollbar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
	private JPanel contentPane;

	static JTable table;
	static DefaultTableModel model;
	
	public Menu() {
		super("�޴� ����");
		
		model = new DefaultTableModel();
		setBounds(100, 100, 390, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		model.addColumn("Menu");
	    model.addColumn("Cost");
	    
	    
	    for(int i=0;i < Pos.MenuNum;i++) {
	    	
	    	model.addRow(new Object[] {Pos.Menu.elementAt(i),Pos.Price.elementAt(i)});
	    }
	    
		JPanel tablePanel = new JPanel();
	    tablePanel.setBounds(372, 178, 312, 215);
	    contentPane.add(tablePanel);
	    tablePanel.setLayout(null);
	    table = new JTable(model);
	    table.setBounds(100, 58, 466, 279);
	    table.setPreferredScrollableViewportSize(new Dimension(300, 200));
	    table.setFillsViewportHeight(true);
	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(30, 5, 300, 202);
	    tablePanel.add(scrollPane);
	    
	    JButton btnNewButton = new JButton("����");
	    btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				

				Pos.Menu.remove(Menu.table.getSelectedRow());
				Pos.Price.add(Menu.table.getSelectedRow());
				Pos.MenuNum--;

				//Pos.curFood.remove(Menu.table.getSelectedRow());
				//Pos.TotalOrderedMenu.remove(Menu.table.getSelectedRow());
				
				Pos.t1.model.removeRow(Menu.table.getSelectedRow());
				Pos.t2.model.removeRow(Menu.table.getSelectedRow());
				Pos.t3.model.removeRow(Menu.table.getSelectedRow());
				Pos.t4.model.removeRow(Menu.table.getSelectedRow());
				Pos.t5.model.removeRow(Menu.table.getSelectedRow());
				Pos.t6.model.removeRow(Menu.table.getSelectedRow());
				Pos.t7.model.removeRow(Menu.table.getSelectedRow());
				Pos.t8.model.removeRow(Menu.table.getSelectedRow());
				Pos.t9.model.removeRow(Menu.table.getSelectedRow());
				Menu.model.removeRow(Menu.table.getSelectedRow());
			}
	    });
	    btnNewButton.setBounds(196, 219, 86, 32);
	    tablePanel.add(btnNewButton);
	    
	    JButton btnNewButton_1 = new JButton("�߰�");
	    btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//AddMenu add = new AddMenu();
				//add.setVisible(true);
			}
	    });
	    btnNewButton_1.setBounds(76, 219, 86, 32);
	    tablePanel.add(btnNewButton_1);
	    
	    JButton btnNewButton_2 = new JButton("Ȯ��");
	    btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
	            dispose();
			}
	    });
	    btnNewButton_2.setBounds(76, 270, 200, 32);
	    tablePanel.add(btnNewButton_2);
	}
}