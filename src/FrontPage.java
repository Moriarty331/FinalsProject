package src;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontPage extends JFrame implements ActionListener
{
    JButton loginButton;
    JButton signupButton;
    
    FrontPage()
    {

    }

    void createFrontPageUI()
    {
        
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1); //creates border
        ImageIcon logoIcon = new ImageIcon("logo.png");
        ImageIcon icon1 = new ImageIcon("custom.png");

        setSize(450, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.RED);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        //PANELS
        JPanel primaryPanel = new JPanel();
        primaryPanel.setBounds(37, 270, 357, 44);
        // primaryPanel.setBorder(border);
        primaryPanel.setLayout(new GridLayout(1,2,10,0));
        
        //LABELS
        JLabel titleLabel = new JLabel("MILKIPEDIA");
        titleLabel.setBounds(35, 210, 370, 50);
        titleLabel.setFont(new Font("Monospaced", Font.BOLD, 60));
        // titleLabel.setBorder(border);
        titleLabel.setForeground(Color.BLACK);

        JLabel label1 = new JLabel();
        label1.setIcon(icon1);
        label1.setBounds(-50, -20, 140, 130);
        // label1.setBorder(border);
        
        JLabel labelIcon = new JLabel();
        labelIcon.setBounds(150, 80, 140, 130);
        labelIcon.setIcon(logoIcon);

        JLabel label2 = new JLabel();
        label2.setIcon(icon1);
        label2.setBounds(250, 370, 140, 130);

        JLabel label3 = new JLabel();
        label3.setIcon(icon1);
        label3.setBounds(330, 370, 140, 130);

        JLabel label4 = new JLabel();
        label4.setIcon(icon1);
        label4.setBounds(30, -40, 140, 130);

        JLabel label5 = new JLabel();
        label5.setIcon(icon1);
        label5.setBounds(400, 100, 140, 130);

        JLabel label6 = new JLabel();
        label6.setIcon(icon1);
        label6.setBounds(370, 30, 140, 130);

        signupButton = new JButton("SIGN UP");
        signupButton.setFont(new Font("Monospaced", Font.BOLD, 20));
        signupButton.setFocusable(false);
        signupButton.setForeground(Color.BLACK);
        signupButton.addActionListener(this);
        signupButton.setBackground(Color.WHITE);
        signupButton.setOpaque(true);
        signupButton.setBorder(border);
        signupButton.setHorizontalAlignment(JLabel.CENTER);
        signupButton.setVerticalAlignment(JLabel.CENTER);
        signupButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        signupButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e)
            {          
                signupButton.setBackground(Color.BLACK);
                signupButton.setForeground(Color.WHITE);
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                signupButton.setBackground(Color.WHITE);
                signupButton.setForeground(Color.BLACK);
            }
        });

        primaryPanel.add(signupButton);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(primaryPanel);
        add(labelIcon);
        add(titleLabel);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == signupButton)
            {
                this.dispose();
                RegistrationPage registrationPage = new RegistrationPage();
                registrationPage.createRegistrationUI();
                System.out.println("signup button pressed");
            }
        }
    public static void main(String[] args) {
        FrontPage frontPage = new FrontPage();
        frontPage.createFrontPageUI();
        RegistrationPage registrationPage = new RegistrationPage();
        // registrationPage.createRegistrationUI();
        // loginPage.createLoginUI();
        // frontPage.createFrontPageUI();
    }
}