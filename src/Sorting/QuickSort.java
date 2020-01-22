package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {41,12,5,10,42};

        int up = arr.length - 1;
        quicksort(arr,0,up);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

    }
    static void quicksort(int arr[],int low , int up)
    {
        if(low<up)
        {
            int loc = partition(arr,low,up);
            quicksort(arr,low,loc-1);
            quicksort(arr,loc+1,up);
        }
    }
    static int partition(int a[],int lb, int ub)
    {
        int pi = a[ub];
        int i = (lb - 1);
        int j=0;
//        int start = lb;
//        int end = ub;
//        while (start<end)
//        {
//            while(a[start]<=pivot && start<end)
//            {
//                start=start+1;
//            }
//            while (a[end]>pivot)
//            {
//                end = end -1;
//            }
//            if(start<end)
//            {
//                int temp = a[start];
//                a[start]=a[end];
//                a[end]=temp;
//            }
//        }
//        a[lb]=a[end];
//        a[end]=pivot;
//        return end;
        for(j=lb;j<ub;j++)
        {
            if(a[j]<pi)
            {
                i++;
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = pi;
        a[ub]=temp;
        return i+1;
    }
}
