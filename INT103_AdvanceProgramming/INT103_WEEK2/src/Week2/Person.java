package Week2;

public class Person {
    public int pub;
    protected int pro;
    int defa;
    private int pri;

    public int med(){
        defa = 2;
        pri = 0;
        return defa + pri ;
    }
}


