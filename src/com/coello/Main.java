package com.coello;

public class Main {

    public static void main(String[] args) {
        MyList l1 = new MyList("List #1");
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);

        MyList l2 = new MyList("List #1");
        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(l2);

        MyList l3 = new MyList("List #3");
        l3.add(4);
        l3.add(5);
        l3.add(6);
        System.out.println(l3);

        System.out.println("\nComparing:");

        System.out.println("\nComparing to self, should be true");
        if (l1.equals(l1))
            System.out.println("Same");
        else
            System.out.println("Different");

        System.out.println("\nComparing to list 2, same values, should be true");
        if (l1.equals(l2))
            System.out.println("Same");
        else
            System.out.println("Different");

        System.out.println("\nComparing to different name and values, should be false");
        if (l1.equals(l3))
            System.out.println("Same");
        else
            System.out.println("Different");
    }
}

