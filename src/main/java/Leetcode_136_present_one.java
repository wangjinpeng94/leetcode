public class Leetcode_136_present_one {
    public  static int singleNumber(int [] nums){
        int result=0;
        for (int i=0;i<nums.length;i++){
            result ^=nums[i];
            System.out.println(result);
        }
       return result;
    }
    public static void main(String[] args) {
        int [] nums={4,4,6,1,3,3,1,6,2};
        int i = Leetcode_136_present_one.singleNumber(nums);
        System.out.println("singleNumber:"+i);
    }
}
