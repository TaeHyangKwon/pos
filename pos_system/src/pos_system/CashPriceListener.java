package pos_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JLabel;

import java.io.Serializable;

public class CashPriceListener extends JFrame implements ActionListener,Runnable, Serializable {

	private JPanel contentPane;

	static String now;
	private static Thread thread;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;
	JLabel lblNewLabel_3;
	JLabel lblNewLabel_4;
	
	public CashPriceListener() {
		
		setBounds(100, 100, 390, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("<������>");
	    label.setBounds(152, 30, 62, 18);
	    contentPane.add(label);
	    
	    lblNewLabel = new JLabel("time");
	    lblNewLabel.setBounds(178, 0, 185, 18);
	    contentPane.add(lblNewLabel);
	    
	    lblNewLabel_1 = new JLabel("�����ݾ� : "+Integer.toString(CashListener.total));
	    lblNewLabel_1.setBounds(74, 80, 170, 18);
	    contentPane.add(lblNewLabel_1);

	    lblNewLabel_2 = new JLabel("�����ݾ� : "+Integer.toString(CashListener.get_money));
	    lblNewLabel_2.setBounds(74, 115, 170, 18);
	    contentPane.add(lblNewLabel_2);
	    
	    lblNewLabel_3 = new JLabel("�Ž����� : "+Integer.toString(CashListener.change));
	    lblNewLabel_3.setBounds(74, 150, 170, 18);
	    contentPane.add(lblNewLabel_3);
	    
	    lblNewLabel_4 = new JLabel();
	    lblNewLabel_4.setBounds(0, 20, 96, 18);
	    contentPane.add(lblNewLabel_4);
	    lblNewLabel_4.setText("���̺���ȣ : "+GUITest.cur);
	    
	    JLabel lblNewLabel_2 = new JLabel("�ݿ��н�");
	    lblNewLabel_2.setBounds(0, 0, 62, 18);
	    contentPane.add(lblNewLabel_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					CashPriceListener frame = new CashPriceListener();
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
			now=cal.get(Calendar.YEAR)+"�� "+(cal.get(Calendar.MONTH)+1)+"�� "+cal.get(Calendar.DATE)+"�� "+cal.get(Calendar.HOUR)+"��"+cal.get(Calendar.MINUTE)+"��"+cal.get(Calendar.SECOND)+"��";
			lblNewLabel.setText(now);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}