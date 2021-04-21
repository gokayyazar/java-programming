package Replit.Methods;
import java.util.Arrays;
import java.util.Scanner;

public class SwitchElements
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        System.out.println(Arrays.toString(do_switch(arr)));

    }
    public static int[] do_switch(int[] i)
    {
        int temp= i[i.length-1];
        i[i.length-1]=i[0];
        i[0]=temp;
        return i;
    }
}

/*
Implement the do_switch method
Switch the last element in an array with the first and return the array.

Examples:

do_switch([1,2,3,4])

returns:[4,2,3,1]
 */