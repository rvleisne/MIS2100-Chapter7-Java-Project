package Leisner.Raquel.Chapter7.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(171, 16, 130, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 54, 130, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numerator");
		lblNewLabel.setBounds(35, 21, 124, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominator");
		lblNewLabel_1.setBounds(35, 59, 124, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setBounds(48, 123, 61, 16);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Calculate");

		btnNewButton.setBounds(184, 146, 117, 29);
		panel.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double numerator = Double.parseDouble(textField.getText());
				double denominator = Double.parseDouble(textField_1.getText());
				
				SimpleMath simpleMath = new SimpleMath();
				Double result = simpleMath.divide(numerator,  denominator);
				
				try {
					lblNewLabel_2.setText(result.toString());
					
				} catch(ArithmeticException k){
					lblNewLabel_2.setText("Cannot divide by zero");
				}
				
			}
		});
	}
}
