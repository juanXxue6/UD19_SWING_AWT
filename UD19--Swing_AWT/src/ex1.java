import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex1 {

	private JFrame frmSaludar;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex1 window = new ex1();
					window.frmSaludar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ex1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSaludar = new JFrame();
		frmSaludar.setForeground(new Color(0, 0, 0));
		frmSaludar.setFont(new Font("Dialog", Font.PLAIN, 16));
		frmSaludar.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frmSaludar.setTitle("Saludar");
		frmSaludar.setBounds(100, 100, 450, 300);
		frmSaludar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSaludar.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce un nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(128, 48, 253, 43);
		frmSaludar.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(101, 117, 253, 30);
		frmSaludar.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Saludar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Hola " + textField.getText());
				textField.setText("");
				
			}
		});
		
		btnNewButton.setBounds(181, 181, 89, 23);
		frmSaludar.getContentPane().add(btnNewButton);
	}
}
