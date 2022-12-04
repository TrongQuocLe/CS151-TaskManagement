package jswing.form;

import jswing.event.EventTaskComplete;
import jswing.DocumentSizeFilter;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import jswing.GoogleMaterialDesignIcons;
import jswing.IconFontSwing;
import javax.swing.Icon;
import java.awt.Color;
import serverside.Task;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import jswing.ButtonEffect;
import jswing.TextField;
import jswing.TextArea;

public class TaskObjectForm extends javax.swing.JPanel {

    private DefaultStyledDocument docDesc;
    private DefaultStyledDocument docNotes;
    private Task task;
    private EventTaskComplete taskEvent;

    public void setTask(Task task) {
        this.task = task;
    }

    public void setTaskEvent(EventTaskComplete taskEvent) {
        this.taskEvent = taskEvent;
    }

    public TaskObjectForm() {
        initComponents();
        Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.EDIT, 60,
                new Color(255, 255, 100));
        taskIcon.setIcon(icon);
        docDesc = new DefaultStyledDocument();
        docDesc.setDocumentFilter(new DocumentSizeFilter(200));
        docDesc.addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                updateCountDesc();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateCountDesc();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateCountDesc();
            }
        });
        description.setDocument(docDesc);
        docNotes = new DefaultStyledDocument();
        docNotes.setDocumentFilter(new DocumentSizeFilter(300));
        docNotes.addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                updateCountNotes();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateCountNotes();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateCountNotes();
            }
        });
        notes.setDocument(docNotes);
        description.fixScrollBar(jScrollPane3);
        notes.fixScrollBar(jScrollPane4);
    }

    public TaskObjectForm(Task task) {
        initComponents();
        Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.EDIT, 50,
                new Color(0, 0, 0));
        taskIcon.setIcon(icon);
        this.task = task;
        docDesc = new DefaultStyledDocument();
        docDesc.setDocumentFilter(new DocumentSizeFilter(200));
        docDesc.addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                updateCountDesc();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateCountDesc();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateCountDesc();
            }
        });
        description.setDocument(docDesc);
        docNotes = new DefaultStyledDocument();
        docNotes.setDocumentFilter(new DocumentSizeFilter(300));
        docNotes.addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                updateCountNotes();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateCountNotes();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateCountNotes();
            }
        });
        notes.setDocument(docNotes);
        description.fixScrollBar(jScrollPane3);
        notes.fixScrollBar(jScrollPane4);
        initTaskData();
        initOptionalTaskData();
    }

    private void updateCountDesc() {
        if (200 - docDesc.getLength() <= 50) {
            remainingLabel.setText((200 - docDesc.getLength()) + " characters remaining");
        }
    }

    private void updateCountNotes() {
        if (300 - docDesc.getLength() <= 50) {
            remainingLabel.setText((300 - docNotes.getLength()) + " characters remaining");
        }
    }

    private void initTaskData() {
        jLabel1.setText(task.getTaskName());
        taskName.setText(task.getTaskName());
        description.setText(task.getDescription());
        estimatedHours.setText(String.valueOf(task.getEstimatedHours()));
        status.setSelectedItem(task.getStatus());
        priority.setSelectedItem(task.getPriority());
        assignedTo.setText(task.getAssignee());
        try {
            startDate.setText(task.getStartDate());
            endDate.setText(task.getEndDate());
        } catch (NullPointerException e) {
            System.out.println("Empty Dates");
        }

    }

    private void initOptionalTaskData() {
        try {
            dependencies.setText(task.getDependencies().getTaskName());
            notes.setText(task.getNotes());
            actualHours.setText(String.valueOf(task.getActualHours()));
        } catch (NullPointerException e) {
            if (Objects.isNull(task.getDependencies())) {
                dependencies.setText("");
            } else if (Objects.isNull(task.getNotes())) {
                notes.setText("");
            } else if (Objects.isNull(task.getActualHours())) {
                actualHours.setText("");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        endDate = new TextField();
        estimatedHours = new TextField();
        status = new javax.swing.JComboBox<>();
        dependencies = new TextField();
        priority = new javax.swing.JComboBox<>();
        assignedTo = new TextField();
        taskIcon = new javax.swing.JLabel();
        deleteButton = new ButtonEffect();
        updateButton = new ButtonEffect();
        taskName = new TextField();
        startDate = new TextField();
        actualHours = new TextField();
        remainingLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        description = new TextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        notes = new TextArea();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Task Name");

        endDate.setForeground(new java.awt.Color(255, 255, 255));
        endDate.setText("End Date");

        estimatedHours.setForeground(new java.awt.Color(255, 255, 255));
        estimatedHours.setText("Estimated Hours");
        estimatedHours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                estimatedHoursKeyTyped(evt);
            }
        });

        status.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Not Yet Started", "On Hold", "In Progress", "Complete" }));

        dependencies.setForeground(new java.awt.Color(255, 255, 255));
        dependencies.setText("Dependencies");

        priority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOW", "MEDIUM", "HIGH" }));

        assignedTo.setForeground(new java.awt.Color(255, 255, 255));
        assignedTo.setText("Assigned To");

        deleteButton.setBackground(new java.awt.Color(255, 51, 51));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 153, 255));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateButtonMousePressed(evt);
            }
        });

        taskName.setForeground(new java.awt.Color(255, 255, 255));
        taskName.setText("Task Name");

        startDate.setForeground(new java.awt.Color(255, 255, 255));
        startDate.setText("Start Date");

        actualHours.setForeground(new java.awt.Color(255, 255, 255));
        actualHours.setText("Actual Hours");
        actualHours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                actualHoursKeyTyped(evt);
            }
        });

        remainingLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remainingLabel.setForeground(new java.awt.Color(255, 51, 51));

        description.setColumns(20);
        description.setRows(5);
        description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(description);

        notes.setColumns(20);
        notes.setRows(5);
        notes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(notes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(taskIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                .createSequentialGroup()
                                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(assignedTo, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(priority, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(status, javax.swing.GroupLayout.Alignment.LEADING, 0,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(endDate, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(estimatedHours, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dependencies, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(taskName, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(startDate, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(actualHours, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(remainingLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 250,
                                                Short.MAX_VALUE)
                                        .addComponent(jScrollPane4))
                                .addContainerGap(125, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(taskIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(taskName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estimatedHours, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actualHours, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(dependencies, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priority, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(assignedTo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(remainingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)));
    }// </editor-fold>

    private void updateButtonMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        // this.task.setTaskName(taskName.getText());
        // this.task.setDescription(description.getText());
        // this.task.setEstimatedHours(Integer.parseInt(estimatedHours.getText()));
        // this.task.setDates(startDate.getText(), endDate.getText());
        // this.task.setActualHours(Integer.parseInt(actualHours.getText()));
        //// this.task.setDependencies(dependencies.getText());
        // this.task.setNotes(notes.getText());
        // this.task.setPriority(notes.getText());
        // this.task.setStatus(notes.getText());
        // taskEvent.taskUpdate();
    }

    private void estimatedHoursKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (!onlyDigits(estimatedHours.getText())) {
            updateButton.setBackground(Color.GRAY);
            updateButton.setEnabled(false);
            updateButton.setForeground(Color.red);
            remainingLabel.setText("Use only digits for hours");
        } else {
            updateButton.setBackground(new Color(0, 153, 255));
            updateButton.setEnabled(true);
            updateButton.setForeground(Color.WHITE);
            remainingLabel.setText("");
        }
    }

    private void actualHoursKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (!onlyDigits(actualHours.getText())) {
            updateButton.setBackground(Color.GRAY);
            updateButton.setEnabled(false);
            updateButton.setForeground(Color.red);
            remainingLabel.setText("Use only digits for hours");
        } else {
            updateButton.setBackground(new Color(0, 153, 255));
            updateButton.setEnabled(true);
            updateButton.setForeground(Color.WHITE);
            remainingLabel.setText("");
        }
    }

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Delete?",
                JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            taskEvent.taskDelete();
        }

    }

    public boolean onlyDigits(String hours) {
        String regex = "[0-9]+";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        // If the string is empty
        // return false
        if (hours == null || hours.isEmpty()) {
            return true;
        }
        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(hours);
        // Return if the string
        // matched the ReGex
        return m.matches();
    }

    // Variables declaration - do not modify
    private TextField actualHours;
    private TextField assignedTo;
    private ButtonEffect deleteButton;
    private TextField dependencies;
    private TextArea description;
    private TextField endDate;
    private TextField estimatedHours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private TextArea notes;
    private javax.swing.JComboBox<String> priority;
    private javax.swing.JLabel remainingLabel;
    private TextField startDate;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JLabel taskIcon;
    private TextField taskName;
    private ButtonEffect updateButton;
    // End of variables declaration
}
