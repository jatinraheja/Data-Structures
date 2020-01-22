package datastructure;

import java.util.Scanner;

public class warshalalgo {
    public static void print(int arr[][],int v,int k)
    {
        System.out.println("Matrix after value of k is "+k);
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertex in the matrix");
        v = sc.nextInt();
        int arr[][] = new int[v][v];
        System.out.println("Enter values of matrix");

        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
               arr[i][j]=sc.nextInt();
            }
        }
        print(arr,v,-1);
        for(int k=0;k<v;k++)
        {
            for(int j=0;j<v;j++)
            {
                for(int i=0;i<v;i++)
                {
                    if(arr[j][k]!=0 && arr[k][i]!=0)
                    {
                        arr[j][i]=arr[j][k] & arr[k][i];
                    }
                }
            }
            print(arr,v,k);
        }

    }
}
