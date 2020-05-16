public class 面试题1616部分排序 {
    public static void main(String[] args) {
        int [] s={5,3,1,7,9};
        int[] ints = subSort(s);
        System.out.println("ints[0]:"+ints[0]);
        System.out.println("ints[1]:"+ints[1]);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }

        public  static int[] subSort(int[] array) {

            int s=0;
            int e=array.length;
            int [] r=new int[]{-1,-1};
            if(array.length==1||array.length==0){
                return r;
            }



            boolean b=isAddition(array);
            if(b){
                return r;
            }
            for(int i=0;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    s=i;//左边开始下降的点
                    break;
                }
            }
            System.out.println("s:"+s);

            //     for(int i=0;i<array.length-1;i++){
            //     if(array[i]>=array[s+1]){
            //         s=i;
            //         break;
            //     }
            // }
            for(int i=array.length-1;i>0;i--){

                if(array[i]<array[i-1]){
                    e=i;//右边开始下降的点
                    break;


                }
            }
            System.out.println("e:"+e);
            //找出两个极值点之间的最大值和最小值
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=s;i<=e;i++){
                max=Math.max(max,array[i]);
                min=Math.min(min,array[i]);

            }
            System.out.println("max:"+max);
            System.out.println("min:"+min);

//找到左边小于极值的index位置
            int sIndex=0;
            for(int i=0;i<=s;i++){
                if(array[i]>=min){
                    sIndex=i;//左边点
                    break;
                }
            }
            System.out.println("sIndex:"+sIndex);
            //找到右边的点
            int eIndex=0;
            for(int i=array.length-1;i>=e;i--){
                if(array[i]<=max){
                    eIndex=i;//左边点
                    break;
                }
            }

            System.out.println("eIndex:"+eIndex);



            if(sIndex!=eIndex){
                r[0]=sIndex;
                r[1]=eIndex;
            }
            return r;
        }
        public static boolean isAddition(int [] s){
            int n=0;
            for(int i=0;i<s.length-1;i++){
                if(s[i+1]>s[i]){
                    n++;
                }
            }
            if(n==s.length-1){
                return true;
            }
            return false;
        }

}
