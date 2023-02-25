package recursion;

public class MainClass {
    public static void main(String[] args){
        int a[][]={{1,2,3},
                {2,3,3},
                {3,3,3}

        };
        FloodFill(a,2,2,4,3);
        Print(a,3,3);

    }
    public static  void FloodFill(int a[][],int r,int c,int toFill,int toPrev){
         int rows=a.length;
         int cols=a[0].length;
         if(r<0||c<0||r>=rows||c>=cols){
             return;
         }
         if(a[r][c]!=toPrev){
             return;
         }
         a[r][c]=toFill;
         FloodFill(a,r-1,c,toFill,toPrev);
         FloodFill(a,r+1,c,toFill,toPrev);
         FloodFill(a,r,c-1,toFill,toPrev);
         FloodFill(a,r,c+1,toFill,toPrev);
    }
   static  void Print(int a[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
