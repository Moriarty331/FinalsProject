package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class RegistrationPage extends JFrame{

    JPanel backgroundPanel;
    JPanel mainPanel;

    RegistrationPage()
    {

    }

    void createRegistrationUI()
    {
        ImageIcon logoIcon = new ImageIcon("logo-white.png");
        ImageIcon backgroundDesign = new ImageIcon("custom.png");
        Border border = BorderFactory.createLineBorder(Color.BLACK, 5); //creates border

        setResizable(false);
        setSize(700, 700);
        setLocationRelativeTo(null);
        setLayout(null);

        //PANELS
        backgroundPanel = new JPanel();
        backgroundPanel.setBounds(0, 0, getWidth(), getHeight());
        backgroundPanel.setBackground(Color.WHITE);

        mainPanel = new JPanel();
        mainPanel.setBounds(35, 150, 615, 500);
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(border);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel designLabel1 = new JLabel();
        designLabel1.setIcon(backgroundDesign);
        designLabel1.setBounds(-20, 600, 140, 130);

        JLabel designLabel2 = new JLabel();
        designLabel2.setIcon(backgroundDesign);
        designLabel2.setBounds(100, 590, 140, 130);

        JLabel designLabel3 = new JLabel();
        designLabel3.setIcon(backgroundDesign);
        designLabel3.setBounds(200, 610, 140, 130);

        JLabel designLabel4 = new JLabel();
        designLabel4.setIcon(backgroundDesign);
        designLabel4.setBounds(300, 605, 140, 130);

        JLabel designLabel5 = new JLabel();
        designLabel5.setIcon(backgroundDesign);
        designLabel5.setBounds(50, 600, 140, 130);

        
        
        add(designLabel2);
        add(designLabel3);
        add(designLabel1);
        add(mainPanel);
        add(backgroundPanel);
        
        setVisible(true);
    }

}
