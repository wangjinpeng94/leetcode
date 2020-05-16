package sort;

public class choose {
    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 4, 9, 2, 1, 6, 7};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public  static  void sort(int [] array){
        //记录当前趟数的最大值的角标
        int pos;
        //交换的变量
        int temp;
        //外层循环控制需要排序的趟数
        for (int i = 0; i < array.length; i++) {
            //新的趟数。将角标重新赋值为0
            pos=0;
            //内层循环控制遍历数组的个数并得到最大数的角标
            for (int j = 0; j < array.length-i; j++) {
                if(array[j]>array[pos]){
                    pos=j;
                }

            }
            //交换
            temp=array[pos];
            array[pos] = array[array.length - i - 1];
            array[array.length-1-i]=temp;


        }
    }
}
