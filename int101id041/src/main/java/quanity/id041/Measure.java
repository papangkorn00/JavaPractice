// 65130500041
// Papangkorn Kijsakulrat
package quanity.id041;

public class Measure {

    private double value;
    private String unit;

    public Measure(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Measure{" + "value=" + value + ", unit=" + unit + '}';
    }

}
