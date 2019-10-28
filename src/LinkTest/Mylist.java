package LinkTest;


import java.util.Arrays;

public class Mylist<E> extends MyListTest {
    public int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Mylist(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newsize = elements.length *2 ;
        elements = Arrays.copyOf(elements,newsize);
    }
    public void add(int e) {
        if (size == elements.length){
             ensureCapa();
        } else {
            elements[size++] = e;

        }
    }



    public E get(int i){
        if (i >= size||i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );

        }
        return (E) elements[i];
    }
}
