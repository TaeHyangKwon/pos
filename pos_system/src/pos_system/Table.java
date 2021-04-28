package pos_system;

import java.awt.Dimension;
import java.io.Serializable;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table implements Serializable {
	public DefaultTableModel model;
	public JTable table;
	public Vector<String> OrderedMenu;
	static int y;
	public JScrollPane JP;
	
	Table()
	{
		OrderedMenu = new Vector<String>(GUITest.MenuNum);
		model = new DefaultTableModel();
		model.addColumn("Menu");
	    model.addColumn("Number");
	    model.addColumn("Cost");
		
	    for(int i=0;i<GUITest.MenuNum;i++) {
	    	model.addRow(new Object[] {MainData.Menu.elementAt(i),"0",MainData.Price.elementAt(i)});
	    }
	    
	    table = new JTable(model);
	    table.setBounds(100, 58, 466, 279);
	    table.setPreferredScrollableViewportSize(new Dimension(310, 200));
	    table.setFillsViewportHeight(true);
	    JP = new JScrollPane(table);
	}
}

