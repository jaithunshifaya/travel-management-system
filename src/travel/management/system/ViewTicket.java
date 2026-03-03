
package travel.management.system;

import java.awt.*;
import java.awt.event.*;

public class ViewTicket extends Frame implements ActionListener {

    Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
    TextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    Button b1,b2,b3,b4,b5;

    public ViewTicket() {

        setTitle("Travel Management System - View Tickets");
        setSize(410,600);
        setLocation(440,20);
        setLayout(null);
        setVisible(true);

        // Labels
        l1 = new Label("Customer ID");
        l1.setBounds(50,50,150,30);
        add(l1);

        t1 = new TextField();
        t1.setBounds(220,50,150,30);
        add(t1);

        l2 = new Label("Customer Name");
        l2.setBounds(50,90,150,30);
        add(l2);

        t2 = new TextField();
        t2.setBounds(220,90,150,30);
        add(t2);

        l3 = new Label("Destination");
        l3.setBounds(50,130,150,30);
        add(l3);

        t3 = new TextField();
        t3.setBounds(220,130,150,30);
        add(t3);

        l4 = new Label("Flight Name");
        l4.setBounds(50,170,150,30);
        add(l4);

        t4 = new TextField();
        t4.setBounds(220,170,150,30);
        add(t4);

        l5 = new Label("Price");
        l5.setBounds(50,210,150,30);
        add(l5);

        t5 = new TextField();
        t5.setBounds(220,210,150,30);
        add(t5);

        l6 = new Label("Number of Person");
        l6.setBounds(50,250,150,30);
        add(l6);

        t6 = new TextField();
        t6.setBounds(220,250,150,30);
        add(t6);

        l7 = new Label("From Date");
        l7.setBounds(50,290,150,30);
        add(l7);

        t7 = new TextField();
        t7.setBounds(220,290,150,30);
        add(t7);

        l8 = new Label("To Date");
        l8.setBounds(50,330,150,30);
        add(l8);

        t8 = new TextField();
        t8.setBounds(220,330,150,30);
        add(t8);

        l9 = new Label("Total Price");
        l9.setBounds(50,370,150,30);
        add(l9);

        t9 = new TextField();
        t9.setBounds(220,370,150,30);
        add(t9);

        // Buttons
        b1 = new Button("First");
        b1.setBounds(50,410,100,30);
        add(b1);

        b2 = new Button("Next");
        b2.setBounds(220,410,100,30);
        add(b2);

        b3 = new Button("Previous");
        b3.setBounds(50,450,100,30);
        add(b3);

        b4 = new Button("Last");
        b4.setBounds(220,450,100,30);
        add(b4);

        b5 = new Button("Cancel");
        b5.setBounds(140,490,100,30);
        add(b5);

        // Add Action Listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        // Window Close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String action = ae.getActionCommand();

        if(action.equals("Cancel")) {
            dispose();
        }
        else if(action.equals("First")) {
            System.out.println("First button clicked");
        }
        else if(action.equals("Next")) {
            System.out.println("Next button clicked");
        }
        else if(action.equals("Previous")) {
            System.out.println("Previous button clicked");
        }
        else if(action.equals("Last")) {
            System.out.println("Last button clicked");
        }
    }

    public static void main(String args[]) {
        new ViewTicket();
    }
}
