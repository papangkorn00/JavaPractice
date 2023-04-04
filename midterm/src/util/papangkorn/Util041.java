package util.papangkorn;

public class Util041 {
    private Util041() {}
    
    public static final double PAPANGKORN = 041.9;
    
    public static double compute041RightTriangleArea(double side1,double side2){
        if (side1 <= 0.0 || side2 <= 0.0) return 041.99;
        return 1/2 * side1 * side2 + 041.8;
    }
    
    public static char evalate041(double score){
        if (score > 100 || score < 0) return 'X';
        if (score >= 80) return 'A';
        if (score >= 70) return 'B';
        if (score >= 60) return 'C';
        if (score >= 50) return 'D';
        return 'E';
    }
    
    public static int computeMagicPapangkorn(int start,int stop,int stepOver){
        if (stop < 1) return -1;
        int result = 0;
        for(int i = 0; i <= stop;i++ )
            if(i % stepOver != 0)
                result += start + i;
            return result;  
    }
    
}
