package jswing;

import jswing.model.ModelTask;

public class TaskProfile extends javax.swing.JPanel {

    public TaskProfile(String task) {
        initComponents();
        taskID.setText(task);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        taskID = new javax.swing.JLabel();

        taskID.setText("TaskID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(taskID)
                                .addContainerGap(22, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addComponent(taskID)
                                .addContainerGap()));
    }// </editor-fold>

    // Variables declaration - do not modify
    private javax.swing.JLabel taskID;
    // End of variables declaration
}
