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
		
		g.drawString("1��",60,470);
		g.drawString("2��",85,470);
		g.drawString("3��",110,470);
		g.drawString("4��",135,470);
		g.drawString("5��",160,470);
		g.drawString("6��",185,470);
		g.drawString("7��",210,470);
		g.drawString("8��",235,470);
		g.drawString("9��",260,470);
		g.drawString("10��",285,470);
		g.drawString("11��",310,470);
		g.drawString("12��",335,470);
		g.drawString("13��",360,470);
		g.drawString("14��",385,470);
		g.drawString("15��",410,470);
		g.drawString("16��",435,470);
		g.drawString("17��",460,470);
		g.drawString("18��",485,470);
		g.drawString("19��",510,470);
		g.drawString("20��",535,470);
		g.drawString("21��",560,470);
		g.drawString("22��",585,470);
		g.drawString("23��",610,470);
		g.drawString("24��",635,470);
		g.drawString("25��",660,470);
		g.drawString("26��",685,470);
		g.drawString("27��",710,470);
		g.drawString("28��",735,470);
		g.drawString("29��",760,470);
		g.drawString("30��",785,470);
		
		g.setColor(Color.red);
		
		int num=1;
		
		for(int i=MainData.TotalPrice.size()-30;i<MainData.TotalPrice.size();i++) {
			g.fillRect(25*(num)+40, 450-(MainData.TotalPrice.elementAt(i)/1000)*2, 10, (MainData.TotalPrice.elementAt(i)/1000)*2);
			num++;
		 }
	}
}