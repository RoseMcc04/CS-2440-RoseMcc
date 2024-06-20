package Week4.GUIs;

import java.awt.BorderLayout;

// imports JButton object
import javax.swing.JButton;
// imports JFrame object
import javax.swing.JFrame;
// imports JLabel object
import javax.swing.JLabel;
// imports JPanel object
import javax.swing.JPanel;
// imports JTextField object
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class TestFrame 
{
    private JFrame testFrame;
    private JLabel jlChangeMe;
    private JTextField jtfNewText;

    public TestFrame() 
    {
        // declare and initialize new JFrame
        testFrame = new JFrame();
        // x = 100, y = 100
        testFrame.setLocation(100, 100);
        // width = 400, height = 400
        testFrame.setSize(400, 400);
        // closes program when the user decides to exit
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // sets title for the JFrame object
        testFrame.setTitle("My First GUI");

        initializeComponents(); // Create and add components

        // Optional
        testFrame.pack(); 
        // sets visibility to true
        testFrame.setVisible(true);
    }

    public void initializeComponents() 
    {
        // creates button that updates the GUI
        JButton jbUpdate = new JButton("Update");
        // creates a text field with ten columns
        jtfNewText = new JTextField(10);
        // creates new label that changes the input
        jlChangeMe = new JLabel("Change me");

        // Create the north panel
        // add the changeMe label from above to the panel
        // add the panel to the north section of the frame
        JPanel jpNorth = new JPanel();
        jpNorth.add(jlChangeMe);
        testFrame.add(jpNorth, BorderLayout.NORTH);

        // Create the center panel
        // add text field and add panel to center of frame
        JPanel jpCenter = new JPanel();
        jpCenter.add(jtfNewText);
        testFrame.add(jpCenter, BorderLayout.CENTER);

        // Create the south panel
        // add button and add panel to the south of the frame
        JPanel jpSouth = new JPanel();
        jpSouth.add(jbUpdate);
        testFrame.add(jpSouth, BorderLayout.SOUTH);

        // create the anonymous class with the required actionPerformed
        // method
        // when the button is clicked, the method updateClicked() will be
        // called
        jbUpdate.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateClicked();
            }
        });
    }
    public void updateClicked() 
    {
        // Get the user text from the text field
        String t = jtfNewText.getText();
        // Check to see if it is blank
        if (!t.trim().equals("")) 
        {
            // If it is not blank, set the test on the label
            jlChangeMe.setText(t);
        }
    }

    public static void main(String[] args) 
    {
        TestFrame newFrame = new TestFrame();
    }
}
