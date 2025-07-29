package cab.booking.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame {
    String username;

    public static void main(String[] args) {
        new Home("").setVisible(true);
    }
    public Home(String username) {
        super("Cab Booking System");
        this.username = username;
        setForeground(Color.CYAN);
        setLayout(null); 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        JLabel l1 = new JLabel("Transpo Cab");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 55));
        l1.setBounds(780, 60, 1000, 100);
        NewLabel.add(l1);
