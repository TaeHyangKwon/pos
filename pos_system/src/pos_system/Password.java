package pos_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.io.Serializable;

public class Password extends JFrame implements Serializable {

	private JPanel contentPane;
	private JPasswordField passwordField;

	public Password() {
		setBounds(100, 100, 311, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pass word");
		lblNewLabel.setBounds(10, 40, 94, 18);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(93, 37, 111, 24);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(209, 37, 70, 24);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(new String (passwordField.getPassword()).equals("0000")) {
					
					Manager m = new Manager();
			    	m.setVisible(true);
				}
			}
		});
	}
}