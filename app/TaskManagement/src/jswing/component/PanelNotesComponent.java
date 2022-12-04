package jswing.component;

import jswing.ScrollBarCustom;

import java.awt.Color;
import javax.swing.JColorChooser;
import net.miginfocom.swing.MigLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.text.AttributeSet;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyleContext;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.LabelView;
import javax.swing.text.ViewFactory;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Element;
import javax.swing.text.View;
import javax.swing.text.ParagraphView;
import javax.swing.text.IconView;
import javax.swing.text.BoxView;
import javax.swing.text.ComponentView;
import java.awt.Font;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.MutableAttributeSet;
import javax.swing.DefaultListModel;

public class PanelNotesComponent extends javax.swing.JPanel {
        private MigLayout layout;
        CheckListItem[] cList1;
        CheckListItem[] cList2;

        public PanelNotesComponent() {
                initComponents();
                initCheckList();
                fixScrollBar(jScrollPane1);
                fixScrollBar(jScrollPane3);
                fixScrollBar(jScrollPane5);

        }

        public void initCheckList() {
                cList1 = new CheckListItem[] {
                                new CheckListItem("Add your Tasks here!"),
                                new CheckListItem("Add them by pressing buttons above ^!"),
                                new CheckListItem(""),
                                new CheckListItem(""),
                                new CheckListItem(""),
                                new CheckListItem(""),
                                new CheckListItem(""),
                                new CheckListItem("")
                };
                cList2 = new CheckListItem[] {
                                new CheckListItem("Here is another sticky note just for you!") };
                jList3 = new JList(cList1);
                jList3.setCellRenderer(new CheckListRenderer());
                jList3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                jList3.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent event) {
                                JList list = (JList) event.getSource();
                                int index = list.locationToIndex(event.getPoint());// Get index of item
                                                                                   // clicked
                                CheckListItem item = (CheckListItem) list.getModel()
                                                .getElementAt(index);
                                item.setSelected(!item.isSelected()); // Toggle selected state
                                list.repaint(list.getCellBounds(index, index));// Repaint cell
                        }
                });
                jList3.setBackground(new Color(255, 255, 204));
                jScrollPane5.setViewportView(jList3);

                jList1 = new JList(cList2);
                jList1.setCellRenderer(new CheckListRenderer());
                jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                jList1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent event) {
                                JList list = (JList) event.getSource();
                                int index = list.locationToIndex(event.getPoint());// Get index of item
                                                                                   // clicked
                                CheckListItem item = (CheckListItem) list.getModel()
                                                .getElementAt(index);
                                item.setSelected(!item.isSelected()); // Toggle selected state
                                list.repaint(list.getCellBounds(index, index));// Repaint cell
                        }
                });
                jList1.setBackground(new Color(204, 255, 255));
                jScrollPane3.setViewportView(jList1);

        }

        public void initTextPane() {
                jTextPane1.setEditorKit(new WrapEditorKit());
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                buttonEffect2 = new jswing.ButtonEffect();
                addC1 = new jswing.ButtonEffect();
                buttonEffect7 = new jswing.ButtonEffect();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTextPane1 = new javax.swing.JTextPane();
                jScrollPane3 = new javax.swing.JScrollPane();
                jList1 = new javax.swing.JList<>();
                fontSize = new javax.swing.JComboBox<>();
                fontFamily = new javax.swing.JComboBox<>();
                addC2 = new jswing.ButtonEffect();
                boldButton = new jswing.ButtonEffect();
                italicsButton = new jswing.ButtonEffect();
                underlineButton = new jswing.ButtonEffect();
                jScrollPane5 = new javax.swing.JScrollPane();
                jList3 = new javax.swing.JList<>();
                deleteC1 = new jswing.ButtonEffect();
                deleteC2 = new jswing.ButtonEffect();

                setBackground(new java.awt.Color(51, 51, 51));

                buttonEffect2.setBackground(new java.awt.Color(51, 153, 255));
                buttonEffect2.setForeground(new java.awt.Color(255, 255, 255));
                buttonEffect2.setText("Change Font Color");
                buttonEffect2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonEffect2ActionPerformed(evt);
                        }
                });

                addC1.setBackground(new java.awt.Color(255, 255, 204));
                addC1.setText("Add CheckBox");
                addC1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addC1ActionPerformed(evt);
                        }
                });

                buttonEffect7.setBackground(new java.awt.Color(51, 153, 255));
                buttonEffect7.setForeground(new java.awt.Color(255, 255, 255));
                buttonEffect7.setText("Save");
                buttonEffect7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonEffect7ActionPerformed(evt);
                        }
                });

                jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                jTextPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                jScrollPane1.setViewportView(jTextPane1);

                jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                jList1.setBackground(new java.awt.Color(204, 255, 255));
                jScrollPane3.setViewportView(jList1);

                fontSize.setModel(
                                new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "12", "14", "18", "24" }));
                fontSize.setSelectedIndex(1);
                fontSize.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                fontSizeActionPerformed(evt);
                        }
                });

                fontFamily.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Calibri",
                                "Courier New", "SansSerif", "Segoe UI", "Times New Roman" }));
                fontFamily.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                fontFamilyActionPerformed(evt);
                        }
                });

                addC2.setBackground(new java.awt.Color(204, 255, 255));
                addC2.setText("Add CheckBox");
                addC2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addC2ActionPerformed(evt);
                        }
                });

                boldButton.setBackground(new java.awt.Color(51, 153, 255));
                boldButton.setForeground(new java.awt.Color(255, 255, 255));
                boldButton.setText("B");
                boldButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                boldButtonActionPerformed(evt);
                        }
                });

                italicsButton.setBackground(new java.awt.Color(51, 153, 255));
                italicsButton.setForeground(new java.awt.Color(255, 255, 255));
                italicsButton.setText("I");
                italicsButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                italicsButtonActionPerformed(evt);
                        }
                });

                underlineButton.setBackground(new java.awt.Color(51, 153, 255));
                underlineButton.setForeground(new java.awt.Color(255, 255, 255));
                underlineButton.setText("U");
                underlineButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                underlineButtonActionPerformed(evt);
                        }
                });

                jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                jList3.setBackground(new java.awt.Color(255, 255, 204));
                jScrollPane5.setViewportView(jList3);

                deleteC1.setBackground(new java.awt.Color(255, 255, 204));
                deleteC1.setText("Delete CheckBox");
                deleteC1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deleteC1ActionPerformed(evt);
                        }
                });

                deleteC2.setBackground(new java.awt.Color(204, 255, 255));
                deleteC2.setText("Delete CheckBox");
                deleteC2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deleteC2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane1)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(6, 6, 6)
                                                                                                                                .addComponent(fontSize,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(fontFamily,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                154,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(boldButton,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(italicsButton,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(underlineButton,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(buttonEffect2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                122,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(0, 29, Short.MAX_VALUE)))
                                                                .addGap(21, 21, 21)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jScrollPane3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                277, Short.MAX_VALUE)
                                                                                .addComponent(buttonEffect7,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                110,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jScrollPane5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(deleteC1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(deleteC2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(addC1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(addC2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(32, 32, 32)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(buttonEffect2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(buttonEffect7,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(fontSize,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(fontFamily,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(addC1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(addC2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(boldButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(italicsButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(underlineButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(deleteC1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(deleteC2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jScrollPane5,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                260,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jScrollPane3,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                261,
                                                                                                                Short.MAX_VALUE))
                                                                                .addComponent(jScrollPane1))
                                                                .addGap(50, 50, 50)));
        }// </editor-fold>

        private void buttonEffect2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                JColorChooser colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(this, "Choose Color for Font", Color.BLACK);
                int start = jTextPane1.getSelectionStart();
                int end = jTextPane1.getSelectionEnd();
                int selectedLength = end - start;
                StyledDocument style = jTextPane1.getStyledDocument();

                // this give your attribute set of selected Text.
                AttributeSet oldSet = style.getCharacterElement(end - 1).getAttributes();

                // StyleContext for creating attribute set
                StyleContext sc = StyleContext.getDefaultStyleContext();

                // Attribute set which contains new color with old attributes
                AttributeSet s = sc.addAttribute(oldSet, StyleConstants.Foreground, color);
                // This set the color of the Text
                style.setCharacterAttributes(start, selectedLength, s, true);

        }

        private void addC1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                CheckListItem[] copyList = new CheckListItem[cList1.length + 1];
                System.arraycopy(cList1, 0, copyList, 0, cList1.length);
                copyList[cList1.length] = new CheckListItem("Task" + cList1.length + 1 + "Added!");
                cList1 = copyList;
                jList3 = new JList(cList1);
                jList3.revalidate();
                jList3.repaint();
        }

        private void buttonEffect7ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void addC2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void fontSizeActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                String strSize = (String) fontSize.getSelectedItem();
                int size = Integer.valueOf(strSize);
                int start = jTextPane1.getSelectionStart();
                int end = jTextPane1.getSelectionEnd();
                int selectedLength = end - start;
                StyledDocument style = jTextPane1.getStyledDocument();

                // this give your attribute set of selected Text.
                AttributeSet oldSet = style.getCharacterElement(end - 1).getAttributes();

                // StyleContext for creating attribute set
                StyleContext sc = StyleContext.getDefaultStyleContext();

                // Attribute set which contains new fontsize with old attributes
                AttributeSet s = sc.addAttribute(oldSet, StyleConstants.FontSize, size);
                // This set the color of the Text
                style.setCharacterAttributes(start, selectedLength, s, true);

        }

        private void fontFamilyActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                String fFamily = (String) fontFamily.getSelectedItem();
                int start = jTextPane1.getSelectionStart();
                int end = jTextPane1.getSelectionEnd();
                int selectedLength = end - start;
                StyledDocument style = jTextPane1.getStyledDocument();

                // this give your attribute set of selected Text.
                AttributeSet oldSet = style.getCharacterElement(end - 1).getAttributes();

                // StyleContext for creating attribute set
                StyleContext sc = StyleContext.getDefaultStyleContext();

                // Attribute set which contains new color with old attributes
                AttributeSet s = sc.addAttribute(oldSet, StyleConstants.FontFamily, fFamily);
                // This set the color of the Text
                style.setCharacterAttributes(start, selectedLength, s, true);
        }

        private void boldButtonActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                int start = jTextPane1.getSelectionStart();
                int end = jTextPane1.getSelectionEnd();
                int selectedLength = end - start;
                StyledDocument style = jTextPane1.getStyledDocument();

                // this give your attribute set of selected Text.
                AttributeSet oldSet = style.getCharacterElement(end - 1).getAttributes();
                MutableAttributeSet ms = new SimpleAttributeSet();
                // StyleContext for creating attribute set
                StyleContext sc = StyleContext.getDefaultStyleContext();

                // Attribute set which contains new style with old attributes
                AttributeSet s;
                if (boldButton.isSelected()) {
                        s = sc.addAttribute(oldSet, StyleConstants.Bold, false);
                        boldButton.setBackground(new Color(51, 153, 255));
                        boldButton.setSelected(false);
                        StyleConstants.setBold(ms, false);
                } else {
                        s = sc.addAttribute(oldSet, StyleConstants.Bold, true);
                        boldButton.setBackground(new Color(51, 204, 0));
                        boldButton.setSelected(true);
                }
                // This set the color of the Text
                style.setCharacterAttributes(start, end, s, true);
                style.setCharacterAttributes(start, selectedLength, s, true);

        }

        private void italicsButtonActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                int start = jTextPane1.getSelectionStart();
                int end = jTextPane1.getSelectionEnd();
                int selectedLength = end - start;
                StyledDocument style = jTextPane1.getStyledDocument();

                // this give your attribute set of selected Text.
                AttributeSet oldSet = style.getCharacterElement(end - 1).getAttributes();

                // StyleContext for creating attribute set
                StyleContext sc = StyleContext.getDefaultStyleContext();

                // Attribute set which contains new color with old attributes
                AttributeSet s;
                if (italicsButton.isSelected()) {
                        s = sc.addAttribute(oldSet, StyleConstants.Italic, false);
                        italicsButton.setBackground(new Color(51, 153, 255));
                        italicsButton.setSelected(false);
                } else {
                        s = sc.addAttribute(oldSet, StyleConstants.Italic, true);
                        italicsButton.setBackground(new Color(51, 204, 0));
                        italicsButton.setSelected(true);
                }
                // This set the color of the Text
                style.setCharacterAttributes(start, selectedLength, s, true);
        }

        private void underlineButtonActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                int start = jTextPane1.getSelectionStart();
                int end = jTextPane1.getSelectionEnd();
                int selectedLength = end - start;
                StyledDocument style = jTextPane1.getStyledDocument();

                // this give your attribute set of selected Text.
                AttributeSet oldSet = style.getCharacterElement(end - 1).getAttributes();

                // StyleContext for creating attribute set
                StyleContext sc = StyleContext.getDefaultStyleContext();

                // Attribute set which contains new color with old attributes
                AttributeSet s;
                if (underlineButton.isSelected()) {
                        s = sc.addAttribute(oldSet, StyleConstants.Underline, false);
                        underlineButton.setBackground(new Color(51, 153, 255));
                        underlineButton.setSelected(false);
                } else {
                        s = sc.addAttribute(oldSet, StyleConstants.Underline, true);
                        underlineButton.setBackground(new Color(51, 204, 0));
                        underlineButton.setSelected(true);
                }
                // This set the color of the Text
                style.setCharacterAttributes(start, selectedLength, s, true);
        }

        private void deleteC1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                int index = jList3.getSelectedIndex();
                // check if the array is empty or index is out of bounds
                if (cList1 == null || cList1.length <= 0) {
                        System.out.println("No removal operation can be performed!!");
                } else {
                        // create an array to hold elements after deletion
                        CheckListItem[] copyArray = new CheckListItem[cList1.length - 1];

                        // copy elements from original array from beginning till index into copyArray
                        System.arraycopy(cList1, 0, copyArray, 0, index);

                        // copy elements from original array from index+1 till end into copyArray
                        System.arraycopy(cList1, index + 1, copyArray, index, cList1.length - index - 1);
                        jList3 = new JList(copyArray);
                }
        }

        private void deleteC2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }
        //

        public void fixScrollBar(JScrollPane scroll) {
                scroll.getViewport().setBackground(Color.WHITE);
                scroll.setVerticalScrollBar(new ScrollBarCustom());
                JPanel p = new JPanel();
                p.setBackground(Color.WHITE);
                scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
                scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
        }

        // Variables declaration - do not modify
        private jswing.ButtonEffect addC1;
        private jswing.ButtonEffect addC2;
        private jswing.ButtonEffect boldButton;
        private jswing.ButtonEffect buttonEffect2;
        private jswing.ButtonEffect buttonEffect7;
        private jswing.ButtonEffect deleteC1;
        private jswing.ButtonEffect deleteC2;
        private javax.swing.JComboBox<String> fontFamily;
        private javax.swing.JComboBox<String> fontSize;
        private jswing.ButtonEffect italicsButton;
        private javax.swing.JList<String> jList1;
        private javax.swing.JList<String> jList3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JTextPane jTextPane1;
        private jswing.ButtonEffect underlineButton;
        // End of variables declaration
}

class CheckListItem {

        private String label;
        private boolean isSelected = false;

        public CheckListItem(String label) {
                this.label = label;
        }

        public boolean isSelected() {
                return isSelected;
        }

        public void setSelected(boolean isSelected) {
                this.isSelected = isSelected;
        }

        @Override
        public String toString() {
                return label;
        }
}

// http://www.java2s.com/Tutorials/Java/Swing_How_to/JList/Create_JList_of_CheckBox.htm
class CheckListRenderer extends JCheckBox implements ListCellRenderer {
        public Component getListCellRendererComponent(JList list, Object value,
                        int index, boolean isSelected, boolean hasFocus) {
                setEnabled(list.isEnabled());
                setSelected(((CheckListItem) value).isSelected());
                setFont(list.getFont());
                setBackground(new Color(255, 255, 204));
                setForeground(list.getForeground());
                setText(value.toString());
                return this;
        }
}

// https://community.oracle.com/tech/developers/discussion/2376090/word-wraping-behaviour-in-jtextpane-since-java-7
class WrapEditorKit extends StyledEditorKit {
        ViewFactory defaultFactory = new WrapColumnFactory();

        public ViewFactory getViewFactory() {
                return defaultFactory;
        }

}

class WrapColumnFactory implements ViewFactory {
        public View create(Element elem) {
                String kind = elem.getName();
                if (kind != null) {
                        if (kind.equals(AbstractDocument.ContentElementName)) {
                                return new WrapLabelView(elem);
                        } else if (kind.equals(AbstractDocument.ParagraphElementName)) {
                                return new ParagraphView(elem);
                        } else if (kind.equals(AbstractDocument.SectionElementName)) {
                                return new BoxView(elem, View.Y_AXIS);
                        } else if (kind.equals(StyleConstants.ComponentElementName)) {
                                return new ComponentView(elem);
                        } else if (kind.equals(StyleConstants.IconElementName)) {
                                return new IconView(elem);
                        }
                }

                // default to text display
                return new LabelView(elem);
        }
}

class WrapLabelView extends LabelView {
        public WrapLabelView(Element elem) {
                super(elem);
        }

        public float getMinimumSpan(int axis) {
                switch (axis) {
                        case View.X_AXIS:
                                return 0;
                        case View.Y_AXIS:
                                return super.getMinimumSpan(axis);
                        default:
                                throw new IllegalArgumentException("Invalid axis: " + axis);
                }
        }

}