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
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu m1 = new JMenu("CUSTOMER");
        m1.setForeground(Color.BLUE);
        menuBar.add(m1);

        JMenuItem mi1 = new JMenuItem("ADD CUSTOMER");
        JMenuItem mi2 = new JMenuItem("UPDATE CUSTOMER DETAIL");
        JMenuItem mi3 = new JMenuItem("VIEW CUSTOMER DETAILS");
        JMenuItem mi4 = new JMenuItem("DELETE CUSTOMER DETAILS");

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);

        mi1.addActionListener(ae -> new AddCustomer(username).setVisible(true));
        mi2.addActionListener(ae -> new UpdateCustomer(username).setVisible(true));
        mi3.addActionListener(ae -> new ViewCustomer().setVisible(true));
        mi4.addActionListener(ae -> new DeleteCustomer().setVisible(true));
        JMenu m2 = new JMenu("BOOK INTRACITY CAB");
        m2.setForeground(Color.RED);
        menuBar.add(m2);

        JMenuItem mi7 = new JMenuItem("BOOK CAB");
        JMenuItem mi5 = new JMenuItem("VIEW BOOKED CAB");
        m2.add(mi7);
        m2.add(mi5);

        mi7.addActionListener(ae -> new BookCab(username).setVisible(true));
        mi5.addActionListener(ae -> new ViewBookedCab(username).setVisible(true));
