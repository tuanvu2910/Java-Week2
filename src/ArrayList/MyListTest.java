package ArrayList;

public class MyListTest {
    public static void main(String[] args) {


        MyList<String> list = new MyList(10);
        list.add(3,"322");
        list.add(2,"644");
        list.add(0,"solo");
        MyList newlist = list.clone();
        newlist.add(1,"kaka");
        newlist.remove(0);
        System.out.println(newlist.get(2));
        System.out.println(newlist.size);
    }
}
