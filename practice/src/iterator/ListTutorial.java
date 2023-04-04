package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Test{
    public static void main(String[] args) {
        ListTutorial<String> listT = new ListTutorial<>();
        
        listT.add("Test1");
        listT.add("Test2");
        listT.add("Test3");
        listT.add("Test4");
        listT.add("Test5");
        listT.add("Test6");
        
        for(String str : listT ){
            System.out.println(str);
        }
    }
}

public class ListTutorial<T> implements Iterable<T> {
    
    private List<T> myList = new ArrayList<>();
    
    public void add(T ts){
        myList.add(ts);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(myList);
    }

    public class MyIterator<E> implements Iterator<E> {

        int currentPosition;
        List<E> lists;

        public MyIterator(List<E> lists){
            this.lists = lists;
        }
        
        @Override
        public boolean hasNext() {
            if(lists.size() >= currentPosition +1){
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            E value = lists.get(currentPosition);
            currentPosition++;
            return value;
        }

    }

}
