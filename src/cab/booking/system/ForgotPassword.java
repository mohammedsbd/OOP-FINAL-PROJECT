
package cab.booking.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

public class ForgotPassword extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5;
    private JButton b1,b2,b3;

      public static void main(String[] args) {
	new ForgotPassword().setVisible(true);
    }

    public ForgotPassword(){
         setBounds(500, 200, 850, 400);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

    JLabel l1 = new JLabel("Username");
	l1.setFont(new Font("Tahoma", Font.BOLD, 13));
	l1.setBounds(109, 83, 87, 29);
	contentPane.add(l1);

    }
}