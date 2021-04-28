package pos_system;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;

public class MonthDrawingPanel extends JPanel {
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 450, 800, 450);
		
		for(int cnt=1;cnt<21;cnt++)
		{
			g.drawString(cnt*10000+"", 6, 455-20*cnt);
			g.drawLine(50, 450-20*cnt, 800, 450-20*cnt);
		}
		
		g.drawLine(50, 50, 50, 450);
		
		g.drawString("1老",60,470);
		g.drawString("2老",85,470);
		g.drawString("3老",110,470);
		g.drawString("4老",135,470);
		g.drawString("5老",160,470);
		g.drawString("6老",185,470);
		g.drawString("7老",210,470);
		g.drawString("8老",235,470);
		g.drawString("9老",260,470);
		g.drawString("10老",285,470);
		g.drawString("11老",310,470);
		g.drawString("12老",335,470);
		g.drawString("13老",360,470);
		g.drawString("14老",385,470);
		g.drawString("15老",410,470);
		g.drawString("16老",435,470);
		g.drawString("17老",460,470);
		g.drawString("18老",485,470);
		g.drawString("19老",510,470);
		g.drawString("20老",535,470);
		g.drawString("21老",560,470);
		g.drawString("22老",585,470);
		g.drawString("23老",610,470);
		g.drawString("24老",635,470);
		g.drawString("25老",660,470);
		g.drawString("26老",685,470);
		g.drawString("27老",710,470);
		g.drawString("28老",735,470);
		g.drawString("29老",760,470);
		g.drawString("30老",785,470);
		
		g.setColor(Color.red);
		
		int num=1;
		
		for(int i=MainData.TotalPrice.size()-30;i<MainData.TotalPrice.size();i++) {
			g.fillRect(25*(num)+40, 450-(MainData.TotalPrice.elementAt(i)/1000)*2, 10, (MainData.TotalPrice.elementAt(i)/1000)*2);
			num++;
		 }
	}
}