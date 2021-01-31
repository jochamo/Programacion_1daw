package ud2_introduccionJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class HolaMundoIGU extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolaMundoIGU frame = new HolaMundoIGU();
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
	public HolaMundoIGU() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHolaMundo = new JButton("Hola Mundo");
		btnHolaMundo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Hola mundo!");
			}
		});
		btnHolaMundo.setBounds(100, 83, 190, 76);
		contentPane.add(btnHolaMundo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(124, 12, 237, 24);
		contentPane.add(comboBox);
		
		JLabel lblJoseChamorro = new JLabel("Jose Chamorro");
		lblJoseChamorro.setBounds(151, 171, 199, 15);
		contentPane.add(lblJoseChamorro);
	}
}
