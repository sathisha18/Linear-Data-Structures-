import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefild;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 491, 405);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(116, 11, 246, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(79, 59, 159, 18);
		contentPane.add(lblNewLabel_1);
		
		sizefild = new JTextField();
		sizefild.setBounds(266, 56, 96, 20);
		contentPane.add(sizefild);
		sizefild.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack creation code
				size = Integer.valueOf(sizefild.getText());
				s=new int[size];
				String message = "Stack of size"+size+"Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		stack.setForeground(new Color(148, 0, 211));
		stack.setFont(new Font("Constantia", Font.BOLD, 14));
		stack.setBounds(164, 97, 159, 27);
		contentPane.add(stack);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(63, 160, 140, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(213, 157, 96, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.setForeground(new Color(128, 0, 0));
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push creation code
				int elem;
				if(top==size-1)
				{
				 JOptionPane.showMessageDialog(contentPane, "push not pasible");
				}
				else
				{
				     elem =Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "push succesfull");
					element.setText("");
				}
			}
		});
		push.setFont(new Font("Constantia", Font.BOLD, 14));
		push.setBounds(333, 156, 89, 27);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop creation code
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "pop not pasible");
				}
				else
				{
					String massage = "Element deleted is  :"+s[top];
					JOptionPane.showMessageDialog(contentPane, massage);
					--top;
					
				}
			}
		});
		pop.setForeground(new Color(255, 0, 0));
		pop.setFont(new Font("Constantia", Font.BOLD, 14));
		pop.setBounds(192, 207, 89, 27);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.setForeground(new Color(128, 0, 128));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display creation code
				String msg ="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "display not pasible");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						msg = msg+" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(190, 267, 91, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(116, 319, 264, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 18));
		btnNewButton.setBounds(10, 253, 111, 31);
		contentPane.add(btnNewButton);
	}
}
