
package jswing.form;

import java.awt.*;
import java.awt.event.KeyEvent;

import jswing.Button;

public class CreateWorkspaceForm extends java.awt.Panel {

    /**
     * Creates new form CreateWorkspaceForm
     */
    public CreateWorkspaceForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new Button();
        jTextField1 = new javax.swing.JTextField();
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }

            private void jTextField1KeyReleased(KeyEvent evt) {
                if (jTextField1.getText().isEmpty()) {
                    setButtonFalse();
                } else {
                    setButtonTrue();
                }
            }
        });
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 50));
        setMaximumSize(new java.awt.Dimension(600, 800));
        setPreferredSize(new java.awt.Dimension(600, 800));

        jLabel2.setBackground(new java.awt.Color(0, 0, 50));
        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create New Workspace");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Task :");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Container :");

        jButton1.setText("Submit");
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18));
        // jButton1.addActionListener(new java.awt.event.ActionListener() {
        // public void actionPerformed(java.awt.event.ActionEvent evt) {
        // jbutton1ActionPerformed(evt);
        // }

        // private void jButton1ActionPerformed(ActionEvent evt) {
        // String workspaceName = jTextField1.getText();
        // String taskName = jTextField3.getText();
        // String containName = jTextFields2.getText();
        // UserDatabase userDatabase = UserDatabase.getInstance();
        // userDatabase.createWorkspace(workspaceName);

        // }
        // });

        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 498,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 118,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 118,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                468, Short.MAX_VALUE)
                                                        .addComponent(jTextField1)
                                                        .addComponent(jTextField3))))
                                .addGap(208, 208, 208)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
    }// </editor-fold>
     // Set button false

    private void setButtonFalse() {
        jButton1.setEnabled(false);
        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
    }

    // set button true
    private void setButtonTrue() {
        jButton1.setEnabled(true);
        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));

    }

    // Variables declaration - do not modify
    private Button jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration
}
