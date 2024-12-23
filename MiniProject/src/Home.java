 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Home extends JFrame {

	private JPanel array;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//System.exit(0);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//this.setVisible(false);
		//this.dispose();
		setBounds(100, 100, 745, 450);
		array = new JPanel();
		array.setFont(new Font("Constantia", Font.BOLD, 16));
		array.setBackground(new Color(255, 255, 0));
		array.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(array);
		
		JButton stack = new JButton("STACK");
		stack.setBounds(127, 141, 89, 36);
		stack.setBackground(new Color(0, 0, 0));
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //place stack window opening code hear
				new Stack().setVisible(true);
			   dispose();

				
			}
		});
		array.setLayout(null);
		stack.setFont(new Font("Constantia", Font.BOLD, 14));
		stack.setForeground(new Color(255, 0, 128));
		array.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.setBounds(477, 141, 89, 36);
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// place queue window opening code hear
				new QUEUE().setVisible(true);
				dispose();
				
			}
		});
		queue.setBackground(new Color(0, 0, 0));
		queue.setForeground(new Color(255, 0, 0));
		queue.setFont(new Font("Constantia", Font.BOLD, 14));
		array.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.setBounds(77, 231, 169, 36);
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //place circular queue window opening code hear
				new CIRCULARQUEUE().setVisible(true);
				dispose();
				
			}
		});
		cqueue.setBackground(new Color(0, 0, 0));
		cqueue.setForeground(new Color(0, 0, 255));
		cqueue.setFont(new Font("Constantia", Font.BOLD, 14));
		array.add(cqueue);
		
		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.setBounds(456, 230, 191, 39);
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //place singly linked  window opening code hear
				new SINGLYLINKEDLIST().setVisible(true);
				dispose();
				
			}
		});
		sll.setBackground(new Color(0, 0, 0));
		sll.setForeground(new Color(0, 0, 255));
		sll.setFont(new Font("Constantia", Font.BOLD, 14));
		array.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.setBounds(246, 321, 217, 36);
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //place doubly linked window opening code hear
				new DOUBLYLINKEDLIST().setVisible(true);
				dispose();
				
			}
		});
		dll.setBackground(new Color(0, 0, 0));
		dll.setForeground(new Color(255, 0, 255));
		dll.setFont(new Font("Constantia", Font.BOLD, 14));
		array.add(dll);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setBounds(191, 24, 336, 28);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 22));
		array.add(lblNewLabel);
		
		JButton btnArray = new JButton("ARRAY");
		btnArray.setBounds(279, 86, 119, 36);
		btnArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Array().setVisible(true);
				//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				dispose();
			    //setVisible(true);
				//Home home = new Home();
				//home.setVisible(false);
				
				}
		});
		btnArray.setForeground(Color.RED);
		btnArray.setFont(new Font("Constantia", Font.BOLD, 14));
		btnArray.setBackground(Color.BLACK);
		array.add(btnArray);
		
	}
}
