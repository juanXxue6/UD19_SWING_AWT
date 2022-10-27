import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Ex2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 window = new Ex2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ex2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peliculas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(270, 56, 154, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAadirPeliculas = new JLabel("Añadir peliculas");
		lblAadirPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAadirPeliculas.setBounds(26, 56, 154, 38);
		frame.getContentPane().add(lblAadirPeliculas);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(249, 133, 136, 23);
		frame.getContentPane().add(comboBox);
			
		textField = new JTextField();
		textField.setBounds(26, 133, 154, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBox.addItem(textField.getText());
				textField.setText("");
			}
		});
		btnNewButton.setBounds(26, 202, 89, 23);
		frame.getContentPane().add(btnNewButton);
		

	}
}
