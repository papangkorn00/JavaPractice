package containment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Container <T> {
    private static final int SIZE = 5;
    private T[] box = (T[]) new Object[SIZE];
    private int count;

    public boolean add(T t){
        if (t == null || count == SIZE) return false;
        for (int i =0; i < count; i++){
            if(box[i] == t) return false;
        }
        box[count++] = t;
        return true;
    }

    private final int locate(T t){
        if (t == null) return -1;
        for(int i =0; i < count; i++){
            if(box[i].equals(t)) return i;
        }
        return -1;
    }

    public T find (T t){
        int i = locate(t);
        return i == -1 ? null : box[i];
    }

    public T delete (T t){
        int i = locate(t);
        if (i == -1) return null;
        t = box[i];
        return t;
    }
    @Override
    public String toString(){
        var b = new StringBuilder();
        b.append("Container[");
        for(int i =0; i < count; i++){
            b.append("/n  ").append(box[i]);
        }
        b.append("]");
        return b.toString();
    }

    public Container<T> sort(){
        if (count < 2) return this;
        Arrays.sort(box,0,count);
        return this;
    }

    public Container<T> sort(Comparator<T> comp){
        if (count < 2) return this;
        Arrays.sort(box,0,count,comp);
        return this;
    }
}
