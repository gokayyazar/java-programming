package Replit.Methods;

import java.util.Scanner;

public class ReturnMax
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));


    }

    public static int max(int x, int max)
    {
        if (x>max)
        {
            return x;
        }
        else  if (max>x)
        {
            return max;
        }
        else
        {
            return x;
        }
    }
}
/*
Finish the method max which has two parameters, x and max.

if x is bigger than max return x
if max is bigger than x return max
all other cases return x

 */