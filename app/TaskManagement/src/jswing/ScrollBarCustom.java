package jswing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(4, 2));
        setForeground(new Color(255, 255, 255, 150));
        setUnitIncrement(4);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder());
    }
}