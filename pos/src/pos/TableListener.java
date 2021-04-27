package pos;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;

public class TableListener implements ActionListener {

	Table myTable;
	
	TableListener(Table tempTable)
	{
		myTable = tempTable;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	    myTable.table.setBounds(100, 58, 466, 279);
	    myTable.table.setPreferredScrollableViewportSize(new Dimension(310, 200));
	    myTable.table.setFillsViewportHeight(true);
	    Pos.tablePanel.add(new JScrollPane(myTable.table));
	}

}

/*
public class TableListener implements ActionListener {
	Table table;
	
	TableListener(Table m_t)
	{
		table = m_t;
	}

	public void actionPerformed(ActionEvent arg0) {
        Table t = table;
    	t.setVisible(true);
    }
}
*/