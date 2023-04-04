package human;

public  class Person {
    protected final int id;
    protected  final  String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override public String toString() {
        return "Person[" + "," + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        return this == o || this.id == ((Person) o).id;
    }
}
