package sort;

public class insert {
    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 4, 9, 2, 1, 6, 7};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public  static void sort(int [] array){
        //临时变量
        int temp;
        //外层循环控制需要排序的趟数，从1开始因为将第0位看成了有序数据
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            //如果前一位已排序的数据比当前数据要打，呢么就进入循环比较
            int j=i-1;
            while (j>=0&&array[j]>temp){
                //往后退一个位置，让当前数据与之前的前位比较
                array[j + 1] = array[j];
                //不断往前，直到退出循环
                j--;
            }
            //退出了循环说明找到了合适的位置，将当前数据插入合适的位置中
            array[j+1]=temp;

        }
    }
}
