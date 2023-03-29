package DoublyLinkedLists;

public class Main {
    public static void main(String[] args){
        //DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);

        //myDoublyLinkedList.getHead();
        //myDoublyLinkedList.getTail();
        //myDoublyLinkedList.getLength();

        //myDoublyLinkedList.printList();

        //append
        //DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        //myDoublyLinkedList.append(2);
        //myDoublyLinkedList.printList();

        //removelast
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        myDoublyLinkedList.append(2);
        myDoublyLinkedList.append(3);
        myDoublyLinkedList.printList();
        System.out.println();
        System.out.println(myDoublyLinkedList.removeLast().value);
        System.out.println(myDoublyLinkedList.removeLast().value);
        System.out.println(myDoublyLinkedList.removeLast().value);
        myDoublyLinkedList.printList();
    }
}
