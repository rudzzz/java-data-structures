package DynamicArray;

public class Main {
    public static void main(String[] args){
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        //dynamicArray.insert(0, "X");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");
       // System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());
    }
}
