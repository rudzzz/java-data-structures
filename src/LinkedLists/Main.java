package LinkedLists;

public class Main {
   public static void main(String[] args){
        //append
       //LinkedList myLinkedList = new LinkedList(1);
       //myLinkedList.append(2);
       //myLinkedList.printList();

       //remove
       //System.out.println(myLinkedList.removeLast().value);
       //System.out.println(myLinkedList.removeLast().value);
       //System.out.println(myLinkedList.removeLast());

       //prepend
       //LinkedList myLinkedList = new LinkedList(2);
       //myLinkedList.append(3);
       //myLinkedList.prepend(1);
       //myLinkedList.printList();

       //remove first
      LinkedList myLinkedList = new LinkedList(2);
      myLinkedList.append(1);
      System.out.println(myLinkedList.removeFirst().value);
      System.out.println(myLinkedList.removeFirst().value);
      System.out.println(myLinkedList.removeFirst());
   }
}
