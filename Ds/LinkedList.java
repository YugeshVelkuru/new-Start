package Ds;




public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node Next;

        Node(int value){
            this.value = value;
        }
    }
        public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print( temp.value + "->");
            temp = temp.Next;
        }
    }

    public void getHead(){
        System.out.println("Head : " + head.value);
    }
    public void getTail(){
        System.out.println("Tail : " + tail.value);
    }

    public void getlength(){
        System.out.println("Length :" + length);
    }
}


