
package geneic_type;

public class GenericTutorial {
    public static void main(String[] args) {
        MyList<Ball> balls = new MyList<>();
        MyList<Table> tables = new MyList<>();
        
        balls.add(new Ball("Red"));
        balls.add(new Ball("Green"));
        balls.add(new Ball("White"));
        
        tables.add(new Table(13));
        tables.add(new Table(30));
        
        System.out.println(balls.get(1));
        System.out.println(tables.get(1));
    }
}

class MyList<T>{
    private T[] items;
    private int size;

    public MyList() {
        this.items = (T[]) new Object[10];
        this.size = 0;
    }
    
    public void add(T item){
        if(size == items.length){
            System.out.println("List is full");
            return ;
        }
        items[size] = item;
        size++;
    }
    
    public T get(int index){
        if (index < 0){
            System.out.println("Index not found");
            return null;
        }
        
        if(index >= size){
            System.out.println("Index not found");
            return null;
        }
        
        return items[index];
    }
    
}

class Ball{
    private String color;
    
    public Ball(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Ball{" + "color=" + color + '}';
    }
    
    
}

class Table{
    private int id;
    
    public Table(int id){
        this.id = id;
    }

    public int getTableId() {
        return id;
    }

    @Override
    public String toString() {
        return "Table{" + "id=" + id + '}';
    }
    
    
}