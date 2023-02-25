package string;

public class Splitt {
    public static void main(String[] args){

        String cars="volkswagen Rr Dzire";
        String allcars[]=cars.split(" ");
        for(String a:allcars){
            System.out.println(a);
        }
    }
}

