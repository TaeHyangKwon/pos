package pos_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Sales extends JFrame implements Serializable {

	private JPanel contentPane;

	public Sales() {
		setBounds(100, 100, 880, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("일별");
		btnNewButton.setBounds(112, 10, 91, 27);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 	{
				 DrawingPanel dp=new DrawingPanel();
				 dp.setBounds(17, 49, 820, 480);
				 getContentPane().add(dp);
				 dp. repaint();
				 setVisible(true);
			}});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("메뉴별");
		btnNewButton_1.setBounds(665, 10, 91, 27);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 	{
				 MenuDrawingPanel mdp=new MenuDrawingPanel();
				 mdp.setBounds(17, 49, 820, 480);
				 getContentPane().add(mdp);
				 mdp. repaint();
				 setVisible(true);
			}});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("주별");
		btnNewButton_2.setBounds(298, 10, 91, 27);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 	{
				 WeekDrawingPanel wdp=new WeekDrawingPanel();
				 wdp.setBounds(17, 49, 820, 480);
				 getContentPane().add(wdp);
				 wdp. repaint();
				 setVisible(true);
			}});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("월별");
		btnNewButton_3.setBounds(486, 10, 91, 27);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 	{
				 MonthDrawingPanel mdp=new MonthDrawingPanel();
				 mdp.setBounds(17, 49, 820, 480);
				 getContentPane().add(mdp);
				 mdp. repaint();
				 setVisible(true);
			}});
		contentPane.add(btnNewButton_3);
	}
}
