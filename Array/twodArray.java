package arrays;
import java.util.Scanner;
public class twodArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        int colss=sc.nextInt();
        int a[][]=new int[rows][colss];
        for(int i=0;i<rows;i++){
            for(int j=0;j<colss;j++){
           a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < colss; j++) {
          System.out.println(a[i][j]);
            }
        }
    }
}
