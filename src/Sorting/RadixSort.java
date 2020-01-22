package Sorting;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int arr[] = {414,122,555,1000,4295,156,21,85};
        radixsort(arr,arr.length);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    public static void radixsort(int arr[],int n)
    {
        int maxdata = maxdata(arr,n);
        for(int exp=1;maxdata/exp>0;exp=exp*10)
        {
                countsort(arr,n,exp);
        }

    }
    public static int maxdata(int arr[],int n)
    {
        int max=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static void countsort(int arr[],int n,int exp)
    {
        int count[]=new int[10];
        Arrays.fill(count,0);
        for(int i=0;i<n;i++)
        {
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++)
            count[i]=count[i]+count[i-1];
        int output[] = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++)
            arr[i]=output[i];
    }

}
