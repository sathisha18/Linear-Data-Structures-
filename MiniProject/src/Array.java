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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deleteposition;
	private JTextField insertposition;
	private JTextField displaybox;
	private int arr[];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//this.setVisible(false);
		//this.dispose();
		setBounds(100, 100, 605, 361);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(197, 11, 201, 22);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH :");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(120, 52, 166, 18);
		contentPane.add(lblNewLabel_1);

		length = new JTextField();
		length.setBounds(296, 49, 96, 20);
		contentPane.add(length);
		length.setColumns(10);

		JButton create = new JButton("CREATE ARRAY");
		create.setBackground(new Color(0, 255, 255));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
				//				String len = length.getText();
				//				int l = Integer.valueOf(len);
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				String message = "Array of length"+len+"Created";
				JOptionPane.showMessageDialog(contentPane, message);
				//				element.setText("");
				//				length.setText("");
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setForeground(new Color(255, 0, 255));
		create.setBounds(197, 81, 176, 27);
		contentPane.add(create);

		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTEGER ELEMENT");
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 139, 175, 17);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setBounds(190, 135, 96, 20);
		contentPane.add(element);
		element.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("POSITION");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_3.setBounds(312, 140, 61, 15);
		contentPane.add(lblNewLabel_3);

		JButton insert = new JButton("INSERT");
		insert.setBackground(new Color(216, 191, 216));
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for inserting an array
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				element.setText("");
				String message="Element"+elem+"Inserted @ positoin"+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		insert.setForeground(new Color(153, 0, 0));
		insert.setFont(new Font("Constantia", Font.BOLD, 12));
		insert.setBounds(492, 132, 89, 23);
		contentPane.add(insert);

		JLabel lblNewLabel_4 = new JLabel("ENTER THE POSITION");
		lblNewLabel_4.setForeground(new Color(255, 255, 0));
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_4.setBounds(62, 197, 131, 15);
		contentPane.add(lblNewLabel_4);

		deleteposition = new JTextField();
		deleteposition.setBounds(203, 192, 96, 20);
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);

		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos = Integer.valueOf(deleteposition.getText());
				arr[pos] = 0;
				String message = "Element Deleted @ the position"+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		btnNewButton_1.setForeground(new Color(51, 0, 255));
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton_1.setBounds(329, 193, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("DISPLAY");
		btnNewButton_2.setBackground(new Color(175, 238, 238));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg = "";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg =msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		btnNewButton_2.setForeground(new Color(51, 51, 255));
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton_2.setBounds(249, 239, 89, 23);
		contentPane.add(btnNewButton_2);

		insertposition = new JTextField();
		insertposition.setBounds(383, 135, 96, 20);
		contentPane.add(insertposition);
		insertposition.setColumns(10);

		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 255, 255));
		displaybox.setBounds(135, 280, 315, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);

		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
				dispose();
			   // setVisible(false);
				//Home home = new Home();
				//home.setVisible(true);
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				//System.exit(DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 18));
		btnNewButton.setBounds(20, 11, 111, 31);
		contentPane.add(btnNewButton);
	}
	
}
