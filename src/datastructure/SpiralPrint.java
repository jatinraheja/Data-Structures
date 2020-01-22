package datastructure;

import java.util.Scanner;

public class SpiralPrint {
    public static void spiralprint(int R,int C,int arr[][])
    {
        int l=0;
        int k=0;
        int i=0;
        while(k<R && l<C)
        {
            for(i=l;i<C;i++)
            {
                System.out.print(arr[k][i]+" ");
            }
            k++;
            for(i=k;i<R;i++)
            {
                System.out.print(arr[i][C-1]+" ");
            }
            C--;
            if(k<R)
            {
                for(i=C-1;i>=l;i--)
                {
                    System.out.print(arr[R-1][i]+" ");
                }
                R--;
            }
            if(l<C)
            {
                for (i=R-1;i>=k;i--)
                {
                    System.out.print(arr[i][l]+" ");
                }
                l++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in matrix");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns in matrix");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter elements of array");
        for(int i=0;i<rows;i++)
        {
            for (int j = 0;j<cols;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        spiralprint(rows,cols,arr);
    }
}
