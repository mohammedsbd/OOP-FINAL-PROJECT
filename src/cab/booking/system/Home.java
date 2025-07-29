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
