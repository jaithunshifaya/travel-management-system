
package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    TextArea t1;
    String s;

    public About() {

        setLayout(null);

        // Exit Button
        b1 = new JButton("Exit");
        b1.setBounds(180, 430, 120, 25);
        b1.addActionListener(this);
        add(b1);

        // Title Label
        l1 = new JLabel("About Project");
        l1.setBounds(170, 10, 200, 80);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(l1);

        // Content Text
        s = "                                    About Projects\n\n"
                + "The objective of the Travel and Tourism Management System "
                + "project is to develop a system that automates the processes "
                + "and activities of travel management.\n\n"
                + "This application helps users access travel information easily "
                + "and track tour details efficiently. Travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:\n"
                + "• Gives accurate information\n"
                + "• Simplifies manual work\n"
                + "• Minimizes documentation work\n"
                + "• Provides up-to-date information\n"
                + "• User-friendly environment\n"
                + "• Traveler details management\n"
                + "• Booking confirmation notification";

        t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setBounds(20, 100, 450, 300);
        t1.setEditable(false);
        t1.setFont(new Font("RALEWAY", Font.PLAIN, 16));
        add(t1);

        setBounds(700, 220, 500, 550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About();
    }
}