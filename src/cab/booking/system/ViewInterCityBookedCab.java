package cab.booking.system;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;  
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;


public class ViewInterCityBookedCab extends JFrame {
  private JPanel contentPane;
        Choice c1;
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          ViewInterCityBookedCab frame = new ViewInterCityBookedCab("");
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  public ViewInterCityBookedCab(String username)  {
    setBounds(450, 220, 1050, 600);
    contentPane = new JPanel();
    setContentPane(contentPane);
    contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/intracabdetails.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 450,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,150,550,350);
                add(la1);
    
    JLabel lblName = new JLabel("VIEW BOOKED CAB DETAILS");
    lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
    lblName.setBounds(88, 1, 350, 53);
    contentPane.add(lblName);
                
                JLabel lb3 = new JLabel("Customer Name :");
    lb3.setBounds(35, 70, 200, 14);
    contentPane.add(lb3);
                
                JLabel l1 = new JLabel();
    l1.setBounds(271, 70, 200, 14);
    contentPane.add(l1);
                
                JLabel lblId = new JLabel("Driver Name :");
    lblId.setBounds(35, 110, 200, 14);
    contentPane.add(lblId);
                
                JLabel l2 = new JLabel();
    l2.setBounds(271, 110, 200, 14);
    contentPane.add(l2);
                
                JLabel lb2 = new JLabel("Source :");
    lb2.setBounds(35, 150, 200, 14);
    contentPane.add(lb2);
                
                JLabel l3 = new JLabel();
    l3.setBounds(271, 150, 200, 14);
    contentPane.add(l3);
    
    JLabel lblName_1 = new JLabel("Destination :");
    lblName_1.setBounds(35, 190, 200, 14);
    contentPane.add(lblName_1);
    
    JLabel l4 = new JLabel();
    l4.setBounds(271, 190, 200, 14);
    contentPane.add(l4);