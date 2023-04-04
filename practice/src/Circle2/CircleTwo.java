package Circle2;

public class CircleTwo {
    private double radius;
    
    public CircleTwo(){
        radius = 1.0;
    }
    
    public CircleTwo(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        return Math.PI*radius*radius;
    }
    
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    
     public void setRadius(double radius){
         this.radius = radius;
     }
     
     public String toString(){
         return "Circle[radius = ]" + radius ;
     }
}
