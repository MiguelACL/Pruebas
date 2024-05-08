import java.awt.EventQueue;
import javax.swing.border.*; 

import javax.swing.JFrame;
import javax.swing.UIManager;

import com.formdev.flatlaf.*;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
public class UI_Pruebas {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatIntelliJLaf.setup();
		//redondear bordes
		UIManager.put( "Button.arc", 15 );
		UIManager.put( "Component.arc", 15 );
		UIManager.put( "CheckBox.arc", 15 );
		UIManager.put( "ProgressBar.arc", 15 );
		UIManager.put( "TextComponent.arc", 5 );
		UIManager.put( "Pane.arc", 5 );
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Pruebas window = new UI_Pruebas();
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
	public UI_Pruebas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 829, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(156, 67, 496, 330);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setBounds(205, 39, 87, 32);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 26));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(135, 101, 241, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 175, 241, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce tu nombre");
		lblNewLabel_1.setBounds(135, 82, 119, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Introduce tu contraseña");
		lblNewLabel_1_1.setBounds(135, 156, 157, 14);
		panel.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(205, 230, 89, 23);
		panel.add(btnNewButton);
	}
}
