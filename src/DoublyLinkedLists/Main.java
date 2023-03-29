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
        //DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        //myDoublyLinkedList.append(2);
        //myDoublyLinkedList.append(3);
        //myDoublyLinkedList.printList();
        //System.out.println();
        //System.out.println(myDoublyLinkedList.removeLast().value);
        //System.out.println(myDoublyLinkedList.removeLast().value);
        //System.out.println(myDoublyLinkedList.removeLast().value);
        //myDoublyLinkedList.printList();

        //prepend
        //DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(2);
        //myDoublyLinkedList.append(3);
        //myDoublyLinkedList.prepend(1);
        //myDoublyLinkedList.printList();

        //removeFirst
        //DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        //myDoublyLinkedList.append(2);
        //myDoublyLinkedList.append(3);
        //myDoublyLinkedList.removeFirst();
        //myDoublyLinkedList.printList();

        //get
        //DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(0);
        //myDoublyLinkedList.append(1);
        //myDoublyLinkedList.append(2);
        //myDoublyLinkedList.append(3);
        //System.out.println(myDoublyLinkedList.get(1).value);
        //System.out.println(myDoublyLinkedList.get(2).value);

        //set
        //DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(0);
        //myDoublyLinkedList.append(1);
        //myDoublyLinkedList.append(2);
        //myDoublyLinkedList.append(3);
        //System.out.println(myDoublyLinkedList.set(2, 3));
        //myDoublyLinkedList.printList();

        //insert
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        myDoublyLinkedList.append(3);
        myDoublyLinkedList.printList();
        System.out.println();
        myDoublyLinkedList.insert(1, 2);
        myDoublyLinkedList.printList();
    }
}
