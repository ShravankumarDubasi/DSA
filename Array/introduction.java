package arrays;


import java.util.Arrays;
import java.util.Scanner;
public class introduction {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int[] marks=new int[n];
        int a[]=new int[n];

         System.out.println("enter marks");
        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();

          }
        int count=1,max_count=0,low =0;
        Arrays.sort(marks);

        int res=1;
        for(int i=1;i<n;i++){
            if(marks[i]!=marks[res-1]){
                marks[res]=marks[i];
                res++;
            }
        }

        for(int i=1;i<res;i++){
            if(marks[i]==marks[low]+1){
                count++;
                low=i;
            }
            else{
                low=i;
                count=1;
            }
            if(count>max_count){
                max_count=count;
            }
        }
        System.out.println( max_count);







    }
}
