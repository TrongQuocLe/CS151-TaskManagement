package jswing.model;

import javax.swing.Icon;

public class ModelCard {

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
        /**
     * @return the title
     */
    public String getTitle2() {
        return title2;
    }

    /**
     * @param title the title to set
     */
    public void setTitle2(String title) {
        this.title2 = title;
    }

    /**
     * @return the values
     */
    public double getValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(double values) {
        this.values = values;
    }

    /**
     * @return the percentage
     */
    public int getPercentage() {
        return percentage;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    /**
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }
    public ModelCard(String title, String title2, double values, int percentage, Icon icon){
        this.title = title;
        this.title2 = title2;
        this.values = values;
        this.percentage = percentage;
        this.icon = icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    private String title;
    private String title2;
    private double values;
    private int percentage;
    private Icon icon;
}
