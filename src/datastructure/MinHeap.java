package datastructure;

import java.util.Scanner;

public class MinHeap {
    private int []Heap;
    private int size;
    private int maxsize;
    private static final int FRONT = 1;
    public MinHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[maxsize+1];
        Heap[0] = Integer.MIN_VALUE;
    }
    private boolean isLeaf(int pos)
    {
        if((pos>=(size/2)) && (pos<=size))
        {
            return true;
        }
        return false;
    }
    private int parent(int pos)
    {
        return pos/2;
    }
    private int leftchild(int pos)
    {
        return 2*pos;
    }
    private int rightchild(int pos)
    {
        return 2*pos + 1;
    }
    public void swap(int fpos,int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos]=Heap[spos];
        Heap[spos]=tmp;
    }
    public void minHeapify(int pos)
    {
        if(!isLeaf(pos))
        {
            if((Heap[pos]>Heap[leftchild(pos)]) || (Heap[pos]>Heap[rightchild(pos)]))
            {
                if(Heap[pos]>Heap[leftchild(pos)])
                {
                    swap(pos,leftchild(pos));
                    minHeapify(leftchild(pos));
                }
                else
                {
                    swap(pos,rightchild(pos));
                    minHeapify(rightchild(pos));
                }
            }
        }
    }
    public void minHeap()
    {
        for(int pos= (size/2);pos>=1;pos--)
        {
            minHeapify(pos);
        }
    }
    public void insert(int element)
    {
        if(size>=maxsize)
            return;
        Heap[++size]=element;
        int current = size;
        while (Heap[current]<Heap[parent(current)])
        {
            swap(current,parent(current));
            current=parent(current);
        }

    }
    public void print()
    {
        for(int i=1;i<=size;i++)
            System.out.println(Heap[i]);
    }
    public static void main(String args[])
    {
        int arr[] = {10,85,12,6,7,15};
        Scanner sc = new Scanner(System.in);
        MinHeap minHeap = new MinHeap(15);

        for(int i=0;i<arr.length;i++)
        {
                minHeap.insert(arr[i]);
        }
        minHeap.print();
        minHeap.minHeap();
        System.out.println("minheap after heapify");
        minHeap.print();
    }
}
