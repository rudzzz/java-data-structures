package Stacks;

public class Main {
    public static void main(String[] args){
        // create a new Stack
        //Stack myStack = new Stack(2);
        //myStack.getTop();
        //myStack.getHeight();
        //myStack.printStatck();

        // push
        //Stack myStack = new Stack(2);
        //myStack.push(1);
        //myStack.printStatck();

        //pop
        Stack myStack = new Stack(7);
        myStack.push(23);
        myStack.push(3);
        myStack.push(11);
        myStack.printStatck();

        System.out.println();
        myStack.pop();
        myStack.printStatck();
    }
}
