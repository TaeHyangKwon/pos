package pos_system;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class WeekDrawingPanel extends JPanel {
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 450, 70*GUITest.MenuNum + 20, 450);
		
		for(int cnt=1;cnt<21;cnt++)
		{
			g.drawString(cnt*10000+"", 6, 455-20*cnt);
			g.drawLine(50, 450-20*cnt, 70*GUITest.MenuNum + 20, 450-20*cnt);
		}
		
		g.drawLine(50, 50, 50, 450);
		
		g.drawString("월",80,470);
		g.drawString("화",160,470);
		g.drawString("수",240,470);
		g.drawString("목",320,470);
		g.drawString("금",400,470);
		g.drawString("토",480,470);
		g.drawString("일",560,470);
		
		g.setColor(Color.red);
	
		int num=1;
		
		for(int i=MainData.TotalPrice.size()-7;i<MainData.TotalPrice.size();i++) {
			g.fillRect(80*(num), 450-(MainData.TotalPrice.elementAt(i)/1000)*2, 10, (MainData.TotalPrice.elementAt(i)/1000)*2);
			num++;
		 }
	}
}