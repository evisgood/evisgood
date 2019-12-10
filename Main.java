package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<Integer>();

            linkedList.add(75);
            linkedList.add(76);
            linkedList.add(100);
            linkedList.add(-1);
            linkedList.add(0);
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            linkedList.add(4);
            linkedList.add(5);

            System.out.println("My LinkedList before reversing: " + linkedList);

                    Collections.reverse(linkedList);//reversing using collections

            System.out.println("My LinkedList after reversing: " + linkedList);
        }
}

# LinkedList-HW
