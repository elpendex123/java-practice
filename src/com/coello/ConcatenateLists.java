package com.coello;

public class ConcatenateLists {
    public static void main(String[] args) {
        MyList l1 = new MyList("List #1");
        System.out.println(l1);

        MyList l2 = new MyList("List #2");
        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(l2);

        MyList l3 = new MyList("List #3");
        l3.add(4);
        l3.add(5);
        l3.add(6);
        System.out.println(l3);

        l1.concatenateLists(l2, l3);
        System.out.println(l1);
    }
}
