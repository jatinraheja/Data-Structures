package datastructure;

import java.util.Scanner;

public class Hashing {
    static int locations[];
    static void locations(int l)
    {
        locations = new int[l];
        for(int i=0;i<l;i++)
            locations[i]=-1;
    }
    static int findprime(int num)
    {
        int flag =1;
        while(num>0)
        {
            int num2 = num;
            for(int i=2;i<num2/2;i++)
            {
                if(num2%i==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==0)
            {
                num--;
                continue;
            }
            else
            {
                break;
            }
        }
        return num;
    }
    static void hashing(int num,int prime,int noofloc)
    {
        int loc = num%prime;
        int nloc = loc;
        if(collision(loc))
        {
            nloc++;
        }
        if(nloc<=noofloc)
        {
            if(!collision(nloc))
            {
                locations[nloc] = num;

            }
            else
            {
                QP(num,loc-1);
            }
        }
        if(loc>noofloc)
        {
            loc=loc%10;
        }
    }
    static void QP(int num,int loc)
    {

    }
    static boolean collision(int loc)
    {
        if(locations[loc]==(-1))
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of locations in array");
        int l= sc.nextInt();
        locations(l);
        System.out.println("Enter number of elements to store in an array");
        int n = sc.nextInt();
        int prime = findprime(n);
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            hashing(num,prime,l);
        }

    }
}
