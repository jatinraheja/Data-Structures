package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class HashingLinkedList {
    LinkedList<Integer> head[]=new LinkedList[5];
    HashingLinkedList()
    {
        for(int i=0;i<5;i++)
        {
            head[i]=new LinkedList<Integer>();
//            head[i].add(-999);
        }
    }
    void insertfunc(int loc,int num)
    {
        head[loc].add(num);

    }

     int hashing(int num)
    {
        if(num%2==0)
        {

        }
        int loc = num%5;
        return loc;
    }
    void print()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Elements at position "+i+"are ");
            Iterator<Integer> itr = head[i].iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashingLinkedList hll = new HashingLinkedList();
        System.out.println("Enter number of elements to insert in the array");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            int loc = hll.hashing(num);
            hll.insertfunc(loc, num);
        }
        hll.print();
    }
}
