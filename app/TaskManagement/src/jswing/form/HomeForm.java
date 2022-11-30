package jswing.form;

import jswing.component.Card;

import jswing.GoogleMaterialDesignIcons;
import jswing.model.ModelCard;
import jswing.GoogleMaterialDesignIcons;
import jswing.IconFontSwing;
import jswing.model.ModelNoticeBoard;
import jswing.component.NoticeBoard;
import jswing.component.TabbedNotes;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.Icon;

public class HomeForm extends javax.swing.JPanel {

        public HomeForm() {
                initComponents();
                setOpaque(false);
                initData();
        }

        private void initData() {
                initCardData();
                initNoticeBoard();
        }

        private void initCardData() {
                Icon dashboard = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.DASHBOARD, 60, new Color(200, 162,
                                200),
                                new Color(162, 200, 162));
                Icon edit = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.EDIT, 60, new Color(200, 162,
                                200),
                                new Color(162, 200, 162));
                Icon android = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.ANDROID, 60, new Color(200, 162,
                                200),
                                new Color(162, 200, 162));
                card1.setData(new ModelCard("Weekly", "Completed Tasks", 0, 0, edit));
                card2.setData(new ModelCard("Labs", "Dashboard Project", 0, 0, dashboard));
                card3.setData(new ModelCard("Homework", "This Week", 0, 0, android));
        }

        private void initNoticeBoard() {
                noticeBoard1.addDate("04/10/2021");
                noticeBoard1.addNoticeBoard(new ModelNoticeBoard(new Color(94, 49, 238), "Hidemode", "Now",
                                "Sets the hide mode for the component. If the hide mode has been specified in the This hide mode can be overridden by the component constraint."));
                noticeBoard1.addNoticeBoard(new ModelNoticeBoard(new Color(218, 49, 238), "Tag", "2h ago",
                                "Tags the component with metadata name that can be used by the layout engine. The tag can be used to explain for the layout manager what the components is showing, such as an OK or Cancel button."));
                noticeBoard1.addDate("03/10/2021");
                noticeBoard1.addNoticeBoard(new ModelNoticeBoard(new Color(32, 171, 43), "Further Reading", "12:30 PM",
                                "There are more information to digest regarding MigLayout. The resources are all available at www.migcomponents.com"));
                noticeBoard1.addNoticeBoard(new ModelNoticeBoard(new Color(50, 93, 215), "Span", "10:30 AM",
                                "Spans the current cell (merges) over a number of cells. Practically this means that this cell and the count number of cells will be treated as one cell and the component can use the space that all these cells have."));
                noticeBoard1.addNoticeBoard(new ModelNoticeBoard(new Color(27, 188, 204), "Skip ", "9:00 AM",
                                "Skips a number of cells in the flow. This is used to jump over a number of cells before the next free cell is looked for. The skipping is done before this component is put in a cell and thus this cells is affected by it. \"count\" defaults to 1 if not specified."));
                noticeBoard1.addNoticeBoard(new ModelNoticeBoard(new Color(238, 46, 57), "Push", "7:15 AM",
                                "Makes the row and/or column that the component is residing in grow with \"weight\". This can be used instead of having a \"grow\" keyword in the column/row constraints."));
                noticeBoard1.scrollToTop();
        }

        /** Returns an ImageIcon, or null if the path was invalid. */
        protected ImageIcon createImageIcon(String path) {
                java.net.URL imgURL = getClass().getResource(path);
                if (imgURL != null) {
                        return new ImageIcon(imgURL);
                } else {
                        System.err.println("Couldn't find file: " + path);
                        return null;
                }
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                card1 = new Card();
                card2 = new Card();
                card3 = new Card();
                card4 = new Card();
                jPanel1 = new javax.swing.JPanel();
                noticeBoard1 = new NoticeBoard();
                jLabel2 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                tabbedNotes1 = new TabbedNotes();

                setBackground(new java.awt.Color(102, 102, 102));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 204, 204));
                jLabel1.setText("HOME/DASHBOARD");

                card1.setBackground(new java.awt.Color(204, 255, 204));
                card1.setColorGradient(new java.awt.Color(0, 204, 204));
                card1.setPreferredSize(new java.awt.Dimension(280, 150));

                card2.setBackground(new java.awt.Color(204, 255, 255));
                card2.setColorGradient(new java.awt.Color(0, 204, 204));
                card2.setMinimumSize(new java.awt.Dimension(280, 150));

                card3.setBackground(new java.awt.Color(102, 255, 255));
                card3.setColorGradient(new java.awt.Color(51, 102, 255));
                card3.setMinimumSize(new java.awt.Dimension(280, 150));

                card4.setBackground(new java.awt.Color(153, 255, 204));
                card4.setColorGradient(new java.awt.Color(153, 204, 255));

                jPanel1.setBackground(new java.awt.Color(51, 51, 51));

                jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Upcoming Tasks");

                jTextField1.setBackground(new java.awt.Color(51, 51, 51));
                jTextField1.setForeground(new java.awt.Color(255, 255, 255));
                jTextField1.setText("@Add an encouraging message for yourself");
                jTextField1.setBorder(null);
                jTextField1.setOpaque(true);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jTextField1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(noticeBoard1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGap(27, 27, 27)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                41,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(noticeBoard1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGap(27, 27, 27)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap())
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(card1,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                308,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGap(32, 32, 32)
                                                                                                .addComponent(card2,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                309,
                                                                                                                Short.MAX_VALUE))
                                                                                .addComponent(tabbedNotes1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(50, 50, 50)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(card3,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                323,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGap(39, 39, 39)
                                                                                                .addComponent(card4,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                297,
                                                                                                                Short.MAX_VALUE))
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(41, 41, 41)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(card1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(card2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                171, Short.MAX_VALUE)
                                                                                .addComponent(card3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(card4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(47, 47, 47)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(tabbedNotes1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                620, Short.MAX_VALUE))
                                                                .addGap(66, 66, 66)));
        }// </editor-fold>

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private Card card1;
        private Card card2;
        private Card card3;
        private Card card4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField jTextField1;
        private NoticeBoard noticeBoard1;
        private TabbedNotes tabbedNotes1;
        // End of variables declaration//GEN-END:variables
}
