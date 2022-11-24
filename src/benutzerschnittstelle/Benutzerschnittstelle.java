package benutzerschnittstelle;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public final class Benutzerschnittstelle extends JFrame
{
	private final JTable tblProdukte;
	private final JScrollPane scrollPane;
	private final JPanel contentPane;
	private JButton btnHinzufuegen;
	private JButton btnAendern;
	private JButton btnLoeschen;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					Benutzerschnittstelle frame = new Benutzerschnittstelle();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		
	}

	/**
	 * Create the frame.
	 */
	public Benutzerschnittstelle()
	{

		setTitle("Verwaltung Produkte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setEnabled(true);
		setFocusable(true);
		setResizable(true);
		setBounds(100, 100, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 11, 601, 342);
		getContentPane().add(scrollPane);

		tblProdukte = new JTable();
		scrollPane.setViewportView(tblProdukte);
		tblProdukte.setModel(new DefaultTableModel(
				new Object[][] {{null, null, null, null},},
				new String[] {"Produktnummer", "Bezeichnung", "Verkaufspreis",
						"Lagerbestand"})
		{
			final Class[] columnTypes = new Class[] {Integer.class,
					Object.class, Double.class, Integer.class};

			@Override
			public Class getColumnClass(int columnIndex)
			{
				return columnTypes[columnIndex];
			}

			final boolean[] columnEditables = new boolean[] {false, true, true,
					true};

			@Override
			public boolean isCellEditable(int row, int column)
			{
				return columnEditables[column];
			}
		});

		btnHinzufuegen = new JButton("Hinzufügen");
		btnHinzufuegen.setBounds(24, 427, 89, 23);
		contentPane.add(btnHinzufuegen);

		btnAendern = new JButton("Ändern");
		btnAendern.setBounds(291, 427, 89, 23);
		contentPane.add(btnAendern);

		btnLoeschen = new JButton("Löschen");
		btnLoeschen.setBounds(562, 427, 89, 23);
		contentPane.add(btnLoeschen);

		textField = new JTextField();
		textField.setBounds(27, 381, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(169, 381, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(319, 381, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(491, 381, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		tblProdukte.getColumnModel().getColumn(0).setResizable(false);
		tblProdukte.getColumnModel().getColumn(1).setResizable(false);
		tblProdukte.getColumnModel().getColumn(2).setResizable(false);
		tblProdukte.getColumnModel().getColumn(3).setResizable(false);
	}
}
