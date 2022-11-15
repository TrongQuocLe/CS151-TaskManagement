package jswing;

//ref: https://www.geeksforgeeks.org/java-swing-grouplayout-class/
public class TaskPane extends javax.swing.JPanel {

    public TaskPane() {
        initComponents();
    }

    private void initComponents() {

        assignedHours = new javax.swing.JLabel();
        taskName = new javax.swing.JTextField();
        assignedPeoplePicture = new javax.swing.JLabel();

        assignedHours.setText("hours");

        taskName.setText("Task");
        taskName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskNameActionPerformed(evt);
            }
        });

        assignedPeoplePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("rsz_userpicture.png"))); 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskName, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignedPeoplePicture)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(assignedHours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taskName)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignedPeoplePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(assignedHours, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }                       

    private void taskNameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private javax.swing.JLabel assignedHours;
    private javax.swing.JLabel assignedPeoplePicture;
    private javax.swing.JTextField taskName;
}
