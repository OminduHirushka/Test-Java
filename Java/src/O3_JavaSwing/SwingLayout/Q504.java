package O3_JavaSwing.SwingLayout;

import javax.swing.*;
import java.awt.*;

class CustomerForm extends JFrame{
    JLabel lblTitle, lblId, lblName, lblAddress, lblNic;
    JButton btnAdd, btnCancel;
    JTextField txtId, txtName, txtAddress, txtNic;

    CustomerForm(){
        setSize(400,400);
        setTitle("Customer Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        lblTitle = new JLabel("Add Customer");
        lblTitle.setFont(new Font("", 3, 30));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);

        //-----------
        JPanel pnlCenter = new JPanel(new GridLayout(4,2));
        Font font = new Font("", 1, 15);

        lblId = new JLabel("Id");
        lblId.setFont(font);
        JPanel idLabelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idLabelPanel.add(lblId);
        pnlCenter.add(idLabelPanel);

        txtId = new JTextField(5);
        txtId.setFont(font);
        JPanel idTextFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idTextFieldPanel.add(txtId);
        pnlCenter.add(idTextFieldPanel);

        lblName = new JLabel("Name");
        lblName.setFont(font);
        pnlCenter.add(lblName);

        txtName = new JTextField(15);
        txtName.setFont(font);
        pnlCenter.add(txtName);

        lblAddress = new JLabel("Address");
        lblAddress.setFont(font);
        pnlCenter.add(lblAddress);

        txtAddress = new JTextField(20);
        txtAddress.setFont(font);
        pnlCenter.add(txtAddress);

        lblNic = new JLabel("NIC");
        lblNic.setFont(font);
        pnlCenter.add(lblNic);

        txtNic = new JTextField(10);
        txtNic.setFont(font);
        pnlCenter.add(txtNic);

        add("Center", pnlCenter);

        //------------
        JPanel pnlBottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        btnAdd=new JButton("Add");
        btnAdd.setFont(new Font("", 1, 12));
        pnlBottom.add(btnAdd);

        btnCancel=new JButton("Cancel");
        btnCancel.setFont(new Font("", 1, 12));
        pnlBottom.add(btnCancel);

        add("South", pnlBottom);

        setVisible(true);
    }
}
public class Q504 {
    public static void main(String[] args) {
        new CustomerForm();
    }
}
