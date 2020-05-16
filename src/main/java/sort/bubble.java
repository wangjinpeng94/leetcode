package sort;

public class bubble {
    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 4, 9, 2, 1, 6, 7};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static  void sort(int [] array){
        //装载临时变量
        int temp;
        //记录是否发生了置换，0表示没有发生置换，1表示发生了置换
        int isChange;
        //记录执行了多少遍
        int num=0;
        //外层循环是排序的趟数
        for (int i = 0; i <array.length-1 ; i++) {
            //每一趟就重新初始化为0
            isChange=0;
            //内层循环是当前趟数需要比较的次数
            for (int j = 0; j <array.length-i-1 ; j++) {
                //前一位与后一位比较，如果前一位比后一位大，那么交换
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j] = array[j + 1];
                    array[j+1]=temp;
                    //如果进入到这里面了说明发生了置换了
                    isChange=1;
                }

            }
            //如果比较完一趟没有发生置换，那么说明已经排好序了，不需要再执行下去了
            if(isChange==0){
                break;
            }
            num++;

        }
    }
}
