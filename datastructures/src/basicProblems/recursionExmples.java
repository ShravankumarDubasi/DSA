package DSA;

public class recursionExmples {

    public static void main(String args[]){
        System.out.println(noOfWaysMatrix(3,3));
        System.out.println(josephus(5,3));
    }
    static int noOfWaysMatrix(int n,int m){
        if(n==1||m==1){
            return 1;
        }
        return noOfWaysMatrix(n-1,m)+noOfWaysMatrix(n,m-1);
    }
    static int josephus(int n,int k){
        if(n==1){
            return 0;
        }
        return (josephus(n-1,k)+k)%n;
    }
}
