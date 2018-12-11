package com.company;

public class IntNode {

    private int num;
    private IntNode next;

    public IntNode(int num, IntNode next) {
        this.num = num;
        this.next = next;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public IntNode getNext() {
        return next;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "IntNode{" + "num=" + num + ", next=" + next + '}';
    }

    public static void main(String[] args) {
        IntNode five = new IntNode(5,null);
        IntNode four = new IntNode(4,five);
        IntNode three = new IntNode(3,four);
        IntNode two = new IntNode(2, three);
        IntNode head = new IntNode(1, two);
        printAllNodes(head);
    }

    public static void printAllNodes(IntNode head) {
        //your code here
        IntNode temp = head;
        while(temp != null) {
            System.out.print(temp.getNum() + " ");
            temp = temp.getNext();
        }
    }
}
