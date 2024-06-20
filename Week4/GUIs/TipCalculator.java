package Week4.GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TipCalculator 
{
    private JFrame frame;
    private JLabel billLabel, totalLabel;
    private JButton tip1, tip2, tip3;
    private JTextField billText;
    public final double TIP_AMOUNT_1 = 0.18;
    public final double TIP_AMOUNT_2 = 0.20;
    public final double TIP_AMOUNT_3 = 0.22;

    public TipCalculator() 
    {
        frame = new JFrame();
        frame.setLocation(200, 200);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tip Calculator - Rose McCormack");
        initializeComponents();
        frame.setVisible(true);
    }

    public void initializeComponents() 
    {
        // North panel
        JPanel north = new JPanel();
        billLabel = new JLabel("Enter bill: ");
        billText = new JTextField(10);
        north.add(billLabel);
        north.add(billText);
        frame.add(north, BorderLayout.PAGE_START);
        

        // Center panel
        JPanel center = new JPanel();
        tip1 = new JButton("18%");
        // using an ANONYMOUS INNER CLASS
        ActionListener tip1Listener = new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String bill = billText.getText();
                Double numericBill = Double.parseDouble(bill);
                double total = numericBill * (1 + TIP_AMOUNT_1);
                totalLabel.setText("Total: $" + total);
            }
        };
        tip1.addActionListener(tip1Listener);
        tip2 = new JButton("20%");
        // using an ANONYMOUS INNER CLASS
        ActionListener tip2Listener = new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String bill = billText.getText();
                Double numericBill = Double.parseDouble(bill);
                double total = numericBill * (1 + TIP_AMOUNT_2);
                totalLabel.setText("Total: $" + total);
            }
        };
        tip2.addActionListener(tip2Listener);
        tip3 = new JButton("22%");
        // using an ANONYMOUS INNER CLASS
        ActionListener tip3Listener = new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String bill = billText.getText();
                Double numericBill = Double.parseDouble(bill);
                double total = numericBill * (1 + TIP_AMOUNT_3);
                totalLabel.setText("Total: $" + total);
            }
        };
        tip3.addActionListener(tip3Listener);
        center.add(tip1);
        center.add(tip2);
        center.add(tip3);
        frame.add(center, BorderLayout.CENTER);

        // South panel
        JPanel south = new JPanel();
        totalLabel = new JLabel("Total: $");
        south.add(totalLabel);
        frame.add(south, BorderLayout.PAGE_END);
        
        
    }

    public static void main(String[] args) 
    {
        try 
        {
            TipCalculator calc = new TipCalculator();
        }
        catch (Exception e) 
        {
            System.out.println("There is something wrong with the GUI.");
        } 
    }
}
