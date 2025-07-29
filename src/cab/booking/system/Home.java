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
        JMenu m3 = new JMenu("BOOK INTERCITY CAB");
        m3.setForeground(Color.BLUE);
        menuBar.add(m3);

        JMenuItem mi8 = new JMenuItem("VIEW CABS");
        JMenuItem mi9 = new JMenuItem("BOOK CAB");
        JMenuItem mi10 = new JMenuItem("VIEW BOOKED CAB");

        m3.add(mi8);
        m3.add(mi9);
        m3.add(mi10);

        mi8.addActionListener(ae -> new ViewCabs().setVisible(true));
        mi9.addActionListener(ae -> new BookIntercityCab(username).setVisible(true));
        mi10.addActionListener(ae -> new ViewInterCityBookedCab(username).setVisible(true));
        JMenu m8 = new JMenu("TRANSPORT");
        m8.setForeground(Color.RED);
        menuBar.add(m8);

        JMenuItem mi16 = new JMenuItem("BOOK PACKAGE");
        JMenuItem mi17 = new JMenuItem("VIEW BOOKED PACKAGE");

        m8.add(mi16);
        m8.add(mi17);

        mi16.addActionListener(ae -> new Trucking(username).setVisible(true));
        mi17.addActionListener(ae -> new ViewTruckingDetails(username).setVisible(true));
        JMenu m9 = new JMenu("BILL");
        m9.setForeground(Color.BLUE);
        menuBar.add(m9);

        JMenuItem mi18 = new JMenuItem("CHECK BILL");
        m9.add(mi18);

        mi18.addActionListener(ae -> new CheckBill(username).setVisible(true));
        JMenu m5 = new JMenu("PAYMENT");
        m5.setForeground(Color.RED);
        menuBar.add(m5);

        JMenuItem mi12 = new JMenuItem("PAY THE PAYTM");
        m5.add(mi12);

        mi12.addActionListener(ae -> new Payment().setVisible(true));
        JMenu m6 = new JMenu("UTILITY");
        m6.setForeground(Color.BLUE);
        menuBar.add(m6);

        JMenuItem mi13 = new JMenuItem("NOTEPAD");
        JMenuItem mi14 = new JMenuItem("CALCULATOR");

        m6.add(mi13);
        m6.add(mi14);

        mi13.addActionListener(ae -> {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {}
        });

        mi14.addActionListener(ae -> {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {}
        });
        JMenu m7 = new JMenu("ABOUT");
        m7.setForeground(Color.RED);
        menuBar.add(m7);

        JMenuItem mi15 = new JMenuItem("ABOUT");
        m7.add(mi15);

        mi15.addActionListener(ae -> new About().setVisible(true));
