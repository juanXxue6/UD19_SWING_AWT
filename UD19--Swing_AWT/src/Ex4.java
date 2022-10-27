import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex4 {

	static JButton btnSuma = new JButton("+");
	static JButton btnResta = new JButton("-");
	static JButton btnDivision = new JButton("/");
	static JButton btnMult = new JButton("*");
	static JButton btnBorrar = new JButton("CE");
	static JButton btnSalir = new JButton("Exit");
	
	private JFrame frame;
	private JTextField text0p1;
	private JTextField textOp2;
	private JTextField textRes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex4 window = new Ex4();
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
	public Ex4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 448, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		text0p1 = new JTextField();
		text0p1.setBounds(10, 35, 180, 38);
		frame.getContentPane().add(text0p1);
		text0p1.setColumns(10);
		
		textOp2 = new JTextField();
		textOp2.setColumns(10);
		textOp2.setBounds(10, 106, 180, 38);
		frame.getContentPane().add(textOp2);
		
		textRes = new JTextField();
		textRes.setColumns(10);
		textRes.setBounds(10, 183, 180, 38);
		frame.getContentPane().add(textRes);

		

		btnResta.setBounds(332, 49, 60, 60);
		frame.getContentPane().add(btnResta);

		btnDivision.setBounds(262, 120, 60, 60);
		frame.getContentPane().add(btnDivision);

		btnMult.setBounds(332, 120, 60, 60);
		frame.getContentPane().add(btnMult);
		
		

		btnSuma.setBounds(262, 49, 60, 60);
		frame.getContentPane().add(btnSuma);
		
		
		btnBorrar.setBounds(262, 191, 60, 60);
		frame.getContentPane().add(btnBorrar);

		btnSalir.setBounds(332, 191, 60, 60);
		frame.getContentPane().add(btnSalir);
		
		
		JLabel lblNewLabel = new JLabel("Operador 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 10, 80, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblOperador = new JLabel("Operador 2");
		lblOperador.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperador.setBounds(10, 84, 80, 20);
		frame.getContentPane().add(lblOperador);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado.setBounds(10, 155, 80, 20);
		frame.getContentPane().add(lblResultado);
		
		JLabel lblOperadores = new JLabel("Operadores");
		lblOperadores.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperadores.setBounds(266, 18, 80, 20);
		frame.getContentPane().add(lblOperadores);
		

		
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textRes.setText(String.valueOf(Double.parseDouble(text0p1.getText())*Double.parseDouble(textOp2.getText())));
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textOp2.setText("");
				text0p1.setText("");
				textRes.setText("");
			}
		});
		
		
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textRes.setText(String.valueOf(Double.parseDouble(text0p1.getText())+Double.parseDouble(textOp2.getText())));
				
			}
		});
		
		
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textRes.setText(String.valueOf(Double.parseDouble(text0p1.getText())-Double.parseDouble(textOp2.getText())));
			}
		});

		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textRes.setText(String.valueOf(Double.parseDouble(text0p1.getText())/Double.parseDouble(textOp2.getText())));
			}
		});
		
		
		
	}
}
