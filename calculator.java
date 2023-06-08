package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private double answer,number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void addInput(String str) {
		input.setText(input.getText() + str);
	}
	public void calculate() {
		switch(operation) {
		case 1:
			answer=number+Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer=number-Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer=number*Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer=number/Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		}
	}
	/**
	 * Create the frame.
	 */
	public calculator() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(6, 6, 319, 57);
		contentPane.add(screen);
		
		JLabel lbl = new JLabel("");
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		screen.add(lbl);
		
		input = new JTextField();
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		screen.add(input);
		input.setColumns(20);
		
		JPanel control = new JPanel();
		control.setBounds(6, 70, 319, 317);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("+");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number= Double.parseDouble(input.getText());
				operation=1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
				
			}
		});
		btnNewButton_6.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("6");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_5);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number= Double.parseDouble(input.getText());
				operation=2;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_9.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_9);
		
		JButton btnNewButton_7 = new JButton("3");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_7.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_10.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("*");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number= Double.parseDouble(input.getText());
				operation=3;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_12.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_11.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		btnNewButton_13.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_13);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnC.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnC);
		
		JButton btnNewButton_15 = new JButton("%");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number= Double.parseDouble(input.getText());
				operation=4;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_15.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		control.add(btnNewButton_15);
	}
}
