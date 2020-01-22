package Patternprinting;

import java.util.Scanner;

public class GaneshaPattern {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("*");
        for(int i=0;i<(n-3)/2;i++)
        {
            System.out.print(" ");
        }
        for(int i=0;i<(n+1)/2;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        // Section 2
        for(int i=0;i<(n-3)/2;i++)
        {
            System.out.print("*");
            for(int j=0;j<(n-3)/2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

        }
        // Section 3
        for(int i=0;i<n;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        // Section 4
        for(int i=0;i<(n-3)/2;i++)
        {
            for(int j=0;j<(n-1)/2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<(n-3)/2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        // Section 5
        for(int i=0;i<(n+1)/2;i++)
            System.out.print("*");
        for(int i=0;i<(n-3)/2;i++)
            System.out.print(" ");
        System.out.print("*");
        System.out.println();
    }
}
