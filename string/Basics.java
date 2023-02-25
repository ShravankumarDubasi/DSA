package string;

public class Basics {
    public static void main(String[] args){
        char name[]="sravan".toCharArray();
        char name1[]=new char[10];
//        String name1="";
//        char a[];
//       int  w=name.length();
//       String name1="" ;
//       name1=name.substring(0,5);
//       String name2=new String("sravann");
//        System.out.println(name==name2);
//      System.out.print(name.charAt(0)+" ");
//        System.out.print(name.length());
//       System.out.print(name.substring(1));
//        System.out.print(name.substring(0,0));
//        System.out.print(name.contains("d"));
//        System.out.print(name.equals(name2));
//        System.out.print(name.isEmpty());
//          System.out.print(name.concat(name2));
//     System.out.print(name.replace('S','d'));
//        System.out.print(name.toLowerCase());
//        System.out.print(name.toUpperCase());
//        System.out.print(name.trim());
        //System.out.print(name.indexOf("d"));
//        System.out.println("\n"+name1);
//        if(name1.charAt(0)=='a'){
  int index=0;
        for(int i=0;i<name.length;i++){
//            System.out.println(name[i]+" ");
            for(int j=0;j<i;j++){
                if(name[i]==name[j]){
                    break;
                }
                if(i == j){
//                    name1.concat(name.substring(i,i+1));
//                    name1[index]=name[i];
//                    index++;
                    System.out.println(name[i]);
                }
            }
        }

//   System.out.println(name1);
        }
//
    }
//}
//    int i=A.length()-1;
//    String a="";
//        while(i>=0){
//                int j=i;
//                while(i>=0&&A.charAt(i)==' ')i--;
//                // while(i>=0&&A.charAt(i)==':')i--;
//                // while(i>=0&&A.charAt(i)==',')i--;
//                while(i<0)break;
//        while(i>=0&&A.charAt(i)!=' ')i--;
//        // while(i>=0&&A.charAt(i)!=':')i--;
//        // while(i>=0&&A.charAt(i)!=',')i--;
//
//        a=a.concat(A.substring(j,i+1));
//
//        }
//        if(A.equals(a)){
//        return 1;
//        }
//        else{
//        return 0;
//        }
