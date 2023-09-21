package aula3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldValor1;
	private JTextField textFieldValor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor1");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblValor = new JLabel("Valor2");
		lblValor.setBounds(10, 36, 46, 14);
		contentPane.add(lblValor);
		
		JLabel lblNewLabel_1_2 = new JLabel("Resultado");
		lblNewLabel_1_2.setBounds(10, 98, 78, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textFieldValor1 = new JTextField();
		textFieldValor1.setBounds(75, 8, 86, 20);
		contentPane.add(textFieldValor1);
		textFieldValor1.setColumns(10);
		
		textFieldValor2 = new JTextField();
		textFieldValor2.setBounds(75, 33, 86, 20);
		contentPane.add(textFieldValor2);
		textFieldValor2.setColumns(10);
		
		JLabel lblNewLabelResultado = new JLabel("0");
		lblNewLabelResultado.setBounds(115, 98, 101, 14);
		contentPane.add(lblNewLabelResultado);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double v1 = Double.parseDouble(textFieldValor1.getText());
					double v2 = Double.parseDouble(textFieldValor2.getText());
					lblNewLabelResultado.setText((v1+v2)+"");
				}
				catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Erro ao somar: "+e2.getMessage());
				}
			}
		});
		btnNewButton.setBounds(10, 64, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double v1 = Double.parseDouble(textFieldValor1.getText());
					double v2 = Double.parseDouble(textFieldValor2.getText());
					lblNewLabelResultado.setText((v1-v2)+"");
				}
				catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Erro ao subtrair: "+e2.getMessage());
				}
			}
		});
		btnNewButton_1.setBounds(114, 64, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("/");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double v1 = Double.parseDouble(textFieldValor1.getText());
					double v2 = Double.parseDouble(textFieldValor2.getText());
					lblNewLabelResultado.setText((v1/v2)+"");
				}
				catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Erro ao dividir: "+e2.getMessage());
				}
			}
		});
		btnNewButton_1_1.setBounds(213, 64, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("*");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double v1 = Double.parseDouble(textFieldValor1.getText());
					double v2 = Double.parseDouble(textFieldValor2.getText());
					lblNewLabelResultado.setText((v1*v2)+"");
				}
				catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Erro ao multiplicar: "+e2.getMessage());
				}
			}
		});
		btnNewButton_1_1_1.setBounds(312, 64, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
	}
}
