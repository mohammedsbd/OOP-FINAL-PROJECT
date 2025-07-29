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


   c1 = new Choice();
        c1.setBounds(150, 100, 150, 27);
        add(c1);
        
  c2 = new Choice();
        c2.setBounds(500, 100, 150, 27);
        add(c2);
        
        JLabel l9 = new JLabel("Name : ");
  l9.setFont(new Font("Tahoma", Font.PLAIN, 19));
  l9.setBounds(50, 150, 250, 27);
  add(l9);
        
        JLabel l10 = new JLabel("");
  l10.setFont(new Font("Tahoma", Font.PLAIN, 19));
  l10.setBounds(200, 150, 150, 27);
  add(l10);
        
        JLabel l11 = new JLabel("Username : ");
  l11.setFont(new Font("Tahoma", Font.PLAIN, 19));
  l11.setBounds(50, 200, 150, 27);
  add(l11);
        
        JLabel l12 = new JLabel("");
  l12.setFont(new Font("Tahoma", Font.PLAIN, 19));
  l12.setBounds(200, 200, 350, 27);
  add(l12);


  try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select DISTINCT source, destination from intercity");
            while(rs.next()){
                c1.add(rs.getString("source"));
                c2.add(rs.getString("destination"));
            }
            
            rs = c.s.executeQuery("select * from account where username = '"+username+"'");
            while(rs.next()){
                l10.setText(rs.getString("name"));
                l12.setText(username);
            }

            rs.close();
        }catch(SQLException e){}
        
        
        JLabel l1 = new JLabel("Type : ");
  l1.setFont(new Font("Tahoma", Font.PLAIN, 19));
  l1.setBounds(50, 250, 150, 27);
  add(l1);
        
        Choice c3 = new Choice();
        c3.add("Micro");
        c3.add("Mini");
        c3.add("SUV");
        c3.setBounds(200, 250, 150, 27);
        add(c3);
        
        
  show = new JButton("DETAILS");
        show.setBackground(Color.BLACK);
        show.setForeground(Color.WHITE);
  show.setBounds(370, 250, 90, 22);
  add(show);

  rs.close();
        }catch(SQLException e){}
        
        
        JLabel l1 = new JLabel("Type : ");
  l1.setFont(new Font("Tahoma", Font.PLAIN, 19));
  l1.setBounds(50, 250, 150, 27);
  add(l1);
        
        Choice c3 = new Choice();
        c3.add("Micro");
        c3.add("Mini");
        c3.add("SUV");
        c3.setBounds(200, 250, 150, 27);
        add(c3);
        
        
  show = new JButton("DETAILS");
        show.setBackground(Color.BLACK);
        show.setForeground(Color.WHITE);
  show.setBounds(370, 250, 90, 22);
  add(show);