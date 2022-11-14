package jswing;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import serverside.*;

public class CreateWorkspacePage extends JFrame implements ActionListener {

    UserDatabase userDatabase;
    // Gets content of the Loginframe
    Container contentPane = getContentPane();

    // LoginFrame constructor
    public CreateWorkspacePage() {
        // sets Layout to Null
        this.setBounds(0, 0, 1500, 1000);
        setLayoutManager();
        setIcon();

    }

    // Set LayoutManager to Null "Absolute Positioning" so we must define everything
    // within the Frame
    public void setLayoutManager() {
        contentPane.setLayout(null);
    }

    // Set Icon of the LoginFrame and Title
    // https://stackoverflow.com/questions/15657569/how-to-set-icon-to-jframe
    public void setIcon() {
        try {
            URL iconURL = getClass().getResource("/icons/presentation.png");
            // iconURL is null when not found
            ImageIcon icon = new ImageIcon(iconURL);
            this.setIconImage(icon.getImage());
        } catch (NullPointerException e) {
            System.out.println(e + "\nIcon cannot be found!");
        }

    }

    // Method to create Jpanel and set size sepcified by the argument
    private JPanel createJPanel(int width, int height) {
        JPanel tempPanel = new JPanel();
        tempPanel.setSize(new DimensionUIResource(width, height));
        tempPanel.setBounds(0, 0, width, height);
        // tempPanel.setMinimumSize(new Dimension(width, height));
        // tempPanel.setMaximumSize(new Dimension(width, height));
        tempPanel.setPreferredSize(new Dimension(width, height));
        // System.out.println(tempPanel.WIDTH);
        return tempPanel;
    }

    public void createAndShowGUI() {
        // Create and set up the window.
        this.setBounds(200, 200, 1300, 650);
        this.setTitle("New Workspace");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Display the window.
        // this.pack();
        this.setVisible(true);
    }

    // Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        // Login Frame for testing
        CreateWorkspacePage frame = new CreateWorkspacePage();
        frame.createAndShowGUI();

    }
}
