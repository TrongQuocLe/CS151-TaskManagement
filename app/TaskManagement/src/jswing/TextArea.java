package jswing;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TextArea extends JTextArea {
    public TextArea() {
        setWrapStyleWord(true);
        setLineWrap(true);
        setBorder(new EmptyBorder(0, 0, 0, 0));
        setSelectionColor(new Color(76, 204, 255));

    }

    public void fixScrollBar(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

}