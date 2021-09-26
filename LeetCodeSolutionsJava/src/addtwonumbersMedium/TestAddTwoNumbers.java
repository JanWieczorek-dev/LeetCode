package addtwonumbersMedium;

import usefulstuff.singlylinkedlist.Node;
import usefulstuff.singlylinkedlist.SinglyLinkedList;

//there would be less code if I simply treated Linked Lists as nodes rather than
// creating a special "LinkedList" class

public class TestAddTwoNumbers {

    public static SinglyLinkedList addTwoNumbers (SinglyLinkedList list1, SinglyLinkedList list2){

        int outputSum = convertLinkedListToAnInt(list1) + convertLinkedListToAnInt(list2);

        SinglyLinkedList outputList = convertAnIntToALinkedList(outputSum);

        System.out.println(outputList.convertToArrayList().toString());

        return outputList;


    }

    public static int convertLinkedListToAnInt(SinglyLinkedList inputList) {

        int outputInt = 0;
        Node nodeBeingProcessed = inputList.head;
        int decimalMultiplier = 1;
        while (nodeBeingProcessed != null){
            outputInt += nodeBeingProcessed.value * decimalMultiplier;
            decimalMultiplier *=10;
            nodeBeingProcessed =nodeBeingProcessed.next;
        }
        return outputInt;
    }

    public static SinglyLinkedList convertAnIntToALinkedList(int inputInt){

        SinglyLinkedList outputList = new SinglyLinkedList();
        int decimalMultiplier = 10;
        int lengthOfTheInput = String.valueOf(inputInt).length();

        for (int i = 1; i <= lengthOfTheInput; i++){
            int valueToInsertIntoTheList = ((inputInt % decimalMultiplier)*10)/decimalMultiplier;
            outputList.addLast(valueToInsertIntoTheList);
            inputInt -=valueToInsertIntoTheList;
            decimalMultiplier *=10;
        }
        return outputList;
    }


    public static void main(String[] args) {

        int[] array1 = {2,4,3};
        int[] array2 = {5,6,4};

        SinglyLinkedList l1 = SinglyLinkedList.arrayToLinkedList(array1);
        SinglyLinkedList l2 = SinglyLinkedList.arrayToLinkedList(array2);
        addTwoNumbers(l1,l2);

        int[] array3 = {0};
        int[] array4 = {0};

        SinglyLinkedList l3 = SinglyLinkedList.arrayToLinkedList(array3);
        SinglyLinkedList l4 = SinglyLinkedList.arrayToLinkedList(array4);
        addTwoNumbers(l3,l4);

        int[] array5 = {9,9,9,9,9,9,9};
        int[] array6 = {9,9,9,9};

        SinglyLinkedList l5 = SinglyLinkedList.arrayToLinkedList(array5);
        SinglyLinkedList l6 = SinglyLinkedList.arrayToLinkedList(array6);
        addTwoNumbers(l5,l6);





    }
}
