package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class removingDuplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("enter marks");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);


        int res=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }

        for(int i=0;i<res;i++)
        {
            System.out.println(arr[i]);

        }

    }
}
