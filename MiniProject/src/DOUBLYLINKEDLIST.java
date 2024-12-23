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

public class DOUBLYLINKEDLIST extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField displaybox;
	class Node
	{
		int data;
		Node prelink;
		Node nextlink;
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
					DOUBLYLINKEDLIST frame = new DOUBLYLINKEDLIST();
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
	public DOUBLYLINKEDLIST() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 537, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(255, 127, 80));
		contentPane_1.setBounds(0, 11, 526, 365);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTER");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(107, 11, 293, 20);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1.setForeground(new Color(199, 21, 133));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(35, 56, 149, 18);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(35, 99, 149, 18);
		contentPane_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(216, 53, 96, 20);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(216, 96, 96, 20);
		contentPane_1.add(textField_1);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rear code
				Node temp;
				int elem = Integer.valueOf(textField.getText());
				//JOptionPane.showMessageDialog(contentPane,"insertrear succesfull");
				Node newnode = new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					temp.prelink= temp;
				}
				textField.setText("");
				JOptionPane.showMessageDialog(contentPane,"insertrear succesfull");
				
			}
		});
		insertrear.setForeground(new Color(75, 0, 130));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 14));
		insertrear.setBounds(348, 52, 125, 27);
		contentPane_1.add(insertrear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front code
				int elem = Integer.valueOf(textField_1.getText());
				JOptionPane.showMessageDialog(contentPane,"insertfront succesfull");
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
				textField_1.setText("");
				
			}
		});
		insertfront.setForeground(new Color(138, 43, 226));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 14));
		insertfront.setBounds(348, 95, 125, 27);
		contentPane_1.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete rear code
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "deletion not pasible");
				}
				else if(first.nextlink==null)
				{
					//String deleterear = "Element deleted is  :"+first.data;
					JOptionPane.showMessageDialog(contentPane, "element deleted is" +first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.nextlink.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					//String deleterear = "Element deleted is  :"+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, "element deleted is " +temp.nextlink.data);
					temp.nextlink=null;
				}
			}
		});
		deleterear.setForeground(new Color(123, 104, 238));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 14));
		deleterear.setBounds(205, 150, 139, 27);
		contentPane_1.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete front code
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "deletion not pasible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is" +first.data);
					first=null;
				}
				else
				{
					//JOptionPane.showMessageDialog(contentPane, "element deleted is" +first.data);
					first=first.nextlink;
				     first.prelink=null;
				}
			}
		});
		deletefront.setForeground(new Color(0, 0, 255));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 14));
		deletefront.setBounds(205, 202, 139, 27);
		contentPane_1.add(deletefront);
		
		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display forward code
				String msg="";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "display not pasible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg= msg+" "+temp.data;
						temp=temp.nextlink;
					}
					displaybox.setText(msg);
				}
			}
			
		});
		displayforward.setForeground(new Color(186, 85, 211));
		displayforward.setFont(new Font("Constantia", Font.BOLD, 14));
		displayforward.setBounds(49, 264, 169, 27);
		contentPane_1.add(displayforward);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(128, 312, 259, 20);
		contentPane_1.add(displaybox);
		
		JButton displayreveres = new JButton("DISPLAY REVERES");
		displayreveres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display reveres code
				String msg="";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "display not pasible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						msg= msg+" "+temp.data;
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg= msg+" "+temp.data;
						temp=temp.prelink;
						
					}
					displaybox.setText(msg);
				}
			}
		});
		displayreveres.setForeground(new Color(153, 50, 204));
		displayreveres.setFont(new Font("Constantia", Font.BOLD, 14));
		displayreveres.setBounds(313, 264, 157, 27);
		contentPane_1.add(displayreveres);
		
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
		btnNewButton_6.setBounds(35, 184, 111, 31);
		contentPane_1.add(btnNewButton_6);
	}

}
