import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex3 {

	private JFrame frame;

	static JRadioButton boton1 = new JRadioButton("Linux");
	static JRadioButton boton2 = new JRadioButton("Windows");
	static JRadioButton boton3 = new JRadioButton("Mac");
	
	static JCheckBox checkboxAdministracion = new JCheckBox("Administracion");
	static JCheckBox checkboxProgramacion = new JCheckBox("Programacion");
	static JCheckBox checkboxDiseño = new JCheckBox("Diseño grafico");
		
	static String frase = "Sistema operativo: ";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3 window = new Ex3();
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
	public Ex3() {
		initialize();
	}

	private  static void validateRadioButton() {
		
		if(boton1.isSelected()) {
			frase += " linux\n";
		}if(boton2.isSelected()) {
			frase += " windows\n";
		}if(boton3.isSelected()) {
			frase += " mac\n";
		}		
	}
	
	private  static void validateCheckBox() {
		
		frase += "Especialidad: ";
		
		if(checkboxAdministracion.isSelected()) {
			frase += "administracion -";
		}if(checkboxProgramacion.isSelected()) {
			frase += " programacion -";
		}if(checkboxDiseño.isSelected()) {
			frase += "diseño -";
		}		
	}


	
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 369, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		ButtonGroup grupoBotones=new ButtonGroup();
		grupoBotones.add(boton1);
		grupoBotones.add(boton2);
		grupoBotones.add(boton3);
			
		boton1.setBounds(17, 66, 109, 23);
		frame.getContentPane().add(boton1);
		
		boton2.setBounds(17, 93, 109, 23);
		frame.getContentPane().add(boton2);
		
		boton3.setBounds(17, 119, 109, 23);
		frame.getContentPane().add(boton3);
		

		JLabel lblNewLabel = new JLabel("Sistema");
		lblNewLabel.setBounds(16, 36, 110, 23);
		frame.getContentPane().add(lblNewLabel);
		
		
		checkboxProgramacion.setBounds(227, 66, 125, 23);
		frame.getContentPane().add(checkboxProgramacion);
		

		checkboxDiseño.setBounds(227, 92, 125, 23);
		frame.getContentPane().add(checkboxDiseño);
		

		checkboxAdministracion.setBounds(227, 118, 125, 23);
		frame.getContentPane().add(checkboxAdministracion);
		
		JLabel lblNewLabel_1 = new JLabel("Sistema");
		lblNewLabel_1.setBounds(227, 36, 110, 23);
		frame.getContentPane().add(lblNewLabel_1);
	
		
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(2);
		slider.setPaintTicks(true);
		slider.setToolTipText("");
		slider.setMaximum(10);
		slider.setValue(5);
		slider.setBounds(67, 222, 200, 45);
		frame.getContentPane().add(slider);
		
		JLabel lblNewLabel_1_1 = new JLabel("Horas al ordenador");
		lblNewLabel_1_1.setBounds(129, 187, 110, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		
		
		JButton btnNewButton = new JButton("Validar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				validateRadioButton();
				validateCheckBox();
				
				frase += "\nHoras al ordenador: " + slider.getValue() + " H";
				
				
				
				JOptionPane.showMessageDialog(null, frase);
			}
		});
		btnNewButton.setBounds(129, 299, 89, 23);
		frame.getContentPane().add(btnNewButton);
					
	}
	
	

}
