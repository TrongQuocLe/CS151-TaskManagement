package jswing;

import javax.swing.JFrame;
import java.awt.Container;
import java.net.URL;
import javax.swing.ImageIcon;

public class MainJFrame extends JFrame {

    Container contentPane = getContentPane();

    public MainJFrame() {
        setIcon();
        setLayoutManager();
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
            URL iconURL = getClass().getResource("/icons/icons8-tree-structure-64.png");
            // iconURL is null when not found
            ImageIcon icon = new ImageIcon(iconURL);
            this.setIconImage(icon.getImage());
        } catch (NullPointerException e) {
            System.out.println(e + "\nIcon cannot be found!");
        }

    }

    public static void main(String[] args) {
        MainJFrame main = new MainJFrame();
        main.setBounds(200, 200, 500, 600);
        main.setResizable(true);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
