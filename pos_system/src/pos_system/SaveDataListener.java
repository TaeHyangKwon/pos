package pos_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SaveDataListener extends JFrame implements ActionListener{
	
	private JPanel contentPane;
	static String Path = new String();
	JTextField textField = new JTextField();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setBounds(100, 100, 390, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField.setBounds(10, 29, 350, 24);
		contentPane.add(textField);
		textField.setText("C:\\SaveData\\");
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("OK");
		btnNewButton_1.setBounds(140, 70, 80, 27);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Path = textField.getText();
				DoSaveData(Path);
			}
		});
		
		contentPane.add(btnNewButton_1);
		
		
		setVisible(true);
	}
		
	void DoSaveData(String _Path) {
		try {
			FileOutputStream  fos = new FileOutputStream(new File(_Path));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			SaveData sv = new SaveData();
		    System.out.print(sv.remains.IngRemains);
			sv.TotalPrice.add(SetTable.total);
		    oos.writeObject(sv);
		    oos.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
