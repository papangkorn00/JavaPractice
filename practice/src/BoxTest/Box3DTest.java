

package BoxTest;

import Box.*;
import static Box.Box3D.*;

public class Box3DTest {

    public static void main(String[] args) {
        Box3DTest();
    }
    private static void Box3DTest() {
        Box3D oldBox = new Box3D(123,143);
        oldBox.setHeight(5);
        oldBox.setWidth(2);
        setLength(4.0);
        setColor("red");
        System.out.println(oldBox.getHeight());
        System.out.println(oldBox.getWidth());
        System.out.println(oldBox.toString());
        System.out.println(getLength());

//        System.out.println(old.computevolume());
//        System.out.println(old.toString());


        Box3D newBox = new Box3D(50,34);
        newBox.setHeight(100);
        newBox.setWidth(200);
        setLength(2.0);
        setColor("green");
        System.out.println(newBox.getHeight());
        System.out.println(newBox.getWidth());
        System.out.println(getLength());

        System.out.println(oldBox.canCover(newBox));

    }
}
