package pos;

import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class OrderedMenu extends JFrame implements Runnable {
	
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	Vector<Integer> OrderedMenu;
	   
	   OrderedMenu()
	   {
		      setBounds(100, 100, 805, 600);
		      contentPane = new JPanel();
		      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		      setContentPane(contentPane);
		      contentPane.setLayout(null);
		      
		      model.addColumn("Menu");
		      model.addColumn("Number");
		      model.addColumn("Cost");
		      
		      JPanel tablePanel = new JPanel();
		      tablePanel.setBounds(350, 58, 500, 279);
		      contentPane.add(tablePanel);
		      table = new JTable(model);
		      table.setBounds(100, 58, 466, 279);
		      table.setPreferredScrollableViewportSize(new Dimension(350,230));
		      table.setFillsViewportHeight(true);
		      tablePanel.add(new JScrollPane(table));
		      
		      model.addRow(new Object[]{"���",String.valueOf(Pos.OrderedMenu.elementAt(0)),String.valueOf(Pos.OrderedMenu.elementAt(0)*2000)});
		      model.addRow(new Object[]{"������",String.valueOf(Pos.OrderedMenu.elementAt(1)),String.valueOf(Pos.OrderedMenu.elementAt(1)*3000)});
		      model.addRow(new Object[]{"ġ�����",String.valueOf(Pos.OrderedMenu.elementAt(2)),String.valueOf(Pos.OrderedMenu.elementAt(2)*3500)});
		      model.addRow(new Object[]{"����",String.valueOf(Pos.OrderedMenu.elementAt(3)),String.valueOf(Pos.OrderedMenu.elementAt(3)*3000)});
		      model.addRow(new Object[]{"���",String.valueOf(Pos.OrderedMenu.elementAt(4)),String.valueOf(Pos.OrderedMenu.elementAt(4)*2500)});
		      model.addRow(new Object[]{"����",String.valueOf(Pos.OrderedMenu.elementAt(5)),String.valueOf(Pos.OrderedMenu.elementAt(5)*3000)});
		      model.addRow(new Object[]{"���",String.valueOf(Pos.OrderedMenu.elementAt(6)),String.valueOf(Pos.OrderedMenu.elementAt(6)*3500)});
		      model.addRow(new Object[]{"ġ��",String.valueOf(Pos.OrderedMenu.elementAt(7)),String.valueOf(Pos.OrderedMenu.elementAt(7)*4000)});
		      model.addRow(new Object[]{"���Ƕ��̽�",String.valueOf(Pos.OrderedMenu.elementAt(8)),String.valueOf(Pos.OrderedMenu.elementAt(8)*3500)});
	   }

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
}