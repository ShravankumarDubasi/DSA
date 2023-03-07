package encapsulations;

public class Student {
   private int age;
   private String name;
   public int getAge(){
       return age;
   }
   public void setAge(int age) {
       if (age > 25) {
           System.out.println("age is more");
       } else {
           this.age = age;
       }
   }

}
