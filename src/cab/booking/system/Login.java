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
        }
}