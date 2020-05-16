public class leetcode_326 {
    public static void main(String[] args) {
        boolean powerOfThree = isPowerOfThree(27);
        System.out.println("powerOfThree:"+powerOfThree);
    }

    public static  boolean isPowerOfThree(int n) {
        int m=0;
        while(n>1){
            m=n%3;
            System.out.println("m:"+m);
            n=n/3;
            System.out.println("n:"+n);
            if(m!=0){
                return false;
            }
        }
        return true;
    }
}
