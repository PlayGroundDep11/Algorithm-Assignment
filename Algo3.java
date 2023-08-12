public class Algo3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] oppositeNums = new int[nums.length] ; 
        int count1 = oppositeNums.length  ;
        for(int i = 0 ;i < nums.length ; i++){
            count1--;
            oppositeNums[count1] = nums[i] ;

        }
        nums = oppositeNums ;
        System.out.print("[");
        for(int i = 0 ;i < nums.length ; i++){
            System.out.print(nums[i]+",");
        }
        System.out.print("\b"+"]");
    }
}
