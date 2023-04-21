import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JTableEx01 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableEx01 frame = new JTableEx01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JTableEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 56, 346, 263);
		contentPane.add(scrollPane);
		
		
		 table = new JTable(); 
		 table.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		//System.out.println(table.getSelectedRow() );
		 		//System.out.println(table.getSelectedColumn() );
		 		
		 	System.out.println(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
		 		
		 		
		 	}
		 });scrollPane.setViewportView(table); 
		 /*table.setModel(new
		 DefaultTableModel( new Object[][] { //데이터 {"1", "2", "3", "4", "5"}, {null,
		  null, null, null, null}, }, new String[] { // 컬럼명 "\uCEEC\uB7FC\uBA851",
		  "\uCEEC\uB7FC\uBA852", "\uCEEC\uB7FC\uBA853", "\uCEEC\uB7FC\uBA854",
		  "\uCEEC\uB7FC\uBA855" } ) { boolean[] columnEditables = new boolean[] {
		  false, false, false, false, false }; public boolean isCellEditable(int row,
		  int column) { //editable return columnEditables[column]; } });
		 
		*/
		table.setModel(new CustomTableModel3());
		
		table.getColumnModel().getColumn(0).setResizable(false);  //resizeable
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
	}
}
