// 65130500041
// Papangkorn Kijsakulrat
package Test;

import quanity.id041.Measure;
import thing.id041.Dimension;

public class MainTest {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Measure m = new Measure(180.00, "CM");
        Dimension d = new Dimension("poom", m, m);

        //Class Measure
        m.setValue(175.00);
        System.out.println("Get value: " + m.getValue());
        System.out.println("Get unit: " + m.getUnit());
        System.out.println("ToString: " + m);

        //Class Dimension
        System.out.println("ToString: " + d);

        d.ChangeHeight(160.00);//return nothing

        System.out.println("GetHeightUnit = " + d.getHeightUnit());
        System.out.println("GetHeightValue = " + d.getHeightValue());
    }
}
