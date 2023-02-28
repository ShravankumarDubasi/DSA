package DSA;

import java.util.Arrays;

public class seiveOfEratosthenes {
    public static void main(String args[]){
boolean[] arr1=isPrime(20);
for(int i=0;i<=20;i++){
    System.out.println();
    System.out.println(i+" "+arr1[i]);
}

    }
    static boolean[] isPrime(int n){

        boolean[] arr=new boolean[n+1];

        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;

        for(int i=2;i*i<=n;i++){

            for(int j=2*i;j<n;j+=i){
                arr[j]=false;
            }
        }


        return arr;

    }
}
