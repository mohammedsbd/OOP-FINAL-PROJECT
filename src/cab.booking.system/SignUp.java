package cab.booking.system;

import java.awt.*;//help us cretae graphical usr interface(gui)
import javax.swing.*;
import java.sql.*;//to connect to the database
import java.awt.event.*;//to handle events
import javax.swing.border.*;//to add border layout






public class Signup extends JFrame implements ActionListener{
     private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton b1, b2;
    private JComboBox comboBox;

     public static void main(String[] args) {
        new Signup().setVisible(true);
    }

    public Signup(){
        setBounds(600, 250, 700, 406);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);
    }
JLabel lblUsername = new JLabel("Username :");
	lblUsername.setForeground(Color.DARK_GRAY);
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblUsername.setBounds(99, 86, 92, 26);
	contentPane.add(lblUsername);
}
