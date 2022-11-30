package jswing.form;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.border.EmptyBorder;
import jswing.ImagePanel;

public class MainForm extends ImagePanel {

    public MainForm() {
        initComponents();
        setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/CToGD7f-galaxy-desktop-backgrounds.jpg")));
        setOpaque(false);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(10, 20, 10, 20));
    }

    public void showForm(Component form) {
        removeAll();
        add(form);
        repaint();
        revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE));
    }// </editor-fold>

    // Variables declaration - do not modify
    // End of variables declaration
}
