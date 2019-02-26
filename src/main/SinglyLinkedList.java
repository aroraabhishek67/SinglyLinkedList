package main;

public class SinglyLinkedList {
    private class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head = null;
    private int size = 0;

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        System.out.println(linkedList);
        linkedList.insertHead(42);
        linkedList.insertHead(60);
        linkedList.insertHead(50);
        linkedList.insertHead(40);
        linkedList.insertHead(54);
        System.out.println(linkedList);
        for (int i = 0; i < 10; i++) {

        }
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("[");
        Node temp = this.head;
        while (temp != null) {
            response.append(temp.getData());
            if (temp.next != null) {
                response.append(" => ");
            }
            temp = temp.next;

        }


        response.append("]");
        return response.toString();
    }

    private void insertHead(int data) {
        Node newNode = new Node(data, this.head);
        this.head = newNode;
        size++;

    }

    private void insertAfter(int data, Node node) {
        Node newNode = new Node(data, node.next);
        node.next = newNode;

        size++;
    }
 public void insert(int data)
 {
     if(head==null)
     {
         insertHead(data);

     }
      else
     {
      Node temp =this.head;
      while(temp!=null)
      {
          temp=temp.next;
      }
      insertAfter(data, temp);




     }



 }


}