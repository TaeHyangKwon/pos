package pos_system;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 450, 300, 450);
		
		for(int cnt=1;cnt<21;cnt++)
		{
			g.drawString(cnt*10000+"", 6, 455-20*cnt);
			g.drawLine(50, 450-20*cnt, 300, 450-20*cnt);
		}
		g.drawLine(50, 50, 50, 450);
		g.drawString("¸ÅÃâ",100,470);
		g.setColor(Color.red);
		
		int sum = 0;
		
		 for(int i=0;i<MainData.TotalOrderedMenu.size();i++) {
			 sum+=(int)MainData.TotalOrderedMenu.elementAt(i)*(int)MainData.Price.elementAt(i);
		 }
		
		g.fillRect(100, 450-(sum/1000)*2, 20, (sum/1000)*2);
	}
}

