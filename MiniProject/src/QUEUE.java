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

public class QUEUE extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField sizefild;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QUEUE frame = new QUEUE();
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
	public QUEUE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 576, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(214, 10, 1, 1);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.YELLOW);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(116, 11, 197, 22);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE");
		lblNewLabel_1.setForeground(new Color(128, 0, 255));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(33, 59, 159, 18);
		contentPane_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(217, 56, 96, 20);
		contentPane_1.add(textField);
		
		JButton btnNewButton = new JButton("CREATE STACK");
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(130, 86, 135, 27);
		contentPane_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(52, 134, 140, 18);
		contentPane_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 131, 96, 20);
		contentPane_1.add(textField_1);
		
		JButton btnNewButton_1 = new JButton("PUSH");
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_1.setBounds(337, 126, 89, 27);
		contentPane_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("POP");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_2.setBounds(166, 163, 89, 23);
		contentPane_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DISPLAY");
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_3.setBounds(166, 207, 91, 27);
		contentPane_1.add(btnNewButton_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(99, 259, 264, 20);
		contentPane_1.add(textField_2);
		
		JPanel contentPane_2 = new JPanel();
		contentPane_2.setBounds(220, 10, 1, 1);
		contentPane_2.setLayout(null);
		contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_2.setBackground(Color.YELLOW);
		contentPane.add(contentPane_2);
		
		JLabel lblNewLabel_3 = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel_3.setBounds(116, 11, 197, 22);
		contentPane_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE STACK SIZE");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 255));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(33, 59, 159, 18);
		contentPane_2.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(217, 56, 96, 20);
		contentPane_2.add(textField_3);
		
		JButton btnNewButton_4 = new JButton("CREATE STACK");
		btnNewButton_4.setForeground(Color.MAGENTA);
		btnNewButton_4.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_4.setBounds(130, 86, 135, 27);
		contentPane_2.add(btnNewButton_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2_1.setForeground(Color.BLUE);
		lblNewLabel_2_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(52, 134, 140, 18);
		contentPane_2.add(lblNewLabel_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(217, 131, 96, 20);
		contentPane_2.add(textField_4);
		
		JButton btnNewButton_1_1 = new JButton("PUSH");
		btnNewButton_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(337, 126, 89, 27);
		contentPane_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("POP");
		btnNewButton_2_1.setForeground(Color.RED);
		btnNewButton_2_1.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(166, 163, 89, 23);
		contentPane_2.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("DISPLAY");
		btnNewButton_3_1.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_3_1.setBounds(166, 207, 91, 27);
		contentPane_2.add(btnNewButton_3_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(99, 259, 264, 20);
		contentPane_2.add(textField_5);
		
		JPanel contentPane_3 = new JPanel();
		contentPane_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_3.setBackground(new Color(128, 0, 128));
		contentPane_3.setBounds(0, 11, 562, 422);
		contentPane.add(contentPane_3);
		contentPane_3.setLayout(null);
		
		JLabel lblStackQueueStructure = new JLabel(" QUEUE DATA STRUCTURE");
		lblStackQueueStructure.setBounds(164, 11, 251, 27);
		lblStackQueueStructure.setForeground(Color.RED);
		lblStackQueueStructure.setFont(new Font("Algerian", Font.BOLD, 20));
		contentPane_3.add(lblStackQueueStructure);
		
		JLabel lblNewLabel_1_2 = new JLabel("ENTER THE QUEUE SIZE");
		lblNewLabel_1_2.setBounds(90, 59, 165, 18);
		lblNewLabel_1_2.setForeground(new Color(0, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane_3.add(lblNewLabel_1_2);
		
		sizefild = new JTextField();
		sizefild.setBounds(281, 56, 96, 20);
		sizefild.setColumns(10);
		contentPane_3.add(sizefild);
		
		JButton btnNewButton_5 = new JButton("CREATE QUEUE");
		btnNewButton_5.setBounds(189, 98, 156, 27);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//queue creation code
				size = Integer.valueOf(sizefild.getText());
				q=new int[size];
				String message = "Queue of size"+size+"Created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		btnNewButton_5.setForeground(new Color(0, 0, 128));
		btnNewButton_5.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane_3.add(btnNewButton_5);
		
		JLabel lblNewLabel_2_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2_2.setBounds(78, 166, 140, 18);
		lblNewLabel_2_2.setForeground(new Color(255, 69, 0));
		lblNewLabel_2_2.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane_3.add(lblNewLabel_2_2);
		
		element = new JTextField();
		element.setBounds(228, 163, 96, 20);
		element.setColumns(10);
		contentPane_3.add(element);
		
		JButton insert = new JButton("INSERT\r\n");
		insert.setForeground(new Color(128, 0, 0));
		insert.setBounds(354, 162, 89, 27);
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push creation code
				int elem;
				if(r==size-1)
				{
					 JOptionPane.showMessageDialog(contentPane, "insert not pasible");
				}
				else
				{
					elem =Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "inserted succesfull");
					element.setText("");
				}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane_3.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.setBounds(217, 221, 107, 27);
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop creation code
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "delete not pasible");
				}
				else
				{
					String massage = "Element deleted is  :"+q[f];
					JOptionPane.showMessageDialog(contentPane, massage);
					++f;
				}	
			}
		});
		delete.setForeground(new Color(255, 0, 0));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane_3.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.setForeground(new Color(0, 0, 128));
		display.setBounds(217, 289, 107, 27);
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display creation code
				String msg = "";
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "display not pasible");
				}
				else
				{
					for(int i=f;i<=r;i++)
					{
						msg = msg+" "+q[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane_3.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(132, 343, 264, 20);
		displaybox.setColumns(10);
		contentPane_3.add(displaybox);
		
		JButton btnNewButton_6 = new JButton("HOME");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_6.setForeground(new Color(128, 0, 128));
		btnNewButton_6.setFont(new Font("Constantia", Font.BOLD, 18));
		btnNewButton_6.setBounds(441, 331, 111, 31);
		contentPane_3.add(btnNewButton_6);
	}
}
