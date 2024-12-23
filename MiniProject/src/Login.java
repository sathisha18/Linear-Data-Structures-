import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userTextField;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		userTextField = new JTextField();
		userTextField.setBounds(152, 55, 150, 30);
		contentPane.add(userTextField);
		
		passwordField = new JTextField();
		passwordField.setBounds(152, 116, 150, 30);
		contentPane.add(passwordField);
		
		JLabel userLabel = new JLabel("USERNAME");
		userLabel.setBounds(63, 55, 79, 30);
		contentPane.add(userLabel);
		
		JLabel passwordLabel = new JLabel("PASSWORD");
		passwordLabel.setBounds(58, 116, 73, 30);
		contentPane.add(passwordLabel);
		
		JCheckBox showPassword = new JCheckBox("Show Password");
		showPassword.setBounds(152, 153, 150, 30);
		contentPane.add(showPassword);
		
		JButton loginButton = new JButton("LOGIN");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Coding Part of LOGIN button
		        if (e.getSource() == loginButton) {
		            String userText;
		            String pwdText;
		            userText = userTextField.getText();
		            pwdText = passwordField.getText();
		            if (userText.equalsIgnoreCase("sathish") && pwdText.equalsIgnoreCase("123")) {
		              // JOptionPane.showMessageDialog(this, "Login Successful");
		               JOptionPane.showMessageDialog(contentPane, "Login Successful");
		            } else {
		                //JOptionPane.showMessageDialog(this, "Invalid Username or Password");
		            	JOptionPane.showMessageDialog(contentPane, "Invalid Username or Password");
		            }
		        }
//		        //Coding Part of RESET button
//		       // if (e.getSource() == resetButton) {
//		            userTextField.setText("");
//		            passwordField.setText("");
//		       // }
		       //Coding Part of showPassword JCheckBox
		        if (e.getSource() == showPassword) {
		            if (showPassword.isSelected()) {
		                //passwordField.setEchoChar((char) 0);
		      
		            } else {
		               //passwordField.setEchoChar('*');
		            }
		        }
			}
		});
		loginButton.setBounds(58, 204, 100, 30);
		contentPane.add(loginButton);
		JButton resetButton = new JButton("RESET");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Coding Part of RESET button
			       if (e.getSource() == resetButton) {
			            userTextField.setText("");
			            passwordField.setText("");
			       }
			}
		});
		resetButton.setBounds(216, 204, 100, 30);
		contentPane.add(resetButton);
	}
}
  class Login1 {
    public static void main(String[] a) {
        Login frame = new Login();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
