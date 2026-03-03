
package travel.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class AddCustomer extends JFrame {

    private JPanel contentPane;
    private JTextField t1, t2, t3, t5, t6, t7, t8;
    private JComboBox<String> comboBox;   // ✅ Generic added
    private JRadioButton r1, r2;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                AddCustomer frame = new AddCustomer("");
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public AddCustomer(String username) throws SQLException {

        setBounds(580, 220, 850, 550);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);

        JLabel lblTitle = new JLabel("NEW CUSTOMER FORM");
        lblTitle.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblTitle.setBounds(118, 11, 300, 30);
        contentPane.add(lblTitle);

        // Username
        JLabel l3 = new JLabel("Username :");
        l3.setBounds(35, 70, 200, 20);
        contentPane.add(l3);

        t7 = new JTextField();
        t7.setBounds(271, 70, 150, 20);
        contentPane.add(t7);

        // ID Type
        JLabel lblId = new JLabel("ID :");
        lblId.setBounds(35, 110, 200, 20);
        contentPane.add(lblId);

        comboBox = new JComboBox<>(   // ✅ Generic fixed
                new String[]{"Passport", "Aadhar Card", "Voter Id", "Driving License"});
        comboBox.setBounds(271, 110, 150, 20);
        contentPane.add(comboBox);

        // ID Number
        JLabel l2 = new JLabel("Number :");
        l2.setBounds(35, 150, 200, 20);
        contentPane.add(l2);

        t1 = new JTextField();
        t1.setBounds(271, 150, 150, 20);
        contentPane.add(t1);

        // Name
        JLabel lblName = new JLabel("Name :");
        lblName.setBounds(35, 190, 200, 20);
        contentPane.add(lblName);

        t2 = new JTextField();
        t2.setBounds(271, 190, 150, 20);
        contentPane.add(t2);

        // Gender
        JLabel lblGender = new JLabel("Gender :");
        lblGender.setBounds(35, 230, 200, 20);
        contentPane.add(lblGender);

        r1 = new JRadioButton("Male");
        r1.setBounds(271, 230, 80, 20);
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Female");
        r2.setBounds(350, 230, 100, 20);
        r2.setBackground(Color.WHITE);

        // ✅ Grouping radio buttons (important fix)
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        contentPane.add(r1);
        contentPane.add(r2);

        // Country
        JLabel lblCountry = new JLabel("Country :");
        lblCountry.setBounds(35, 270, 200, 20);
        contentPane.add(lblCountry);

        t3 = new JTextField();
        t3.setBounds(271, 270, 150, 20);
        contentPane.add(t3);

        // Address
        JLabel lblAddress = new JLabel("Permanent Address :");
        lblAddress.setBounds(35, 310, 200, 20);
        contentPane.add(lblAddress);

        t5 = new JTextField();
        t5.setBounds(271, 310, 150, 20);
        contentPane.add(t5);

        // Phone
        JLabel lblPhone = new JLabel("Phone :");
        lblPhone.setBounds(35, 350, 200, 20);
        contentPane.add(lblPhone);

        t6 = new JTextField();
        t6.setBounds(271, 350, 150, 20);
        contentPane.add(t6);

        // Email
        JLabel lblEmail = new JLabel("Email :");
        lblEmail.setBounds(35, 390, 200, 20);
        contentPane.add(lblEmail);

        t8 = new JTextField();
        t8.setBounds(271, 390, 150, 20);
        contentPane.add(t8);

        // Load username + name from account table
        try {
            Conn c = new Conn();
            PreparedStatement ps = c.c.prepareStatement(
                    "SELECT username, name FROM account WHERE username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                t7.setText(rs.getString("username"));
                t2.setText(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ADD BUTTON
        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(100, 430, 120, 30);
        btnAdd.setBackground(Color.BLACK);
        btnAdd.setForeground(Color.WHITE);
        contentPane.add(btnAdd);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String gender = null;
                if (r1.isSelected()) gender = "Male";
                else if (r2.isSelected()) gender = "Female";

                try {
                    Conn c = new Conn();

                    String query = "INSERT INTO customer VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                    PreparedStatement ps = c.c.prepareStatement(query);

                    ps.setString(1, t7.getText());
                    ps.setString(2, comboBox.getSelectedItem().toString());
                    ps.setString(3, t1.getText());
                    ps.setString(4, t2.getText());
                    ps.setString(5, gender);
                    ps.setString(6, t3.getText());
                    ps.setString(7, t5.getText());
                    ps.setString(8, t6.getText());
                    ps.setString(9, t8.getText());

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                    setVisible(false);

                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error adding customer");
                }
            }
        });

        // BACK BUTTON
        JButton btnBack = new JButton("Back");
        btnBack.setBounds(260, 430, 120, 30);
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.WHITE);
        contentPane.add(btnBack);

        btnBack.addActionListener(e -> setVisible(false));
    }
}