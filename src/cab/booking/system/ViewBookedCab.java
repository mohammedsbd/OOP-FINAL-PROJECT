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


public class ViewBookedCab extends JFrame {
  private JPanel contentPane;
        Choice c1;
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          ViewBookedCab frame = new ViewBookedCab("");
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  public ViewBookedCab(String username)  {
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