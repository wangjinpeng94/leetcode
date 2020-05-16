import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class leetcode_414 {
    public static void main(String[] args) {
        int [] s={2,4,8,1,5};
        int [] s1={2,2,2,2,5};
        int [] s2={1,1,1,1,1};
        int [] s3={1};
        int [] s4={1,1,2};
        int [] s5={1,2,-2147483648};
        int [] s6={3,2,1};

        int i = thirdMax1(s6);
        System.out.println("i:"+i);
    }
    public static int thirdMax(int[] nums) {
        if(nums.length==0){
            return nums[0];
        }
        if(nums.length==2
        ){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }

        Set<Integer> hset=new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            hset.add(nums[i]);
        }
        System.out.println("hset.size():"+hset.size());
       int  result =0;
        int []nn=new int[hset.size()];
        Iterator<Integer> iterator = hset.iterator();
        int y=0;
      while(iterator.hasNext()){
          int item=(int)iterator.next();
          nn[y]=item;
          y++;
      }
        if(hset.size()>=3){

//            Integer [] array = (Integer[]) hset.toArray();
            Arrays.sort(nn);
            result = nn[nn.length - 3];

        }else if(hset.size()==2){
//            Integer [] array = (Integer[]) hset.toArray();
            Arrays.sort(nn);
            result = nn[1];
        }else{
         //   Integer [] array = (Integer[]) hset.toArray();
            result=nn[0];
        }

        return  result;

    }



    //3n解法
    public static int thirdMax1(int[] nums) {
        if(nums.length==0){
            return nums[0];
        }
        if(nums.length==2
        ){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);

        }
        int a=max;
        System.out.println("a:"+a);
        System.out.println("max:"+max);

//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==max){
//                nums[i]=Integer.MIN_VALUE;
//            }
//
//        }


        int max1=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==a){
                continue;
            }
            max1=Math.max(max1,nums[i]);

        }
        int b=max1;
//        if(a==b){
//            System.out.println("a == b:"+a );
//            return a;
//        }
        System.out.println("b:"+b);

//        for(int i=0;i<nums.length;i++){
//
//            if(nums[i]==max1){
//                nums[i]=Integer.MIN_VALUE;
//            }
//
//        }




        int max2=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==a||nums[i]==b){
                continue;
            }
            max2=Math.max(max2,nums[i]);

        }
        int c=max2;

        int result=a;
        boolean flag=false;
        if(max2==Integer.MIN_VALUE){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==Integer.MIN_VALUE) {
                   result=nums[i];
                   flag=true;

                }
            }
            return  result;
        }


return max2;
    }
}
