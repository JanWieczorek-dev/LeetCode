package usefulstuff.singlylinkedlist;

public class TestSinglyLinkedList {

    public static void main(String[] args) {

        SinglyLinkedList myList = new SinglyLinkedList();
//        myList.addFirst(5);
//        myList.addFirst(4);
//        myList.addFirst(9876);
//        myList.addFirst(0);
//        myList.addFirst(1);

        myList.addLast(666);
        myList.addLast(6653);
        myList.addLast(116);
        myList.addLast(1000006);
        myList.addLast(1);
        System.out.println(myList.convertToArrayList().toString());
    }



}
