package Box;

public class Box3D {
    private double width;
    private double height;
    private static double length;
    private static String color;

    public Box3D(double width, double height){
        System.out.println("KK");
    }

    public double computevolume() {
        double area = getHeight()*getLength()*getWidth();
        return area;
    }
    public boolean canCover (Box3D b) {
        return computevolume() > b.computevolume() ? true:false;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static double getLength() {
        return length;
    }

    public static void setLength(double length) {
        Box3D.length = length;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Box3D.color = color;
    }

    @Override
    public String toString() {
        return "Box3D{" + "width=" + width + ", height=" + height + ", length="+length+", color="+color+'}';
    }


}
