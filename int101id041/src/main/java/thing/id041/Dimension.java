// 65130500041
// Papangkorn Kijsakulrat
package thing.id041;

import quanity.id041.Measure;

public class Dimension {

    private String title;
    private final Measure height;
    private final Measure width;

    public Dimension(String title, Measure height, Measure width) {
        this.title = title;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Dimension{" + "title=" + title + ", height=" + height + ", width=" + width + '}';
    }

    public void ChangeHeight(double newHeight) {
        height.setValue(newHeight);
    }

    public String getHeightUnit() {
        return height.getUnit();
    }

    public double getHeightValue() {
        return height.getValue();
    }

}
