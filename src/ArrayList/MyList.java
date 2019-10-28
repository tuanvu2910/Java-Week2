package ArrayList;

import java.util.Arrays;

public class MyList<E> {
    public int size =0;
    static final int DEFAULT_CAPACITY = 10;
    public Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capa){
        element = new Object[capa];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(int index, E e){
        if ( size != 0 && size == DEFAULT_CAPACITY) {
            esurecapain(size*2);

        } else {
            for (int i = index; i < element.length; i++) {
                element[index + 1] = element[index];
            }
            element[index] = e;
            size++;
        }

    }



    public E remove(int index){
      for (int i = index;i<element.length-1;i++){
          element[i] = element[i+1];
      }
      size--;
      return (E) element;
    };
   public MyList<E> clone(){
       return this;
   }
   public boolean cointains(E o){
       for (int i =0;i<size;i++){
           if (element[i].equals(o)){
               return true;
           }
       }
       return false;
   }
   public int indexOf (E o){
       for (int i =0;i<size;i++){
           if (element[i].equals(o)){
               return i;
           }
       }
       return -1;
   }
   public boolean add(E e){
       if (size == element.length){
           esurecapain(size*2);
       }
       element[size++] = e;
       return true;

   }
   public E get(int index){
       return (E) element[index];

   }
   public void clear(){
       Arrays.fill(element, null);
       size =0;
   }

    public void esurecapain (int minCapacity){
        element = Arrays.copyOf(element, minCapacity);

    }


}
