package cab.booking.system;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
import javax.swing.*;


public class BookIntercityCab extends JFrame{
     JTable table;
    JLabel ReservationDetails,Source,Destination;
    JButton show, b1, b2;
    Choice c1, c2;
}
public static void main(String[] args){
        new BookIntercityCab("");
    }

    public BookIntercityCab(String username){
        
        setTitle("Book Cab");
  getContentPane().setBackground(Color.WHITE);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ReservationDetails = new JLabel("BOOK INTERCITY CAB");
  ReservationDetails.setForeground(Color.BLUE);
  ReservationDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
  ReservationDetails.setBounds(280, 27, 359, 31);
  add(ReservationDetails);

  setLayout(null);
    
  Source = new JLabel("SOURCE");
  Source.setFont(new Font("Tahoma", Font.PLAIN, 19));
  Source.setBounds(60, 100, 70, 27);
  add(Source);
  
        Destination = new JLabel("DESTINATION");
  Destination.setFont(new Font("Tahoma", Font.PLAIN, 19));
  Destination.setBounds(350, 100, 150, 27);
  add(Destination);