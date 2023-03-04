package StaticArray;
import java.util.Scanner;

public class StaticArray {
    public static void main(String[] args){
        String[] names = new String[5];
        names[0] = "Acir";
        names[1] = "Pedro";
        names[2] = "Roberto";
        names[3] = "Carlos";
        names[4] = "Brad";

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
