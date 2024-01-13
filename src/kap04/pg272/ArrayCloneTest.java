package kap04.pg272;

import java.util.Arrays;

public class ArrayCloneTest {
    public static void main(String[] args){
        int[] num1 = {1, 3, 5, 7};
        int[] num2 = num1.clone();

        // Print
        System.out.print("num1: "); prt(num1);
        System.out.print("num2: "); prt(num2);
        System.out.println("Compare Array: " + num1.equals(num2));
        System.out.println("Compare Array-values: " + EqualArrayItem(num1, num2));

        System.out.println();
        num2[2] = 14;

        System.out.print("num1: "); prt(num1);
        System.out.print("num2: "); prt(num2);
        System.out.println("Compare Array: " + num1.equals(num2));
        System.out.println("Compare Array-values: " + EqualArrayItem(num1, num2));

    }
    public static void prt(int[] value){
        if(value != null){
            for(int x : value){
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
    public static boolean EqualArrayItem(int[] ar1, int[] ar2){
        return Arrays.equals(ar1, ar2);
    }
}
