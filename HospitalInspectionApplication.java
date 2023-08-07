//Alex Waldegrave
//ST10153095
//PROG6112 Take Home Exam
package hospitalinspectionapplication;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HospitalInspectionApplication {

    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);    //Creating a scanner
        
        JFrame frame = new JFrame();    //Creating a new Frame
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Hospital Inspections");
        
        int howWide = 700;      //Setting the boundaries for the frame
        int howHigh = 500;
        frame.setSize(howWide,howHigh);
        
        int x = 300;        //Setting the location of the frame
        int y = 500;
        frame.setLocation(x, y);
        
        JPanel panel = new JPanel();        //Creating a new Panel
        frame.add(panel);
        panel.setLayout(null);
        
        JMenuBar mb = new JMenuBar();       //Creating the Menu bar
        JMenu file = new JMenu("File");     //Adding the buttons
        mb.add(file);
        JMenu edit = new JMenu("Edit");
        mb.add(edit);
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);
        JMenuItem save = new JMenuItem("Save");
        edit.add(save);
        JMenuItem print = new JMenuItem("Print");
        edit.add(print);
        JMenuItem clear = new JMenuItem("Clear");
        edit.add(clear);
        frame.setJMenuBar(mb);
        
        JLabel hospitalName = new JLabel("Hospital Name: ");    //Setting the label for the textfield and setting the boundaries
        hospitalName.setBounds(10, 20, 100, 25);
        panel.add(hospitalName);
        
        JTextField hospitalNameText = new JTextField();     //Creating the textfield and setting the boundaries
        hospitalNameText.setBounds(170, 20, 180, 25);
        panel.add(hospitalNameText);
        
        JLabel hospitalLocation = new JLabel("Hospital Location: ");    //Setting the label for the textfield and setting the boundaries
        hospitalLocation.setBounds(10, 50, 165, 25);
        panel.add(hospitalLocation);
        
        JTextField hospitalLocationText = new JTextField();     //Creating the textfield and setting the boundaries
        hospitalLocationText.setBounds(170, 50, 180, 25);
        panel.add(hospitalLocationText);
        
        JLabel yearsSinceInspection = new JLabel("Years since inspection: ");   //Setting the label for the textfield and setting the boundaries
        yearsSinceInspection.setBounds(10, 80, 155, 25);
        panel.add(yearsSinceInspection);
        
        Choice yearsChoice = new Choice();      //Creating the choice button and setting the boundaries
        yearsChoice.add("1 year");
        yearsChoice.add("2 years");
        yearsChoice.add("3 years");
        yearsChoice.add("4 years");
        yearsChoice.add("5 years");
        yearsChoice.setBounds(170, 80, 180, 25);
        panel.add(yearsChoice);
        
        JButton saveButton = new JButton("SAVE");   //Creating the buttons with methods
        saveButton.setBounds(170, 110, 180, 25);
        panel.add(saveButton);
        
        JTextField detailsText = new JTextField();      //Creating the textfield and setting the boundaries
        detailsText.setBounds(10, 140, 340, 150);
        panel.add(detailsText);
        
        JButton printButton = new JButton("PRINT");     //Creating the buttons with methods
        printButton.setBounds(10, 300, 180, 25);
        panel.add(printButton);
        
        JButton clearButton = new JButton("CLEAR");     //Creating the buttons with methods
        clearButton.setBounds(170, 300, 180, 25);
        panel.add(clearButton);
        
        saveButton.addActionListener(new ActionListener() //Creating the action for the button
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                try 
                {
                    for (int i = 0; i < 1; i++) 
                    {
                    String hn = hospitalNameText.getText();
                    String hl = hospitalLocationText.getText();
                    String ch = yearsChoice.getItem(yearsChoice.getSelectedIndex());
                    System.out.println("Hospital Name: " + hn + "\n" + "Hospital Location: " + hl + "\n" + "Years Since Inspection: " + ch + "\n" + "********************************");
                    }  
                }
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Maximum Inspection count reached");
                }
                
            }   
        });
        
        printButton.addActionListener(new ActionListener()  //Creating the action for the button
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                try 
                {
                    for (int i = 0; i < 1; i++) 
                    {
                    String hn = hospitalNameText.getText();
                    String hl = hospitalLocationText.getText();
                    String ch = yearsChoice.getItem(yearsChoice.getSelectedIndex());
                    System.out.println("Hospital Name: " + hn + "\n" + "Hospital Location: " + hl + "\n" + "Years Since Inspection: " + ch + "\n" + "********************************");
                    }  
                }
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Maximum Inspection count reached");
                }
                
            }   
        });
        
        clearButton.addActionListener(new ActionListener()  //Creating the action for the button
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                hospitalNameText.setText("");
                hospitalLocationText.setText("");
                detailsText.setText("");
            }
        });
        
        exit.addActionListener(e ->     //Creating the action for the button
        {
        frame.dispose();
        });
        
        save.addActionListener(ae ->    //Creating the action for the button
        {
            try 
                {
                    for (int i = 0; i < 1; i++) 
                    {
                    String hn = hospitalNameText.getText();
                    String hl = hospitalLocationText.getText();
                    String ch = yearsChoice.getItem(yearsChoice.getSelectedIndex());
                    System.out.println("Hospital Name: " + hn + "\n" + "Hospital Location: " + hl + "\n" + "Years Since Inspection: " + ch + "\n" + "********************************");
                    }  
                }
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Maximum Inspection count reached");
                }
        });
        
        print.addActionListener(ae ->   //Creating the action for the button
        {
            try 
                {
                    for (int i = 0; i < 1; i++) 
                    {
                    String hn = hospitalNameText.getText();
                    String hl = hospitalLocationText.getText();
                    String ch = yearsChoice.getItem(yearsChoice.getSelectedIndex());
                    System.out.println("Hospital Name: " + hn + "\n" + "Hospital Location: " + hl + "\n" + "Years Since Inspection: " + ch + "\n" + "********************************");
                    }  
                }
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Maximum Inspection count reached");
                }
        });
}
}
    
