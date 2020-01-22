package Sorting;

import java.util.Scanner;

public class mergesort {
    static void merge(int []arr,int s,int m,int e)
    {
        int n1 = m-s+1;
        int n2 = e-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0;i<n1;i++)
            L[i]=arr[s+i];
        for(int j=0;j<n2;j++)
            R[j]=arr[m+1+j];
        int i=0,j=0;
        int k=s;
        while(i<n1 && j<n2)
        {
            if(L[i]<R[j])
            {
                arr[k] = L[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = L[j];
            j++;
            k++;
        }
    }
   static void mergeSort(int []arr,int l,int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements in an array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        mergeSort(arr,0,n-1);
        System.out.println("Array after merge sort is");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
