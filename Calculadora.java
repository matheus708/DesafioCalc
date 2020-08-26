package semestre2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textResultado;
	protected double Valor1, Valor2;
	protected String sinal;

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
		setTitle("Calc2");
		
		 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textResultado = new JTextField();
		textResultado.setBounds(0, 0, 231, 56);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResultado.setText(textResultado.getText()+"7");
			}
		});
		button_7.setBounds(0, 56, 71, 64);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+"8");
			}
		});
		button_8.setBounds(71, 56, 71, 64);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+"9");
			}
		});
		button_9.setBounds(142, 56, 71, 64);
		contentPane.add(button_9);
		
		JButton button_mais = new JButton("+");
		button_mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				sinal = "soma";
			}
		});
		button_mais.setBounds(213, 56, 71, 64);
		contentPane.add(button_mais);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+"4");
			}
		});
		button_4.setBounds(0, 120, 71, 64);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+"5");
			}
		});
		button_5.setBounds(71, 120, 71, 64);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+"6");
			}
		});
		button_6.setBounds(142, 120, 71, 64);
		contentPane.add(button_6);
		
		JButton button_menos = new JButton("-");
		button_menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				sinal = "menos";
			}
		});
		button_menos.setBounds(213, 120, 71, 64);
		contentPane.add(button_menos);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+"0");
				
			}
		});
		button_0.setBounds(0, 248, 71, 64);
		contentPane.add(button_0);
		
		JButton button_ponto = new JButton(".");
		button_ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+".");
			}
		});
		button_ponto.setBounds(71, 248, 71, 64);
		contentPane.add(button_ponto);
		
		JButton button_divisão = new JButton("/");
		button_divisão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				sinal = "divisão";
			}
		});
		button_divisão.setBounds(142, 248, 71, 64);
		contentPane.add(button_divisão);
		
		JButton button_igual = new JButton("=");
		button_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valor2 = Double.parseDouble(textResultado.getText());
				if(sinal == "soma"){
					textResultado.setText(String.valueOf(Valor1 + Valor2));
				}
				if(sinal == "menos"){
					textResultado.setText(String.valueOf(Valor1 - Valor2));
				}
				if(sinal == "vezes"){
					textResultado.setText(String.valueOf(Valor1 * Valor2));
				}
				if(sinal == "divisão"){
					textResultado.setText(String.valueOf(Valor1 / Valor2));
				}
			}
		});
		button_igual.setBounds(213, 248, 71, 64);
		contentPane.add(button_igual);
		
		JButton button_vezes = new JButton("*");
		button_vezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				sinal = "vezes";
			}
		});
		button_vezes.setBounds(213, 184, 71, 64);
		contentPane.add(button_vezes);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+"3");
			}
		});
		button_3.setBounds(142, 184, 71, 64);
		contentPane.add(button_3);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textResultado.setText(textResultado.getText()+"2");
			}
		});
		button_2.setBounds(71, 184, 71, 64);
		contentPane.add(button_2);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+"1");
			}
		});
		button_1.setBounds(0, 184, 71, 64);
		contentPane.add(button_1);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText("");
			}
		});
		btnC.setBounds(232, 0, 52, 56);
		contentPane.add(btnC);
	}
}
