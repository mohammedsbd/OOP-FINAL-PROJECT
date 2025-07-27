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

}
