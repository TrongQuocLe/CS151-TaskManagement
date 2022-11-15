//ref: https://www.geeksforgeeks.org/java-swing-grouplayout-class/
package jswing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class UserDashboard extends javax.swing.JFrame {
	public UserDashboard() {
		initComponents();
		setResizable(false);
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		searchButton = new javax.swing.JButton();
		updatesButton = new javax.swing.JButton();
		settingButton = new javax.swing.JButton();
		userPicture1 = new javax.swing.JLabel();
		headPanel = new javax.swing.JPanel();
		waterFallButton = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		userPicture = new javax.swing.JLabel();
		TaskDisplay = new javax.swing.JPanel();
		notStartedPane = new javax.swing.JPanel();
		notStartedHeadPane = new javax.swing.JPanel();
		notStartedLabel = new javax.swing.JLabel();
		addNotStartedTaskButton = new javax.swing.JButton();
		inProgressPane = new javax.swing.JPanel();
		inProgressHeadPane = new javax.swing.JPanel();
		inProgressLabel = new javax.swing.JLabel();
		addInProgressTaskButton = new javax.swing.JButton();
		completedPane = new javax.swing.JPanel();
		completedHeadPane = new javax.swing.JPanel();
		completedLabel = new javax.swing.JLabel();
		addCompletedTaskButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 255, 255));

		searchButton.setText("Search");
		searchButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchButtonActionPerformed(evt);
			}
		});

		updatesButton.setText("Settings");
		updatesButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				updatesButtonActionPerformed(evt);
			}
		});

		settingButton.setText("Updates");
		settingButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				settingButtonActionPerformed(evt);
			}
		});

		userPicture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("rsz_taskmanagementlogo.jpeg")));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(updatesButton, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(settingButton, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(23, Short.MAX_VALUE).addComponent(userPicture1).addGap(18, 18, 18)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(userPicture1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(searchButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(settingButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(updatesButton)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		headPanel.setBackground(new java.awt.Color(255, 255, 255));

		waterFallButton.setText("Water Fall");

		jButton5.setText("Crum");

		jTextField1.setText("Default");
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

//		userPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("rsz_userpicture.png"))); // NOI18N

		javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
		headPanel.setLayout(headPanelLayout);
		headPanelLayout
				.setHorizontalGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(headPanelLayout.createSequentialGroup().addContainerGap()
								.addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(headPanelLayout.createSequentialGroup()
												.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(headPanelLayout.createSequentialGroup().addComponent(waterFallButton)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton5)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(userPicture)))));
		headPanelLayout
				.setVerticalGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
								.addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(headPanelLayout.createSequentialGroup()
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(headPanelLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(waterFallButton).addComponent(jButton5)))
										.addGroup(headPanelLayout.createSequentialGroup().addComponent(userPicture)
												.addGap(0, 12, Short.MAX_VALUE)))
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		TaskDisplay.setBackground(new java.awt.Color(255, 255, 255));
		TaskDisplay.setLayout(new javax.swing.BoxLayout(TaskDisplay, javax.swing.BoxLayout.LINE_AXIS));

		notStartedPane.setBackground(new java.awt.Color(255, 255, 255));
		notStartedPane.setToolTipText("");
		notStartedPane.setPreferredSize(new java.awt.Dimension(200, 319));

		notStartedLabel.setText("Not Started");

		addNotStartedTaskButton.setText("+");
		addNotStartedTaskButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addNotStartedTaskButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout notStartedHeadPaneLayout = new javax.swing.GroupLayout(notStartedHeadPane);
		notStartedHeadPane.setLayout(notStartedHeadPaneLayout);
		notStartedHeadPaneLayout.setHorizontalGroup(
				notStartedHeadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(notStartedHeadPaneLayout.createSequentialGroup().addContainerGap()
								.addGroup(notStartedHeadPaneLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(addNotStartedTaskButton).addComponent(notStartedLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE, 80,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(102, Short.MAX_VALUE)));
		notStartedHeadPaneLayout.setVerticalGroup(
				notStartedHeadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(notStartedHeadPaneLayout.createSequentialGroup().addContainerGap()
								.addComponent(notStartedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(addNotStartedTaskButton)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout notStartedPaneLayout = new javax.swing.GroupLayout(notStartedPane);
		notStartedPane.setLayout(notStartedPaneLayout);
		notStartedPaneLayout
				.setHorizontalGroup(
						notStartedPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(notStartedPaneLayout.createSequentialGroup().addContainerGap()
										.addComponent(notStartedHeadPane, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));
		notStartedPaneLayout
				.setVerticalGroup(notStartedPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(notStartedPaneLayout.createSequentialGroup().addContainerGap()
								.addComponent(notStartedHeadPane, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(255, Short.MAX_VALUE)));

		TaskDisplay.add(notStartedPane);

		inProgressPane.setBackground(new java.awt.Color(255, 255, 255));
		inProgressPane.setPreferredSize(new java.awt.Dimension(200, 319));

		inProgressLabel.setText("In Progress");

		addInProgressTaskButton.setText("+");
		addInProgressTaskButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addInProgressTaskButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout inProgressHeadPaneLayout = new javax.swing.GroupLayout(inProgressHeadPane);
		inProgressHeadPane.setLayout(inProgressHeadPaneLayout);
		inProgressHeadPaneLayout.setHorizontalGroup(
				inProgressHeadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(inProgressHeadPaneLayout.createSequentialGroup().addContainerGap()
								.addGroup(inProgressHeadPaneLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(addInProgressTaskButton).addComponent(inProgressLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE, 80,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(102, Short.MAX_VALUE)));
		inProgressHeadPaneLayout.setVerticalGroup(
				inProgressHeadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(inProgressHeadPaneLayout.createSequentialGroup().addContainerGap()
								.addComponent(inProgressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(addInProgressTaskButton)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout inProgressPaneLayout = new javax.swing.GroupLayout(inProgressPane);
		inProgressPane.setLayout(inProgressPaneLayout);
		inProgressPaneLayout
				.setHorizontalGroup(
						inProgressPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(inProgressPaneLayout.createSequentialGroup().addContainerGap()
										.addComponent(inProgressHeadPane, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));
		inProgressPaneLayout
				.setVerticalGroup(inProgressPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(inProgressPaneLayout.createSequentialGroup().addContainerGap()
								.addComponent(inProgressHeadPane, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(255, Short.MAX_VALUE)));

		TaskDisplay.add(inProgressPane);

		completedPane.setBackground(new java.awt.Color(255, 255, 255));
		completedPane.setPreferredSize(new java.awt.Dimension(200, 319));

		completedLabel.setText("Completed");

		addCompletedTaskButton.setText("+");
		addCompletedTaskButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addCompletedTaskButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout completedHeadPaneLayout = new javax.swing.GroupLayout(completedHeadPane);
		completedHeadPane.setLayout(completedHeadPaneLayout);
		completedHeadPaneLayout.setHorizontalGroup(completedHeadPaneLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(completedHeadPaneLayout.createSequentialGroup().addContainerGap()
						.addGroup(completedHeadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(completedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(addCompletedTaskButton))
						.addContainerGap(118, Short.MAX_VALUE)));
		completedHeadPaneLayout
				.setVerticalGroup(completedHeadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(completedHeadPaneLayout.createSequentialGroup().addContainerGap()
								.addComponent(completedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(addCompletedTaskButton)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout completedPaneLayout = new javax.swing.GroupLayout(completedPane);
		completedPane.setLayout(completedPaneLayout);
		completedPaneLayout
				.setHorizontalGroup(completedPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(completedPaneLayout.createSequentialGroup().addContainerGap()
								.addComponent(completedHeadPane, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		completedPaneLayout
				.setVerticalGroup(completedPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(completedPaneLayout.createSequentialGroup().addContainerGap()
								.addComponent(completedHeadPane, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(255, Short.MAX_VALUE)));

		TaskDisplay.add(completedPane);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(TaskDisplay,
								javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(TaskDisplay, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>

	private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void updatesButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void settingButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
//ref: https://stackoverflow.com/questions/28800777/use-a-jbutton-to-add-new-panels-at-runtime
	private void addNotStartedTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {
		JPanel content = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.weighty = 1;
		content.add(new JPanel(), gbc);
		notStartedPane.add(new JScrollPane(content));
		TaskPane newTaskPane = new TaskPane();
		int insertAt = Math.max(0, content.getComponentCount() - 1);
		GridBagConstraints gbcTask = new GridBagConstraints();
		gbcTask.gridwidth = GridBagConstraints.REMAINDER;
		gbcTask.fill = GridBagConstraints.HORIZONTAL;
		gbcTask.weightx = 1;
		content.add(newTaskPane, gbcTask, insertAt);
		content.revalidate();
		content.repaint();
		notStartedPane.add(newTaskPane);
	}

	private void addInProgressTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void addCompletedTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	public static void main(String args[]) {
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserDashboard().setVisible(true);
			}
		});
	}

	private javax.swing.JPanel TaskDisplay;
	private javax.swing.JButton addCompletedTaskButton;
	private javax.swing.JButton addInProgressTaskButton;
	private javax.swing.JButton addNotStartedTaskButton;
	private javax.swing.JPanel completedHeadPane;
	private javax.swing.JLabel completedLabel;
	private javax.swing.JPanel completedPane;
	private javax.swing.JPanel headPanel;
	private javax.swing.JPanel inProgressHeadPane;
	private javax.swing.JLabel inProgressLabel;
	private javax.swing.JPanel inProgressPane;
	private javax.swing.JButton jButton5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JPanel notStartedHeadPane;
	private javax.swing.JLabel notStartedLabel;
	private javax.swing.JPanel notStartedPane;
	private javax.swing.JButton searchButton;
	private javax.swing.JButton settingButton;
	private javax.swing.JButton updatesButton;
	private javax.swing.JLabel userPicture;
	private javax.swing.JLabel userPicture1;
	private javax.swing.JButton waterFallButton;

}
