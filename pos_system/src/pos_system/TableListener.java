package pos_system;

import java.io.Serializable;

public class TableListener implements Serializable {

	int currentTable;

	TableListener(int tableNum)
	{
		currentTable = tableNum;

		switch(currentTable)
		{
		case 1:
			GUITest.MainJP.setViewportView(GUITest.t1.table);
			GUITest.MainJP.revalidate();
			GUITest.MainJP.repaint();
			GUITest.cur = 1;
			break;
		case 2:
			GUITest.MainJP.setViewportView(GUITest.t2.table);
			GUITest.MainJP.revalidate();
			GUITest.MainJP.repaint();
			GUITest.cur = 2;
			break;
		case 3:
			GUITest.MainJP.setViewportView(GUITest.t3.table);
			GUITest.MainJP.revalidate();
			GUITest.MainJP.repaint();
			GUITest.cur = 3;
			break;
		case 4:
			GUITest.MainJP.setViewportView(GUITest.t4.table);
			GUITest.MainJP.revalidate();
			GUITest.MainJP.repaint();
			GUITest.cur = 4;
			break;
		case 5:
			GUITest.MainJP.setViewportView(GUITest.t5.table);
			GUITest.MainJP.revalidate();
			GUITest.MainJP.repaint();
			GUITest.cur = 5;
			break;
		case 6:
			GUITest.MainJP.setViewportView(GUITest.t6.table);
			GUITest.MainJP.revalidate();
			GUITest.MainJP.repaint();
			GUITest.cur = 6;
			break;
		case 7:
			GUITest.MainJP.setViewportView(GUITest.t7.table);
			GUITest.MainJP.revalidate();
			GUITest.MainJP.repaint();
			GUITest.cur = 7;
			break;
		case 8:
			GUITest.MainJP.setViewportView(GUITest.t8.table);
			GUITest.MainJP.revalidate();
			GUITest.MainJP.repaint();
			GUITest.cur = 8;
			break;
		case 9:
			GUITest.MainJP.setViewportView(GUITest.t9.table);
			GUITest.MainJP.revalidate();
			GUITest.MainJP.repaint();
			GUITest.cur = 9;
			break;
		}
	}
}
