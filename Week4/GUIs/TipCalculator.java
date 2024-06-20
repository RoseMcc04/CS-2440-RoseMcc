package Week4.GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TipCalculator 
{
    private JFrame frame;
    private JLabel billLabel, totalLabel;
    private JButton tip1, tip2, tip3, calculateButton;
    private JTextField billText;

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
                
            }
        };
        tip1.addActionListener(null);
        tip2 = new JButton("20%");
        tip3 = new JButton("22%");
        calculateButton = new JButton("calc");
        center.add(tip1);
        center.add(tip2);
        center.add(tip3);
        center.add(calculateButton);
        frame.add(center, BorderLayout.CENTER);

        // South panel
        JPanel south = new JPanel();
        totalLabel = new JLabel("Total: $");
        south.add(totalLabel);
        frame.add(south, BorderLayout.PAGE_END);
        
        
    }

    public static void main(String[] args) 
    {
        TipCalculator calc = new TipCalculator();
    }
}
