// Reference code https://github.com/DJ-Raven/java-swing-school-management-dashboard
package jswing.component;

import jswing.ScrollBarCustom;
import jswing.event.EventMenuSelected;
import jswing.event.EventShowPopupMenu;
import jswing.MenuItem;
import jswing.event.EventMenu;
import jswing.model.ModelMenu;
import jswing.MenuAnimation;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;

public class TaskMenu extends javax.swing.JPanel {

    /**
     * @param event the event to set
     */
    public void setEvent(EventMenuSelected event) {
        this.event = event;
    }

    /**
     * @return the eventShowPopup
     */
    public EventShowPopupMenu getEventShowPopup() {
        return eventShowPopup;
    }

    /**
     * @param eventShowPopup the eventShowPopup to set
     */
    public void setEventShowPopup(EventShowPopupMenu eventShowPopup) {
        this.eventShowPopup = eventShowPopup;
    }

    /**
     * @param enableMenu the enableMenu to set
     */
    public void setEnableMenu(boolean enableMenu) {
        this.enableMenu = enableMenu;
    }

    /**
     * @param showMenu to set the state of the menu
     */
    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }

    /**
     * @return the showMenu. Checks to see if menu is showing
     */
    public boolean getShowMenu() {
        return showMenu;
    }

    private final MigLayout layout;
    private EventMenuSelected event;
    private EventShowPopupMenu eventShowPopup;
    private boolean enableMenu = true;
    private boolean showMenu = true;

    public TaskMenu() {
        initComponents();
        setOpaque(false);
        sp.getViewport().setOpaque(false);
        sp.setVerticalScrollBar(new ScrollBarCustom());
        layout = new MigLayout("wrap, fillx, insets 0", "[fill]", "[]0[]");
        panel.setLayout(layout);

    }

    public void initMenuItem() {

        addToMenu(new ModelMenu(createImageIcon(
                "/icons/icons8-home-32.png"), "Home"));
        addToMenu(new ModelMenu(createImageIcon(
                "/icons/icons8-inbox-32.png"), "Inbox"));
        addToMenu(new ModelMenu(createImageIcon(
                "/icons/icons8-stopwatch-32.png"), "Upcoming Tasks", "task1", "task2", "task3"));
        addToMenu(new ModelMenu(createImageIcon(
                "/icons/icons8-rubik's-cube-32.png"), "Workspace", "Create New +", "SJSU-Fall'22", "SJSU-Spring'23",
                "Twitter(Internship)"));
        addToMenu(new ModelMenu(createImageIcon(
                "/icons/icons8-container-32.png"), "Containers", "Create New +", "CS-151", "Math-163"));
        addToMenu(new ModelMenu(createImageIcon(
                "/icons/icons8-component-32.png"), "Components", "Create New +", "TaskManagement Dashboard"));
        addToMenu(new ModelMenu(createImageIcon(
                "/icons/icons8-pushpin-32.png"), "Tasks", "Create Functions for Buttons"));
        addToMenu(new ModelMenu(createImageIcon(
                "/icons/icons8-add-to-favorites-32.png"), "Favorites", "CS-151", "MATH-163", "AWS-S3-ETL"));
        addToMenu(new ModelMenu(createImageIcon(
                "/icons/icons8-note-32.png"), "Notes", "Meetings", "Lectures", "Study"));
        addToMenu(new ModelMenu(createImageIcon(
                "/icons/icons8-calendar-32.png"), "Calendar"));
        addToMenu(new ModelMenu(createImageIcon(
                "/icons/icons8-google-classroom-32.png"), "Collaborators", "Collaborator1", "Collaborator2",
                "Collaborator3"));

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

    private void addToMenu(ModelMenu menu) {
        panel.add(new MenuItem(menu, getEventMenu(), event, panel.getComponentCount()), "h 40!");
    }

    private EventMenu getEventMenu() {
        return new EventMenu() {
            @Override
            public boolean menuPressed(Component com, boolean open) {
                if (enableMenu) {
                    if (getShowMenu()) {
                        if (open) {
                            new MenuAnimation(layout, com).openMenu();
                        } else {
                            new MenuAnimation(layout, com).closeMenu();
                        }
                        return true;
                    } else {
                        eventShowPopup.showPopup(com);
                    }
                }
                return false;
            }
        };
    }

    public void hideallMenu() {
        for (Component com : panel.getComponents()) {
            MenuItem item = (MenuItem) com;
            if (item.isOpen()) {
                new MenuAnimation(layout, com, 500).closeMenu();
                item.setOpen(false);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        brand1 = new Brand();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setViewportBorder(null);

        panel.setOpaque(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 312, Short.MAX_VALUE));
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 523, Short.MAX_VALUE));

        sp.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(brand1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(brand1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)));
    }// </editor-fold>

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, new Color(51, 51, 51), getWidth(), 0, new Color(17, 17, 17));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify
    private Brand brand1;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane sp;
    // End of variables declaration
}
