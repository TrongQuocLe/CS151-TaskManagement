package jswing;

import jswing.Login.*;
import net.miginfocom.swing.MigLayout;
import jswing.component.*;
import jswing.form.*;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import jswing.event.EventMenuSelected;

public class MainJFrame extends javax.swing.JFrame {

    private MigLayout layout;
    private TaskMenu menu;
    private Header header;
    private MainForm main;
    private Animator animator;

    public MainJFrame() {
        initComponents();
        init();
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
                System.out.println("Menu Index : " + menuIndex + " SubMenu Index " + subMenuIndex);
                // if (menuIndex == 0) {
                // if (subMenuIndex == 0) {
                // main.showForm(new Form_Home());
                // } else if (subMenuIndex == 1) {
                // main.showForm(new Form1());
                // }
                // }
            }
        });
        menu.initMenuItem();
        bg.add(menu, "w 250!, spany 2");
        bg.add(header, "h 60!, wrap");
        bg.add(main, "w 100%, h 100%");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        // jPanel2 = new javax.swing.JPanel();
        // loginAndRegister1 = new LoginAndRegister();
        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // jPanel2.setMinimumSize(new java.awt.Dimension(1350, 850));
        // jPanel2.setLayout(new java.awt.BorderLayout());
        // jPanel2.add(loginAndRegister1, java.awt.BorderLayout.CENTER);

        // javax.swing.GroupLayout layout = new
        // javax.swing.GroupLayout(getContentPane());
        // getContentPane().setLayout(layout);
        // layout.setHorizontalGroup(
        // layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        // .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
        // javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        // layout.setVerticalGroup(
        // layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        // .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
        // javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1200, Short.MAX_VALUE));
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 800, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg));

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
    private javax.swing.JPanel jPanel2;
    private LoginAndRegister loginAndRegister1;
    private javax.swing.JLayeredPane bg;
    // End of variables declaration
}
