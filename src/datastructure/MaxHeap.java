package datastructure;

import java.util.Scanner;

public class MaxHeap {

       static int max = 100;
       static int n=0;
    public static void heapify(int arr[],int n,int i)
    {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && arr[l]<arr[largest])
            largest=l;
        if(r<n && arr[r]<arr[largest])
            largest=r;
        if(largest!=i)
        {
            int swap = arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            heapify(arr,n,largest);
        }
    }
    public static void sort(int arr[],int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
        System.out.println("Heap After sorting is");
        print(arr,n);

    }
    public static void buildheap(int arr[],int n)
    {
        int startIdx = (n/2)-1;
        for(int i=startIdx;i>=0;i--)
            heapify(arr,n,i);
        System.out.println("Heap is");
        print(arr,n);
    }
    static void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
    static int insertheap(int arr[],int n,int key)
    {
        n=n+1;
        arr[n-1]=key;
        buildheap(arr,n);
        return n;
    }
    static void deleteheap(int arr[],int n)
    {
        arr[0]=arr[n-1];
        n=n-1;
        buildheap(arr,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to insert into heap");
        int n = sc.nextInt();
        int arr[]=new int[max];
        System.out.println("Enter elements to insert into heap");
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        buildheap(arr,n);
//        System.out.println("Enter new element to insert into heap");
//        int num = sc.nextInt();
//        n=insertheap(arr,n,num);
        //deleteheap(arr,n);
       sort(arr,n);
    }
}
