package ru.vsu.cs.util.steblev_d_v.oop.tasks.task1_14;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.print();
        int x = list.get(0);
        list.get(1);
        System.out.println(x);
        list.remove(1);
        list.print();
        list.get(0);

    }
}