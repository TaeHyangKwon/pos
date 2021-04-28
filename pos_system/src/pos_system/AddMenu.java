package pos_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddMenu extends JFrame implements Serializable {

	private JPanel contentPane;
	private JTextField MenuName;
	private JTextField Price;
	private JTextField Ing1;
	private JTextField Ing2;
	int num=0;
	int []arr;

	AddMenu(){
		setBounds(100, 100, 311, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(10, 40, 94, 18);
		contentPane.add(lblNewLabel);
		
		MenuName = new JTextField();
		MenuName.setBounds(93, 37, 111, 24);
		contentPane.add(MenuName);
		
		JLabel lblNewLabel2 = new JLabel("Price");
		lblNewLabel2.setBounds(10, 70, 94, 18);
		contentPane.add(lblNewLabel2);
		
		Price = new JTextField();
		Price.setBounds(93, 67, 111, 24);
		contentPane.add(Price);
		
		JLabel lblNewLabel3 = new JLabel("Ingredient");
		lblNewLabel3.setBounds(10, 100, 94, 18);
		contentPane.add(lblNewLabel3);
		
		Ing1 = new JTextField();
		Ing1.setBounds(93, 97, 111, 24);
		contentPane.add(Ing1);
		
		JLabel lblNewLabel4 = new JLabel("amount");
		lblNewLabel4.setBounds(10, 130, 94, 18);
		contentPane.add(lblNewLabel4);
		
		Ing2 = new JTextField();
		Ing2.setBounds(93, 127, 111, 24);
		contentPane.add(Ing2);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(209, 127, 70, 24);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Remains.Ingredient.add(Ing1.getText());
				Ing1.setText("");
				Remains.IngRemains.add(Integer.parseInt(Ing2.getText()));
				num++;
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("확인");
		btnNewButton2.setBounds(93, 157, 110, 44);
		btnNewButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				arr = new int[num];
				for(int i=0;i<num;i++)
				{
					arr[i] = Remains.Ingredient.size() - (num  - (i));
				}
				MainData.Menu.add(MenuName.getText());
				MainData.Price.add(Integer.parseInt(Price.getText()));
				GUITest.MenuNum++;
				Menu.model.addRow(new Object[] {MenuName.getText(),Price.getText()});
				MainData.curFood.add(new Foods(MenuName.getText(),num,arr));
				MainData.curIngNum += num;
				MainData.TotalOrderedMenu.add(0);
				
				GUITest.t1.model.addRow(new Object[] {MenuName.getText(),"0",Price.getText()});
				GUITest.t2.model.addRow(new Object[] {MenuName.getText(),"0",Price.getText()});
				GUITest.t3.model.addRow(new Object[] {MenuName.getText(),"0",Price.getText()});
				GUITest.t4.model.addRow(new Object[] {MenuName.getText(),"0",Price.getText()});
				GUITest.t5.model.addRow(new Object[] {MenuName.getText(),"0",Price.getText()});
				GUITest.t6.model.addRow(new Object[] {MenuName.getText(),"0",Price.getText()});
				GUITest.t7.model.addRow(new Object[] {MenuName.getText(),"0",Price.getText()});
				GUITest.t8.model.addRow(new Object[] {MenuName.getText(),"0",Price.getText()});
				GUITest.t9.model.addRow(new Object[] {MenuName.getText(),"0",Price.getText()});
				}
		});
		contentPane.add(btnNewButton2);
	}
}
