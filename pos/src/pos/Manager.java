package pos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.Vector;

import javax.swing.JButton;

public class Manager extends JFrame {

	public static Vector<Integer> OrderedMenu = new Vector<Integer>(0);
	
	private JPanel contentPane;

	public Manager() {
		
		super("관리자 모드");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("메뉴 관리");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Menu m=new Menu();
				m.setVisible(true);
			}
		});
		btnNewButton.setBounds(14, 62, 100, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("재고 관리");
		btnNewButton_1.setBounds(128, 62, 100, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("매출 관리");
		btnNewButton_2.setBounds(242, 62, 100, 50);
		contentPane.add(btnNewButton_2);
		
		/*
		JButton btnNewButton_cur = new JButton("총 주문량");
	    btnNewButton_cur.setBounds(115, 12, 118, 35);
	    contentPane.add(btnNewButton_cur);
	    OrderedMenuListener temp = new OrderedMenuListener(MenuNum);

	    btnNewButton_cur.addActionListener(temp);
	    */
	}
}
