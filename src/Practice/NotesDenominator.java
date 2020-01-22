package Practice;

import java.util.Scanner;

public class NotesDenominator {
    public static int notesfind(int n) {
        if(n<=0)
            return 0;
        int arr[] = {1, 3, 5, 7,9,11};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return 1;
        }
        int ct = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
            {
                if(arr[i]<n)
                {
                    int ct2 = 1+notesfind(n - arr[i]);
                    if(ct2<ct)
                    {
                        ct= ct2;
                    }
                }
            }
        return ct;

    }


    public static void main(String[] args) {
        System.out.println("Enter the number of which to find number of notes");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int notes = notesfind(n);
        System.out.println("Number of minimum number of notes are "+notes);
    }
}
