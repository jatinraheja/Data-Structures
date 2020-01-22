package datastructure;

public class LinkedListMergeSort {
    node head = null;
    static class node {
        int data;
        node next;
        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public  void push(int data)
    {
        node newdata = new node(data);
        newdata.next = head;
        head=newdata;
    }
    node sortedMerge(node a, node b)
    {
        if(a == null)
            return b;
        if(b==null)
            return a;
        node result = null;
        if(a.data<b.data)
        {
            result = a;
            result.next = sortedMerge(a.next,b);
        }
        else
        {
            result = b;
            result.next = sortedMerge(a,b.next);
        }
        return result;
    }
    public node mergeSort(node h)
    {
        if( h==null || h.next==null)
            return h;
        node middle = getmiddle(h);
        node nextofmiddle = middle.next;
        middle.next=null;
        node left = mergeSort(h);
        node right = mergeSort(nextofmiddle);
        node sortedList = sortedMerge(left,right);
        return sortedList;
    }
    public static node getmiddle(node h)
    {
        if (h == null)
            return h;
        node slow = h;
        node fast = h;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }
    public void printList(node h)
    {
        while(h!=null)
        {
            System.out.println(h.data+" ");
            h=h.next;
        }
    }
    public static void main(String args[])
    {
        LinkedListMergeSort li = new LinkedListMergeSort();
        li.push(30);
        li.push(2);
        li.push(1);
        li.push(15);
        li.push(25);
        li.head = li.mergeSort(li.head);
        System.out.println("Sorted Linked List is ");
        li.printList(li.head);
    }

}
