package jswing;

import jswing.Login.*;
import net.miginfocom.swing.MigLayout;
import jswing.component.*;
import jswing.form.*;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import jswing.event.EventMenuSelected;
import jswing.event.EventLogin;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import serverside.UserDatabase;
import jswing.ImagePanel;

public class MainJFrame extends javax.swing.JFrame {

    private MigLayout layout;
    private TaskMenu menu;
    private Header header;
    private MainForm main;
    private Animator animator;
    private HomeForm home;

    public MainJFrame() {
        UserDatabase userDatabase = UserDatabase.getInstance();
        initComponents();
        header = new Header();
        EventLogin eventLogin = new EventLogin() {
            @Override
            public void loginDone() {
                loginPanel.setVisible(false);
                loginPanel.setEnabled(false);
                loginPanel.removeAll();
                init();
            }

            @Override
            public void logOut() {
            }
        };
        loginAndRegister1.setEventLogin(eventLogin);
    }

    private void init() {
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        bg.setLayout(layout);
        menu = new TaskMenu();
        header = new Header();
        main = new MainForm();
        menu.setEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                System.out.println("Menu Index : " + menuIndex + " SubMenu Index " +
                        subMenuIndex);
                if (menuIndex == 0) {
                    if (subMenuIndex == -1) {
                        main.showForm(new HomeForm());
                    }
                }
                if (subMenuIndex == 0) {
                    System.out.println("Nothing Happens");
                }
                if (menuIndex == 3) {
                    if (subMenuIndex == 0) {
                        System.out.println("Workspace Selected");
                    } else if (subMenuIndex == 1) {
                        main.showForm(new LoginAndRegister());
                    }
                }
            }
        });

        EventLogin eventLogin = new EventLogin() {
            @Override
            public void loginDone() {
            }

            @Override
            public void logOut() {
                bg.removeAll();
                loginPanel.setVisible(true);
                loginPanel.setEnabled(true);
                loginPanel.add(new LoginAndRegister());
            }
        };
        header.setEventLogin(eventLogin);
        loginAndRegister1.setEventLogin(eventLogin);

        menu.initMenuItem();
        bg.add(menu, "w 280!, spany 2");
        bg.add(header, "h 65, wrap");
        bg.add(main, "w 100%, h 100%");

        // Adding in the hamburger menu to expand and minimize taskbar
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.getShowMenu()) {
                    width = 60 + (170 * (1f - fraction));
                } else {
                    width = 60 + (170 * fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!, spany2");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowMenu(!menu.getShowMenu());
                menu.setEnableMenu(true);
            }

        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        header.addMenuEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    animator.start();
                }
                menu.setEnableMenu(false);
                if (menu.getShowMenu()) {
                    menu.hideallMenu();
                }
            }
        });
        // init google font
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        main.showForm(new HomeForm());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        loginPanel = new ImagePanel();
        loginAndRegister1 = new LoginAndRegister();
        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // setUndecorated(true);

        loginPanel
                .setImage(new javax.swing.ImageIcon(
                        getClass().getResource("/icons/CToGD7f-galaxy-desktop-backgrounds.jpg")));
        loginPanel.setPreferredSize(new java.awt.Dimension(1200, 800));
        loginPanel.setLayout(new java.awt.BorderLayout());
        loginPanel.add(loginAndRegister1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1278, Short.MAX_VALUE));
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 866, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(bg)
                                .addGap(0, 0, 0))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 1278, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(bg)
                                .addGap(0, 0, 0))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLayeredPane bg;
    private LoginAndRegister loginAndRegister1;
    private ImagePanel loginPanel;
    // End of variables declaration
}