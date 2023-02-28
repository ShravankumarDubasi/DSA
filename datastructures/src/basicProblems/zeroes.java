package DSA;

public class zeroes {
   public static void main(String args[]){
       int[] arr={0,0,0,5};
       moveZeroes(arr);
   }
        public static void moveZeroes(int[] nums) {
            int snowBallSize = 0;
            for (int i=0;i<nums.length;i++){
                if (nums[i]==0){
                    snowBallSize++;
                }
                else if (snowBallSize > 0) {
                    int t = nums[i];
                    nums[i]=0;
                    nums[i-snowBallSize]=t;
                }
            }
            for(int i=0;i<nums.length;i++){
                System.out.println(nums[i]);
            }


        }

}
