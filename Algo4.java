public class Algo4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int count = nums.length ;
        int temp ;
        for(int i = 0 ; i < nums.length ; i++){
            count-- ;
            temp = nums[i] ;
            nums[i] = nums[count] ;
            nums[count] = temp ;
            if(count==i) break ;    
        }
        System.out.print("[");
        for(int i =0 ; i < nums.length ; i++){
            System.out.print(nums[i] + ",");
        }
        System.out.print("\b" + "]" + "\n");
    }
}
