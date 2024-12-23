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

public class CIRCULARQUEUE extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CIRCULARQUEUE frame = new CIRCULARQUEUE();
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
	public CIRCULARQUEUE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 513, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_3 = new JPanel();
		contentPane_3.setLayout(null);
		contentPane_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_3.setBackground(new Color(0, 0, 255));
		contentPane_3.setBounds(0, 0, 499, 364);
		contentPane.add(contentPane_3);
		
		JLabel lblStackCircularQueue = new JLabel(" CIRCULAR QUEUE DATA STRUCTURE");
		lblStackCircularQueue.setForeground(Color.RED);
		lblStackCircularQueue.setFont(new Font("Algerian", Font.BOLD, 20));
		lblStackCircularQueue.setBounds(85, 11, 353, 27);
		contentPane_3.add(lblStackCircularQueue);
		
		JLabel lblNewLabel_1_2 = new JLabel("ENTER THE QUEUE SIZE");
		lblNewLabel_1_2.setForeground(new Color(0, 255, 0));
		lblNewLabel_1_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(71, 59, 165, 18);
		contentPane_3.add(lblNewLabel_1_2);
		
		sizefield = new JTextField();
		sizefield.setColumns(10);
		sizefield.setBounds(261, 56, 96, 20);
		contentPane_3.add(sizefield);
		
		JButton sizefild = new JButton("CREATE QUEUE");
		sizefild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//circularqueue creation code
				size = Integer.valueOf(sizefield.getText());
				cq=new int[size];
				String message = "Queue of size"+size+"Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		sizefild.setForeground(new Color(178, 34, 34));
		sizefild.setFont(new Font("Constantia", Font.BOLD, 14));
		sizefild.setBounds(173, 93, 155, 27);
		contentPane_3.add(sizefild);
		
		JLabel lblNewLabel_2_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(58, 145, 140, 18);
		contentPane_3.add(lblNewLabel_2_2);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(217, 142, 96, 20);
		contentPane_3.add(element);
		
		JButton insert = new JButton("INSERT\r\n");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert creation code
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane, "insert not pasible");
				}
				else
				{
					int elem =Integer.valueOf(element.getText());
					JOptionPane.showMessageDialog(contentPane, "inserted succesfull");
					element.setText("");
					r=(r+1)%size;
					cq[r]=elem;
					count++;
				}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(347, 141, 89, 27);
		contentPane_3.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deleted code
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "delete not pasible");
				}
				else
				{
					String massage = "Element deleted is  :"+cq[f];
					JOptionPane.showMessageDialog(contentPane, massage);
					f=(f+1)%size;
					count++;
				}	
			}
		});
		delete.setForeground(new Color(220, 20, 60));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(192, 192, 108, 23);
		contentPane_3.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.setForeground(new Color(165, 42, 42));
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code
				String msg = "";
				int f1=f;
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "display not pasible");
				}
				else
				{
					for(int i=1;i<=count;i++)
					{
						msg = msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(190, 250, 110, 27);
		contentPane_3.add(display);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(122, 301, 264, 20);
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
		btnNewButton_6.setBounds(22, 250, 111, 31);
		contentPane_3.add(btnNewButton_6);
	}

}
