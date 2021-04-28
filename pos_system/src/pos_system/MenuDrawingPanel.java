package pos_system;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MenuDrawingPanel extends JPanel {
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 450, 70*GUITest.MenuNum + 20, 450);
		
		for(int cnt=1;cnt<21;cnt++)
		{
			g.drawString(cnt*10000+"", 6, 455-20*cnt);
			g.drawLine(50, 450-20*cnt, 70*GUITest.MenuNum + 20, 450-20*cnt);
		}
		
		g.drawLine(50, 50, 50, 450);
		for(int i=0;i<GUITest.MenuNum;i++)
		{
			g.drawString(MainData.Menu.elementAt(i),70*(i+1),470);
		}
		g.setColor(Color.red);
	
		
		for(int i=0;i<MainData.TotalOrderedMenu.size();i++) {
			int sum = 0;
			sum+=(int)MainData.TotalOrderedMenu.elementAt(i)*(int)MainData.Price.elementAt(i);
			g.fillRect(70*(i+1), 450-(sum/1000)*2, 10, (sum/1000)*2);
		 }
	}
}
