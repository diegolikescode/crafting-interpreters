package codesample;

import java.util.ArrayList;

class Node {
    private Node next;
    private String data;


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

public class LinkedList {
    private int length;
    private Node head;
    private Node tail;

    public LinkedList() {
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void prepend(Node node) {
        if(this.getLength() == 0) {
            this.setHead(node);
            this.setTail(node);
            this.setLength(this.getLength()+1);
            return;
        }
        node.setNext(this.head);
        this.setHead(node);
        this.setLength(this.getLength()+1);
    }
    public void insertMiddle(int index, Node node) {}
    public void append(Node node) {
        if(this.getLength() == 0 ) {
            this.setHead(node);
            this.setTail(node);
            this.setLength(this.getLength()+1);
            return;
        }
        this.setLength(getLength()+1);
        this.getTail().setNext(node);
        this.setTail(node);
    }
    public void deleteEnd() {}
    public void deleteMiddle(int index) {}
    public Node getFirst() {
        return this.getHead();
    }
    public Node getLast() {
        return this.getTail();
    }
    public Node getMiddle(int index) {
        return new Node();
    }
}
