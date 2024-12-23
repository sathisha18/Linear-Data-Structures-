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
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class SINGLYLINKEDLIST extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField displaybox;
	class Node
	{
		int data;
		Node link;
	}
	private Node first;
	//private Scanner scan = new Scanner(System.in);
	int elem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SINGLYLINKEDLIST frame = new SINGLYLINKEDLIST();
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
	public SINGLYLINKEDLIST() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 540, 402);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTER");
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 19));
		lblNewLabel.setBounds(95, 11, 378, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(35, 56, 149, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(35, 99, 149, 18);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(216, 53, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(216, 96, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rare code
				Node temp;
				int elem = Integer.valueOf(textField.getText());
				//JOptionPane.showMessageDialog(contentPane,"insertrear succesfull");
				Node newnode = new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
				}
				textField.setText("");
				JOptionPane.showMessageDialog(contentPane,"insertrear succesfull");
				
			}
		});
		insertrear.setForeground(new Color(220, 20, 60));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 14));
		insertrear.setBounds(348, 52, 149, 27);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front code
				int elem = Integer.valueOf(textField_1.getText());
				JOptionPane.showMessageDialog(contentPane,"insertfront succesfull");
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.link=first;
					first=newnode;
				}
				textField_1.setText("");
				
			}
		});
		insertfront.setForeground(new Color(30, 144, 255));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 14));
		insertfront.setBounds(348, 95, 149, 27);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete rear code
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "deletion not pasible");
				}
				else if(first.link==null)
				{
					//String deleterear = "Element deleted is  :"+first.data;
					JOptionPane.showMessageDialog(contentPane, "element deleted is" +first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					//String deleterear = "Element deleted is  :"+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, "element deleted is " +temp.link.data);
					temp.link=null;
				}
			}
		});
		deleterear.setForeground(new Color(0, 0, 205));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 14));
		deleterear.setBounds(195, 156, 149, 27);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete front code
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "deletion not pasible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is" +first.data);
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is" +first.data);
					first=first.link;
				}
			}
		});
		deletefront.setForeground(new Color(123, 104, 238));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 14));
		deletefront.setBounds(195, 209, 149, 27);
		contentPane.add(deletefront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code
				String msg="";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "display not pasible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg= msg+" "+temp.data;
						temp=temp.link;
					}
					displaybox.setText(msg);
					//displaybox.setText("");
				}
			}
		});
		display.setForeground(new Color(138, 43, 226));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(195, 262, 149, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(153, 315, 259, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
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
		btnNewButton_6.setBounds(22, 242, 111, 31);
		contentPane.add(btnNewButton_6);
	}
}
