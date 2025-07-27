package cab.booking.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
        private JButton b1,b2,b3;

        public Login(){
            setBackground(new Color(255, 255, 204));	
        setBounds(550, 250, 700, 500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

         ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("cab/booking/System/icons/login.jpg"));
        Image i1 = c1.getImage().getScaledInstance(700, 700,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        
        JLabel l6 = new JLabel(i2);
        l6.setBounds(0, 50, 700, 450);
        add(l6);
        JLabel l1 = new JLabel("Username : ");
	l1.setBounds(324, 0, 95, 24);
	l6.add(l1);

	JLabel l2 = new JLabel("Password : ");
	l2.setBounds(324, 40, 95, 24);
	l6.add(l2);

	textField = new JTextField();
	textField.setBounds(420, 0, 157, 20);
	l6.add(textField);

    passwordField = new JPasswordField();
	passwordField.setBounds(420, 40, 157, 20);
	l6.add(passwordField)

    b1 = new JButton("Login");
	b1.addActionListener(this);
                
	b1.setForeground(new Color(46, 139, 87));
	b1.setBackground(new Color(176, 224, 230));
	b1.setBounds(324, 80, 113, 25);
	l6.add(b1);

     b2 = new JButton("SignUp");
	b2.addActionListener(this);
	
	b2.setForeground(new Color(139, 69, 19));
	b2.setBackground(new Color(255, 235, 205));
	b2.setBounds(460, 80, 113, 25);
	l6.add(b2);

	b3 = new JButton("Forgot Password");
	b3.addActionListener(this);
        b3.setForeground(new Color(205, 92, 92));
	b3.setBackground(new Color(253, 245, 230));
	b3.setBounds(360, 120, 179, 25);
	l6.add(b3);
        }
}