package usefulstuff.singlylinkedlist;

import java.util.ArrayList;

public class SinglyLinkedList {

   public Node head;


    public SinglyLinkedList(){
        this.head = null;
    }


    public static SinglyLinkedList arrayToLinkedList (int[] inputArray){
       SinglyLinkedList outputLinkedList = new SinglyLinkedList();

       for (int i : inputArray){
           outputLinkedList.addLast(i);
       }
       return outputLinkedList;
    }


    public void addFirst(int valueToBeAdded){
       if (this.head == null){
           this.head = new Node(valueToBeAdded, null);
       }
       else {
           Node temp = this.head;
           this.head = new Node(valueToBeAdded,temp);
       }
    }



    public void addLast(int valueToBeAdded){
       if (this.head == null){
           this.head = new Node(valueToBeAdded, null);
           }
       else {
           Node potentialLastNode = this.head;

           while (potentialLastNode.next != null){
               potentialLastNode = potentialLastNode.next;

           }
           potentialLastNode.next = new Node(valueToBeAdded,null);
       }
    }

    public ArrayList<Integer> convertToArrayList(){
       ArrayList<Integer> outputArrayList = new ArrayList<Integer>();

       if (this.head == null){
           return null;
       }
       else {
           Node nodeBeingProcessed = this.head;
           while (nodeBeingProcessed != null){
               outputArrayList.add(nodeBeingProcessed.value);
               nodeBeingProcessed = nodeBeingProcessed.next;
           }

       }
       return outputArrayList;
    }
}
