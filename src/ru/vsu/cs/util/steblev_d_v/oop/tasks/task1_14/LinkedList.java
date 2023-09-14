package ru.vsu.cs.util.steblev_d_v.oop.tasks.task1_14;

import org.w3c.dom.Node;

import java.util.ListIterator;

public class LinkedList<T> implements SimpleLinkedList<T> {

    private Node head; // 1 элемент

    public LinkedList() {
        this.head = null;
    }

    protected class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    @Override
    public void add(T value) {
        Node newNode = new Node(value);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        System.out.println("В список был добавлен новый элемент: " + newNode.data);

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void print() {
        int curInd = 0;
        Node currentNode = head;

        if (head != null) {
            System.out.print("[" + head.data + ", ");
            curInd++;
            while (curInd != this.size() - 1) {
                curInd++;
                currentNode = currentNode.next;
                System.out.print(currentNode.data + ", "); // Вывод через запятую
            }

        }
        if (curInd == this.size() - 1) { // Проверка если элемент последний - выводим Node + "]"
            System.out.println(currentNode.next.data + "]");
        }
        System.out.println();
    }




    @Override
    public int size() {
        int size = 0;
        Node currentNode = head;
        if (head != null) {
            size++;
            while (currentNode.next != null) {
                size++;
                currentNode = currentNode.next;
            }
        }
        return size;
    }
}



